---
---
INCLUDE "gbhw.inc"              ;include definitions because I'm a lazy bum
_SPR0_Y     EQU     _OAMRAM     ;constants for the sprite's OAM because I'm still lazy
_SPR0_X     EQU     _OAMRAM+1   ;more OAM constants
_SPR0_NUM   EQU     _OAMRAM+2   ;more
_SPR0_ATT   EQU     _OAMRAM+3   ;don't even need this one because I won't be working with it but why not
_PAD        EQU     _RAM        ;joypad variable goes in regular RAM
 
;program start
SECTION "i_like_cheese",HOME[$0100]
    nop                         ;NO OPERATION
    jp      cow_says_moo        ;go to the real program start

;boring ROM header stuff because I want the game to actually work
    ROM_HEADER  ROM_NOMBC, ROM_SIZE_32KBYTE, RAM_SIZE_0KBYTE

;the REAL program start
cow_says_moo:
    nop                         ;NOP
    di                          ;Disable Interrupts
    ld      sp, $FFFF           ;LoaD the top of RAM to the stack

;some more initial settings
potato_salad:
    ld      a, %11100100        ;use the normal palette because we want normal colours
    ld      [rBGP], a           ;and put it in the background palette register
    ld      a, %11010010        ;use this palette for sprites because I want white in them
    ld      [rOBP0], a          ;store in the the sprite (object, OBJ) palette register

    ld      a, 0                ;0, that's right captain feathersword,
    ld      [rSCX], a           ;we need to put 0 in the accumulator register for
    ld      [rSCY], a           ;the window scroll positions!

    call    strawberry_jam      ;for whatever reason I need to turn off the LCD

    ld      hl, Tiles           ;sprite(tm) (and background)
    ld      de, _VRAM           ;get the VRAM address in de
    ld      b, EndTiles-Tiles   ;b is the data counter, it counts how much data we need to transfer

.chair_cushion:
    ld      a, [hl]             ;data pointed to by hl goes into a (the tiles)
    ld      [de], a             ;put that data into address pointed to by de (the VRAM)
    dec     b                   ;one less byte of data to go
    jr      z, .walmart         ;if b is zero, go do the walmart subprocess
    ;if not:
    inc     hl                  ;go to the next byte of data
    inc     de                  ;go to the next byte in VRAM
    jr      .chair_cushion      ;loop
.walmart:
    ;fill the background map with tile 0 (the background tile)
    ld      hl, _SCRN0          ;background map
    ld      de, 32*32           ;background map is 32x32 tiles

.z_dash_niner_niner:
    ld      a, 0                ;tile 0
    ld      [hl], a             ;into _SCRN0
    dec     de                  ;counter - 1
    ;the 16-bit dec operation doesn't affect the flags, so I need to check manually
    ld      a, d                ;1st (technically 2nd) half of de
    or      e                   ;logical or with 2nd (1st) half
    jp      z, .sleeping_foot   ;if they're both zero (from the or) then it's done
    ;if not:
    inc     hl                  ;next!
    jp      .z_dash_niner_niner ;loop
.sleeping_foot:
    ld      hl, _OAMRAM         ;next is the sprite data, which goes into OAM RAM
    ld      de, 40*4            ;40 sprites x 4 bytes of OAM
.tiger_fur:
    ld      a, 0                ;0th
    ld      [hl], a             ;goes into OAM RAM
    dec     de                  ;-1
    ;check if zero
    ld      a, d
    or      e
    jp      z, .black_and_white
    inc     hl
    jp      .tiger_fur
.black_and_white:
    ;make the sprite
    ld      a, 84               ;y position
    ld      [_SPR0_Y], a
    ld      a, 84               ;x position
    ld      [_SPR0_X], a
    ld      a, 1                ;tile number
    ld      [_SPR0_NUM], a
    ld      a, 0                ;special attributes
    ld      [_SPR0_ATT], a

    ;DISPLAY ACTIVATE
    ld      a, LCDCF_ON|LCDCF_BG8000|LCDCF_BG9800|LCDCF_BGON|LCDCF_OBJ8|LCDCF_OBJON
    ld      [rLCDC], a

;main loop
fabric_softener:
    call    cloudy_mason_jar    ;read the joypad input
;wait for VBlank
.knalbv_rof_tiaw:
    ld      a, [rLY]            ;get the coord for LCDC
    cp      145                 ;is it 145? (the screen is 144 lines, so 145 is off it)
    jr      nz, .knalbv_rof_tiaw ;if it's not 145, then waste another CPU cycle (loop)
    ;oh look, it's 145
    ld      a, [_PAD]           ;check the joypad
    and     %00010000           ;is it the right button?
    call    nz, stranded_wire   ;if it is, then go deal with that

    ld      a, [_PAD]
    and     %00100000           ;left
    call    nz, water_bottle

    ld      a, [_PAD]
    and     %01000000           ;up
    call    nz, boston_red_sox

    ld      a, [_PAD]
    and     %10000000           ;down
    call    nz, ham_sandwich

    ld      a, [_PAD]
    and     %00000001           ;A button
    call    nz, dirty_dog

    call    orange_ink          ;delay
    jr      fabric_softener     ;loop

