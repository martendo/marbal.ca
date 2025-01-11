#!/usr/bin/env python3
"""
Create a colored ASCII representation of an image

Copyright (c) 2024 Martin Baldwin
SPDX-License-Identifier: MIT
"""
import argparse
import sys
from PIL import Image

CHARSET = "@QB#NgWM8RDHdOKq9$6khEPXwmeZaoS2yjufF]}{tx1zv7lciL/\\|?*>r^;:_\"~,'.-`"

def parse_argv(argv):
	p = argparse.ArgumentParser(description="create a colored ASCII representation of an image")
	p.add_argument("infile", help="image file to recreate")
	p.add_argument("outfile", help="HTML output file")
	p.add_argument("-s", "--scale", type=int, default=8, help="set number of pixels per character on x-axis, default 8 (double this value on y-axis)")
	p.add_argument("-r", "--reverse", action="store_true", help="invert colors")
	p.add_argument("-n", "--no-color", action="store_true", help="don't colorize output")
	p.add_argument("-c", "--character", type=str, help="use the specified string in all cells")
	p.add_argument("-p", "--no-parent", action="store_true", help="only output span elements for the picture; output will not be a standalone HTML file")
	return p.parse_args(argv[1:])

def main(argv=None):
	args = parse_argv(argv or sys.argv)

	im = Image.open(args.infile)
	rgb_im = im.convert("RGB")

	cell_width = args.scale
	cell_height = cell_width * 2
	width = int(im.width / cell_width)
	height = int(im.height / cell_height)

	res = ""
	if not args.no_parent:
		res += "<!DOCTYPE html><html><head><meta charset=\"utf-8\"><style>*{font-family:monospace"
		if args.reverse:
			res += ";color:white;background-color:black"
		else:
			res += ";color:black;background-color:white"
		res += "}</style></head><body>"

	last_r = -1
	last_g = -1
	last_b = -1
	for y in range(height):
		for x in range(width):
			r_sum = 0
			g_sum = 0
			b_sum = 0
			for cy in range(cell_height):
				for cx in range(cell_width):
					r, g, b = rgb_im.getpixel((x * cell_width + cx, y * cell_height + cy))
					r_sum += r
					g_sum += g
					b_sum += b
			r_avg = r_sum / (cell_width * cell_height)
			g_avg = g_sum / (cell_width * cell_height)
			b_avg = b_sum / (cell_width * cell_height)

			brightness = (r_avg + g_avg + b_avg) / 3
			val = min(max(int(brightness * len(CHARSET) / 255), 0), len(CHARSET) - 1)
			if args.reverse:
				val = len(CHARSET) - 1 - val

			if not args.no_color:
				r_avg = int(r_avg)
				g_avg = int(g_avg)
				b_avg = int(b_avg)
				if r_avg != last_r or g_avg != last_g or b_avg != last_b:
					if last_r >= 0:
						res += "</span>"
					res += "<span style=\"color: #"
					res += f"{r_avg:02x}{g_avg:02x}{b_avg:02x}"
					res += "\">"

			for c in args.character or CHARSET[val]:
				if c == "<":
					res += "&lt;"
				elif c == ">":
					res += "&gt;"
				elif c == "&":
					res += "&amp;"
				else:
					res += c

			last_r = r_avg
			last_g = g_avg
			last_b = b_avg
		if not args.no_color:
			res += "</span>"
		res += "<br>"
		last_r = -1
	if not args.no_parent:
		res += "</body></html>"

	with open(args.outfile, "w") as f:
		f.write(res)

if __name__ == "__main__":
	main()