;what's that? oh you pressed a button?
;right
stranded_wire:
    ld      a, 1                ;the left/right arrow sprite
    ld      [_SPR0_NUM], a
    ld      a, [_SPR0_ATT]
    res     5, a                ;no x flip, facing right
    ld      [_SPR0_ATT], a

    ld      a, [_SPR0_X]        ;get the sprite's x position
    cp      160                 ;is it on the edge?
    ret     z                   ;if it is, then forget it

    inc     a                   ;if it's not on the edge, then x goes up 1
    ld      [_SPR0_X], a        ;store the new position in OAM

    ret                         ;return
;left
water_bottle:
    ld      a, 1                ;the left/right arrow sprite
    ld      [_SPR0_NUM], a
    ld      a, [_SPR0_ATT]
    set     5, a                ;x flip, facing left
    ld      [_SPR0_ATT], a

    ld      a, [_SPR0_X]        ;get the sprite's x position
    cp      8                   ;is it on the edge?
    ret     z                   ;if it is, then forget it

    dec     a                   ;if it's not on the edge, then x goes down 1
    ld      [_SPR0_X], a        ;store the new position in OAM

    ret                         ;return
;up
boston_red_sox:
    ld      a, 2                ;the up/down arrow sprite
    ld      [_SPR0_NUM], a
    ld      a, [_SPR0_ATT]
    res     6, a                ;no y flip, facing up
    ld      [_SPR0_ATT], a

    ld      a, [_SPR0_Y]        ;get the sprite's y position
    cp      16                  ;is it on the edge?
    ret     z                   ;if it is, then forget it

    dec     a                   ;if it's not on the edge, then y goes down (up) 1
    ld      [_SPR0_Y], a        ;store the new position in OAM

    ret                         ;return
;down
ham_sandwich:
    ld      a, 2                ;the up/down arrow sprite
    ld      [_SPR0_NUM], a
    ld      a, [_SPR0_ATT]
    set     6, a                ;y flip, facing down
    ld      [_SPR0_ATT], a

    ld      a, [_SPR0_Y]        ;get the sprite's y position
    cp      152                 ;is it on the edge?
    ret     z                   ;if it is, then forget it

    inc     a                   ;if it's not on the edge, then y goes up (down) 1
    ld      [_SPR0_Y], a        ;store the new position in OAM

    ret                         ;return
;A button
dirty_dog:
    ld      a, [_SPR0_NUM]      ;I want to change the sprite tile, so get the tile number
    cp      3                   ;is it already 3?
    jr      z, .dirty_cat       ;if it's already 3, then it should be changed to 2, right?

    ld      a, 3                ;new tile number
    ld      [_SPR0_NUM], a      ;store it in sprite data

    call    orange_ink          ;delay because otherwise the change would look too fast and weird
    ret                         ;return
.dirty_cat:
    ld      a, 2                ;new tile number
    ld      [_SPR0_NUM], a

    call    orange_ink          ;wait a bit
    ret                         ;return

;read the joypad input
cloudy_mason_jar:
    ld      a, %00100000        ;read d-pad (you can only do either d-pad or buttons at a time
                                ;for some weird reason)
    ld      [rP1], a            ;tell the GameBoy that we want to read the d-pad
 
    ;do several readings to avoid "bouncing"
    ld      a, [rP1]
    ld      a, [rP1]
    ld      a, [rP1]
    ld      a, [rP1]

    and     $0F                 ;the readings are stored in the bottom 4 bits so we only need those
    swap    a                   ;swap upper and lower bits
    ld      b, a                ;store it in b

    ld      a, %00010000        ;read buttons
    ld      [rP1], a

    ;no bouncing allowed
    ld      a, [rP1]
    ld      a, [rP1]
    ld      a, [rP1]
    ld      a, [rP1]

    and     $0F                 ;top 4 bits are unused
    or      b                   ;I honestly don't know how this works because they're 8-bits
                                ;it probably works with each bit and I guess would combine the two
    cpl                         ;complement a
    ld      [_PAD], a           ;put it in the joypad variable
    ret                         ;return

;LCD shutdown?
strawberry_jam:
    ;not sure how this works or what is does
    ld      a, [rLCDC]
    rlca                        ;essentially set the high bit in the carry flag, not sure the purpose
    ret     nc                  ;not sure the purpose of this, but I think it goes back if the carry
                                ;is 0
.let_set:
    ld      a, [rLY]
    cp      145
    jr      nz, .let_set
    ;hey, it's 145
    ;not sure what this does either
    ld      a, [rLCDC]
    res     7, a
    ld      [rLCDC], a

    ret                         ;return
 
;delay
orange_ink:
    ld      de, 5000            ;the number of times to execute the loop
.yellow_ink:
    dec     de                  ;-1
    ld      a, d                ;is it zero?
    or      e
    jr      z, .ink_cartridge_empty
    nop
    jr      .yellow_ink         ;loop
.ink_cartridge_empty:
    ret

;tiles
Tiles:
    ;background tile
    DB  $00, $FF, $00, $FF, $00, $FF, $00, $FF
    DB  $00, $FF, $00, $FF, $00, $FF, $00, $FF
    ;sprite 1
    DB  $1C, $1C, $1E, $16, $FF, $F3, $FF, $81
    DB  $FD, $83, $FB, $F7, $16, $1E, $1C, $1C
    ;sprite 2
    DB  $3C, $3C, $76, $6E, $FB, $C7, $FD, $83
    DB  $FF, $E7, $3C, $24, $3C, $24, $3C, $3C
    ;sprite 3
    DB  $FF, $FF, $81, $FF, $BD, $C3, $BD, $C3
    DB  $BD, $C3, $BD, $C3, $81, $FF, $FF, $FF
EndTiles:
