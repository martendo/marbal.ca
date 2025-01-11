---
---
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

public class WindowsRGplus extends JFrame {
	public static void main(String args[]) {
		JFrame f = new JFrame("Windows RG+");
		Font errorf = new Font("Consolas", Font.BOLD, 20);
		Font button = new Font("Segeo UI", Font.PLAIN, 15);
		f.setSize(700, 300);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel l = new JLabel("Windows Really Good Edition+™");
		l.setToolTipText("Why are you hovering your mouse over this");
		JLabel cl = new JLabel("Reeealy Winnndows++++ Editttion ™™™™™™™™™™™™RrG Goodrd");
		JButton b = new JButton("Exit Windows RG+™");
		JButton b2 = new JButton("This literally does nothing");
		JButton b3 = new JButton("Run Windows 11");
		JButton b9 = new JButton("Use NotePad RG+");
		JButton b10 = new JButton("Open Steam RG+");
		JButton b17 = new JButton("Use Paint RG+");
		JButton b19 = new JButton("Search");
		JButton b22 = new JButton("Run Windows 7");
		JButton b26 = new JButton("Crash");
		JButton b27 = new JButton("Check Email");
		JButton b29 = new JButton("Open iTunes RG+");
		JButton b34 = new JButton("Help");
		JButton b35 = new JButton("Use Cortana RG+");
		JButton b39 = new JButton("Order Food");
		JButton b47 = new JButton("Crash even more");
		JButton b48 = new JButton("Use Calculator RG+");
		JButton b49 = new JButton("Windows RG+ Store");
		JButton b51 = new JButton("Calendar RG+");
		JButton b53 = new JButton("Files");
		JButton b57 = new JButton("Recycling Bin");
	    b.setPreferredSize(new Dimension(250, 28));
		l.setFont(new Font("Sans", Font.BOLD, 30));
		l.setForeground(Color.WHITE);
		cl.setForeground(Color.WHITE);
		b.setFont(button);
		b2.setFont(button);
		b3.setFont(button);
		b9.setFont(button);
		b10.setFont(button);
		b17.setFont(button);
		b19.setFont(button);
		b22.setFont(button);
		b26.setFont(button);
		b27.setFont(button);
		b29.setFont(button);
		b34.setFont(button);
		b35.setFont(button);
		b39.setFont(button);
		b47.setFont(button);
		b48.setFont(button);
		b49.setFont(button);
		b51.setFont(button);
		b53.setFont(button);
		b57.setFont(button);
		cl.setFont(new Font("Monospaced", Font.PLAIN, 17));
		b47.setVisible(false);
		cl.setVisible(false);
		JPanel p = new JPanel();
		p.setBackground(new Color(0,78,152));
		f.add(p);
		p.add(l);
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b9);
		p.add(b10);
		p.add(b17);
		p.add(b19);
		p.add(b22);
		p.add(b27);
		p.add(b29);
		p.add(b34);
		p.add(b35);
		p.add(b39);
		p.add(b48);
		p.add(b49);
		p.add(b51);
		p.add(b53);
		p.add(b57);
		p.add(b26);
		p.add(b47);
		p.add(cl);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f2 = new JFrame("Error");
				f2.setSize(850, 125);
				f2.setLocationRelativeTo(null);
				f2.setResizable(false);
				f2.setVisible(true);
				f2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				JPanel p2 = new JPanel();
				JLabel l2 = new JLabel("Error locating the operating software. Probably because it doesn't exist.");
				l2.setFont(errorf);
				JButton b4 = new JButton("OK");
				b4.setFont(button);
				f2.add(p2);
				p2.add(l2);
				p2.add(b4);
				b4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						f2.dispose();
					}
				});
				
			}
		});
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f3 = new JFrame("Error");
				f3.setSize(1000, 125);
				f3.setLocationRelativeTo(null);
				f3.setResizable(false);
				f3.setVisible(true);
				f3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				JPanel p3 = new JPanel();
				JLabel l3 = new JLabel("Windows RG+ could not perform this command because you're supposed to use the X button.");
				JButton b5 = new JButton("OK");
				l3.setFont(errorf);
				b5.setFont(button);
				f3.add(p3);
				p3.add(l3);
				p3.add(b5);
				b5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f3.dispose();
						JFrame f4 = new JFrame("Error");
						f4.setSize(1000, 125);
						f4.setLocationRelativeTo(null);
						f4.setResizable(false);
						f4.setVisible(true);
						f4.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
						JPanel p4 = new JPanel();
						JLabel l4 = new JLabel("Windows RG+ could not perform this command because you're supposed to use the X button.");
						JButton b6 = new JButton("OK");
						l4.setFont(errorf);
						b6.setFont(button);
						f4.add(p4);
						p4.add(l4);
						p4.add(b6);
						b6.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f4.dispose();
								JFrame f5 = new JFrame("Error");
								f5.setSize(1000, 125);
								f5.setLocationRelativeTo(null);
								f5.setResizable(false);
								f5.setVisible(true);
								f5.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
								JPanel p5 = new JPanel();
								JLabel l5 = new JLabel("Windows RG+ could not perform this command because you're supposed to use the X button.");
								JButton b7 = new JButton("OK");
								l5.setFont(errorf);
								b7.setFont(button);
								f5.add(p5);
								p5.add(l5);
								p5.add(b7);
								b7.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent event){
										f5.dispose();
										JFrame f6 = new JFrame("Error");
										f6.setSize(525, 125);
										f6.setLocationRelativeTo(null);
										f6.setResizable(false);
										f6.setVisible(true);
										f6.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
										JPanel p6 = new JPanel();
										JLabel l6 = new JLabel("System overload. Please delete system files.");
										JButton b8 = new JButton("Clear");
										l6.setFont(errorf);
										b8.setFont(button);
										f6.add(p6);
										p6.add(l6);
										p6.add(b8);
										b8.addActionListener(new ActionListener(){
											public void actionPerformed(ActionEvent event){
												f6.dispose();
												JFrame f7 = new JFrame("Error");
												f7.setSize(1000, 125);
												f7.setLocationRelativeTo(null);
												f7.setResizable(false);
												f7.setVisible(true);
												f7.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
												JPanel p7 = new JPanel();
												JLabel l7 = new JLabel("You deleted the system delete command so you can't delete the other 1274 virus files.");
												JButton b11 = new JButton("OK");
												l7.setFont(errorf);
												b11.setFont(button);
												f7.add(p7);
												p7.add(l7);
												p7.add(b11);
												b11.addActionListener(new ActionListener(){
													public void actionPerformed(ActionEvent event){
														f7.dispose();
													}
												});
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f8 = new JFrame("Error");
				f8.setSize(1100, 125);
				f8.setLocationRelativeTo(null);
				f8.setResizable(false);
				f8.setVisible(true);
				f8.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p8 = new JPanel();
				JLabel l8 = new JLabel("Windows RG+ has deleted this application because it wanted to make space for downloading viruses.");
				JButton b12 = new JButton("OK");
				l8.setFont(errorf);
				b12.setFont(button);
				f8.add(p8);
				p8.add(l8);
				p8.add(b12);
				b12.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f8.dispose();
					}
				});
			}
		});
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f9 = new JFrame("Steam RG+");
				f9.setSize(700, 600);
				f9.setLocationRelativeTo(null);
				f9.setResizable(false);
				f9.setVisible(true);
				f9.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p9 = new JPanel();
				JLabel l9 = new JLabel("Welcome to Steam RG+!", SwingConstants.CENTER);
				JLabel l10 = new JLabel("Here you can play your favourite games, like nothing!");
				JLabel l11 = new JLabel("Your games:");
				JButton b13 = new JButton("                                                            Nothing                                                            ");
				JButton b15 = new JButton("Close Steam RG+");
				l9.setFont(new Font("Sans", Font.PLAIN, 30));
				l10.setFont(new Font("SansSerif", Font.ITALIC, 25));
				l11.setFont(new Font("SansSerif", Font.BOLD, 15));
				b13.setFont(button);
				b15.setFont(button);
				f9.add(p9);
				p9.add(l9);
				p9.add(l10);
				p9.add(l11);
				p9.add(b13);
				p9.add(b15);
				b13.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f10 = new JFrame("Error");
						f10.setSize(1000, 125);
						f10.setLocationRelativeTo(null);
						f10.setVisible(true);
						f10.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						f10.setResizable(false);
						JPanel p10 = new JPanel();
						JLabel l12 = new JLabel("Even though this is nothing, we're wasting your time by saying the file was not found.");
						JButton b14 = new JButton("OK");
						l12.setFont(errorf);
						b14.setFont(button);
						f10.add(p10);
						p10.add(l12);
						p10.add(b14);
						b14.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f10.dispose();
							}
						});
					}
				});
				b15.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f11 = new JFrame("Confirmation");
						f11.setSize(1200, 125);
						f11.setLocationRelativeTo(null);
						f11.setResizable(false);
						f11.setVisible(true);
						f11.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p11 = new JPanel();
						JLabel l14 = new JLabel("Are you sure you want to exit Steam RG+? All saved data will be deleted if you don't save or if you do.");
						JButton b16 = new JButton("OK");
						l14.setFont(errorf);
						b16.setFont(button);
						f11.add(p11);
						p11.add(l14);
						p11.add(b16);
						b16.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f11.dispose();
								f9.dispose();
							}
						});
					}
				});
			}
		});
		b17.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f12 = new JFrame("Error");
				f12.setSize(1100, 125);
				f12.setLocationRelativeTo(null);
				f12.setResizable(false);
				f12.setVisible(true);
				f12.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p12 = new JPanel();
				JLabel l15 = new JLabel("Windows RG+ has deleted this application because it wanted to make space for downloading viruses.");
				JButton b18 = new JButton("OK");
				l15.setFont(errorf);
				b18.setFont(button);
				f12.add(p12);
				p12.add(l15);
				p12.add(b18);
				b18.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f12.dispose();
					}
				});
			}
		});
		b19.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f13 = new JFrame("Search");
				f13.setSize(600, 400);
				f13.setLocationRelativeTo(null);
				f13.setResizable(false);
				f13.setVisible(true);
				f13.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p13 = new JPanel();
				JLabel l16 = new JLabel("Search whatever you need here:");
				JLabel l17 = new JLabel("(Windows RG+ deleted the search function for no reason.)");
				JTextField field = new JTextField(30);
				JButton b20 = new JButton("Search");
				JButton b21 = new JButton("Close");
				l16.setFont(new Font("Sans", Font.PLAIN, 25));
				l17.setFont(new Font("Consolas", Font.BOLD, 15));
				field.setFont(new Font("Consolas", Font.PLAIN, 25));
				b20.setFont(new Font("Segeo UI", Font.PLAIN, 25));
				b21.setFont(button);
				f13.add(p13);
				p13.add(l16);
				p13.add(l17);
				p13.add(field);
				p13.add(b20);
				p13.add(b21);
				b21.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f13.dispose();
					}
				});
			}
		});
		b22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f14 = new JFrame("Error");
				f14.setSize(950, 125);
				f14.setLocationRelativeTo(null);
				f14.setResizable(false);
				f14.setVisible(true);
				f14.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p14 = new JPanel();
				JLabel l18 = new JLabel("Windows 7 operating software is too new for Windows RG+. Do you want to upgrade?");
				JButton b23 = new JButton("Yes");
				JButton b24 = new JButton("No");
				l18.setFont(errorf);
				b23.setFont(button);
				b24.setFont(button);
				f14.add(p14);
				p14.add(l18);
				p14.add(b23);
				p14.add(b24);
				b23.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f15 = new JFrame("Error");
						f15.setSize(850, 125);
						f15.setLocationRelativeTo(null);
						f15.setResizable(false);
						f15.setVisible(true);
						f15.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p15 = new JPanel();
						JLabel l19 = new JLabel("Windows RG+ could not find the system upgrade file because it deleted it.");
						JButton b25 = new JButton("OK");
						l19.setFont(errorf);
						b25.setFont(button);
						f15.add(p15);
						p15.add(l19);
						p15.add(b25);
						b25.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f15.dispose();
								f14.dispose();
							}
						});
					}
				});
				b24.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f14.dispose();
					}
				});
			}
		});
		b26.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				l.setVisible(false);
				b.setVisible(false);
				b2.setVisible(false);
				b3.setVisible(false);
				b9.setVisible(false);
				b10.setVisible(false);
				b17.setVisible(false);
				b19.setVisible(false);
				b22.setVisible(false);
				b26.setVisible(false);
				b27.setVisible(false);
				b29.setVisible(false);
				b34.setVisible(false);
				b35.setVisible(false);
				b39.setVisible(false);
				b48.setVisible(false);
				b47.setVisible(true);
				b48.setVisible(false);
				b49.setVisible(false);
				b51.setVisible(false);
				b53.setVisible(false);
				cl.setVisible(true);
			}
		});
		b27.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f16 = new JFrame("Error");
				f16.setSize(1100, 125);
				f16.setLocationRelativeTo(null);
				f16.setResizable(false);
				f16.setVisible(true);
				f16.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p16 = new JPanel();
				JLabel l20 = new JLabel("Error connecting to internet. Probably because Windows RG+ has no internet reciever installed.");
				JButton b28 = new JButton("OK");
				l20.setFont(errorf);
				b28.setFont(button);
				f16.add(p16);
				p16.add(l20);
				p16.add(b28);
				b28.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f16.dispose();
					}
				});
			}
		});
		b29.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f17 = new JFrame("iTunes RG+");
				f17.setSize(825, 150);
				f17.setLocationRelativeTo(null);
				f17.setResizable(false);
				f17.setVisible(true);
				f17.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JPanel p17 = new JPanel();
				JLabel l21 = new JLabel("Welcome to iTunes RG+! All your favourite tunes are here!");
				JLabel l22 = new JLabel("Your music:");
				JButton b30 = new JButton("Shooting Stars - Bag Raiders");
				l21.setFont(new Font("Sans", Font.PLAIN, 30));
				l22.setFont(new Font("SansSerif", Font.BOLD, 15));
				b30.setFont(button);
				f17.add(p17);
				p17.add(l21);
				p17.add(l22);
				p17.add(b30);
				b30.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f18 = new JFrame("Error");
						f18.setSize(800, 150);
						f18.setLocationRelativeTo(null);
						f18.setResizable(false);
						f18.setVisible(true);
						f18.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p18 = new JPanel();
						JLabel l23 = new JLabel("Error locating file because Windows RG+ deleted it. Use URL instead?");
						JLabel l24 = new JLabel("https://www.youtube.com/watch?v=feA64wXhbjo");
						JButton b31 = new JButton("OK");
						JButton b32 = new JButton("No");
						l23.setFont(errorf);
						l24.setFont(errorf);
						b31.setFont(button);
						b32.setFont(button);
						f18.add(p18);
						p18.add(l23);
						p18.add(l24);
						p18.add(b31);
						p18.add(b32);
						b31.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								JFrame f19 = new JFrame("Error");
								f19.setSize(1100, 125);
								f19.setLocationRelativeTo(null);
								f19.setVisible(true);
								f19.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
								JPanel p19 = new JPanel();
								JLabel l25 = new JLabel("Error connecting to internet. Probably because Windows RG+ has no internet reciever installed.");
								JButton b33 = new JButton("OK");
								l25.setFont(errorf);
								b33.setFont(button);
								f19.add(p19);
								p19.add(l25);
								p19.add(b33);
								b33.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent event){
										f19.dispose();
										f18.dispose();
									}
								});
							}
						});
						b32.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f18.dispose();
							}
						});
					}
				});
			}
		});
		b34.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f20 = new JFrame("Help");
				f20.setSize(900, 150);
				f20.setLocationRelativeTo(null);
				f20.setResizable(false);
				f20.setVisible(true);
				f20.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JPanel p20 = new JPanel();
				JLabel l26 = new JLabel("Our service team has no help to give you! Have a good day.");
				JLabel l27 = new JLabel("We Help Everyone!™");
				l26.setFont(new Font("Sans", Font.PLAIN, 30));
				l27.setFont(new Font("SansSerif", Font.BOLD, 25));
				f20.add(p20);
				p20.add(l26);
				p20.add(l27);
			}
		});
		b35.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f21 = new JFrame("Cortana RG+");
				f21.setSize(550, 200);
				f21.setLocationRelativeTo(null);
				f21.setResizable(false);
				f21.setVisible(true);
				f21.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p21 = new JPanel();
				JLabel l28 = new JLabel("What can I help you with?");
				JTextField field2 = new JTextField(30);
				JButton b36 = new JButton("Enter");
				JButton b37 = new JButton("Exit");
				l28.setFont(new Font("Monospaced", Font.PLAIN, 30));
				field2.setFont(new Font("Consolas", Font.PLAIN, 25));
				b36.setFont(button);
				b37.setFont(button);
				f21.add(p21);
				p21.add(l28);
				p21.add(field2);
				p21.add(b36);
				p21.add(b37);
				b36.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f22 = new JFrame("INSULTER");
						f22.setSize(700, 125);
						f22.setLocationRelativeTo(null);
						f22.setResizable(false);
						f22.setVisible(true);
						f22.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p22 = new JPanel();
						JLabel l29 = new JLabel("What an INSULT! You are not allowed to type that again.");
						JButton b38 = new JButton("Sorry");
						l29.setFont(new Font("Monospaced", Font.PLAIN, 20));
						b38.setFont(button);
						f22.add(p22);
						p22.add(l29);
						p22.add(b38);
						b38.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f22.dispose();
							}
						});
					}
				});
				b37.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f21.dispose();
					}
				});
			}
		});
		b39.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f23 = new JFrame("Order Food");
				f23.setSize(1000, 250);
				f23.setLocationRelativeTo(null);
				f23.setResizable(false);
				f23.setVisible(true);
				f23.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p23 = new JPanel();
				JLabel l30 = new JLabel("One of the best things about Windows RG+ is that you can order food!");
				JLabel l31 = new JLabel("You can select from our wide range of food choices and we'll deliver it to you!");
				JLabel l32 = new JLabel("Pizza: Large, thin crust, tomato sauce, cheese, pepperoni. $271.37");
				JLabel l33 = new JLabel("Fish: Medium, stinky, oil, garbage, dirt, flies. $0.99");
				JButton b40 = new JButton("Order");
				JButton b41 = new JButton("Order (with fast delivery because this smells so weird with the smell of pizza)");
				JButton b46 = new JButton("Exit");
				l30.setFont(new Font("Sans", Font.PLAIN, 30));
				l31.setFont(new Font("SansSerif", Font.ITALIC, 25));
				l32.setFont(new Font("SansSerif", Font.PLAIN, 20));
				l33.setFont(new Font("SansSerif", Font.PLAIN, 20));
				b40.setFont(button);
				b41.setFont(button);
				b46.setFont(button);
				f23.add(p23);
				p23.add(l30);
				p23.add(l31);
				p23.add(l32);
				p23.add(b40);
				p23.add(l33);
				p23.add(b41);
				p23.add(b46);
				b40.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f24 = new JFrame("Sorry");
						f24.setSize(725, 125);
						f24.setLocationRelativeTo(null);
						f24.setResizable(false);
						f24.setVisible(true);
						f24.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p24 = new JPanel();
						JLabel l34 = new JLabel("Sorry, but this item is sold out. Good thing we have a large variety of good food!");
						JButton b42 = new JButton("OK");
						l34.setFont(new Font("SansSerif", Font.PLAIN, 20));
						b42.setFont(button);
						f24.add(p24);
						p24.add(l34);
						p24.add(b42);
						b42.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f24.dispose();
							}
						});
					}
				});
				b41.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f25 = new JFrame("No money");
						f25.setSize(525, 125);
						f25.setLocationRelativeTo(null);
						f25.setResizable(false);
						f25.setVisible(true);
						f25.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						JPanel p25 = new JPanel();
						JLabel l35 = new JLabel("You have no money in your RG+ account. Add money?");
						JButton b43 = new JButton("Yes");
						JButton b44 = new JButton("No");
						l35.setFont(new Font("SansSerif", Font.PLAIN, 20));
						b43.setFont(button);
						b44.setFont(button);
						f25.add(p25);
						p25.add(l35);
						p25.add(b43);
						p25.add(b44);
						b43.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f25.dispose();
							}
						});
						b43.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								JFrame f26 = new JFrame("Error");
								f26.setSize(1100, 125);
								f26.setLocationRelativeTo(null);
								f26.setResizable(false);
								f26.setVisible(true);
								f26.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
								JPanel p26 = new JPanel();
								JLabel l36 = new JLabel("Error connecting to internet. Probably because Windows RG+ has no internet reciever installed.");
								JButton b45 = new JButton("OK");
								l36.setFont(errorf);
								b45.setFont(button);
								f26.add(p26);
								p26.add(l36);
								p26.add(b45);
								b45.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent event){
										f26.dispose();
										f25.dispose();
									}
								});
							}
						});
						b44.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent event){
								f25.dispose();
							}
						});
					}
				});
				b46.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f23.dispose();
					}
				});
			}
		});
		b47.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				p.setVisible(false);
			}
		});
		b48.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
				JFrame f27 = new JFrame("Calculator RG+");
				f27.setSize(300, 400);
				f27.setLocationRelativeTo(null);
				f27.setResizable(false);
				f27.setVisible(true);
				f27.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JPanel p27 = new JPanel();
				JTextArea cal = new JTextArea(1, 12);
				cal.setEditable(false);
				cal.setFont(new Font("MV Boli", Font.PLAIN, 25));
				cal.setBorder(border);
				cal.setLineWrap(true);
				JButton bc1 = new JButton();
				bc1.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\1.png"));
				bc1.setPreferredSize(new Dimension(75, 40));
				JButton bc2 = new JButton();
				bc2.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\2.png"));
				bc2.setPreferredSize(new Dimension(75, 40));
				JButton bc3 = new JButton();
				bc3.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\3.png"));
				bc3.setPreferredSize(new Dimension(75, 40));
				JButton bc4 = new JButton();
				bc4.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\4.png"));
				bc4.setPreferredSize(new Dimension(75, 40));
				JButton bc5 = new JButton();
				bc5.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\5.png"));
				bc5.setPreferredSize(new Dimension(75, 40));
				JButton bc6 = new JButton();
				bc6.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\6.png"));
				bc6.setPreferredSize(new Dimension(75, 40));
				JButton bc7 = new JButton();
				bc7.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\7.png"));
				bc7.setPreferredSize(new Dimension(75, 40));
				JButton bc8 = new JButton();
				bc8.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\8.png"));
				bc8.setPreferredSize(new Dimension(75, 40));
				JButton bc9 = new JButton();
				bc9.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\9.png"));
				bc9.setPreferredSize(new Dimension(75, 40));
				JButton bc0 = new JButton();
				bc0.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\0.png"));
				bc0.setPreferredSize(new Dimension(75, 40));
				JButton bcp = new JButton();
				bcp.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\plus.png"));
				bcp.setPreferredSize(new Dimension(75, 40));
				JButton bcm = new JButton();
				bcm.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\minus.png"));
				bcm.setPreferredSize(new Dimension(75, 40));
				JButton bct = new JButton();
				bct.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\times.png"));
				bct.setPreferredSize(new Dimension(75, 40));
				JButton bcd = new JButton();
				bcd.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\divide.png"));
				bcd.setPreferredSize(new Dimension(75, 40));
				JButton bcc = new JButton();
				bcc.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\clear.png"));
				bcc.setPreferredSize(new Dimension(75, 40));
				JButton bce = new JButton();
				bce.setIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Java Files\\equals.png"));
				bce.setPreferredSize(new Dimension(235, 40));
				f27.add(p27);
				p27.add(cal);
				p27.add(bc1);
				p27.add(bc2);
				p27.add(bc3);
				p27.add(bc4);
				p27.add(bc5);
				p27.add(bc6);
				p27.add(bc7);
				p27.add(bc8);
				p27.add(bc9);
				p27.add(bcp);
				p27.add(bc0);
				p27.add(bcm);
				p27.add(bct);
				p27.add(bcc);
				p27.add(bcd);
				p27.add(bce);
				bc1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran1 = new Random();
						int rnum1 = ran1.nextInt(9);
						cal.setText(cal.getText()+rnum1);
					}
				});
				bc2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran2 = new Random();
						int rnum2 = ran2.nextInt(9);
						cal.setText(cal.getText()+rnum2);
					}
				});
				bc3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran3 = new Random();
						int rnum3 = ran3.nextInt(9);
						cal.setText(cal.getText()+rnum3);
					}
				});
				bc4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran4 = new Random();
						int rnum4 = ran4.nextInt(9);
						cal.setText(cal.getText()+rnum4);
					}
				});
				bc5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran5 = new Random();
						int rnum5 = ran5.nextInt(9);
						cal.setText(cal.getText()+rnum5);
					}
				});
				bc6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran6 = new Random();
						int rnum6 = ran6.nextInt(9);
						cal.setText(cal.getText()+rnum6);
					}
				});
				bc7.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran7 = new Random();
						int rnum7 = ran7.nextInt(9);
						cal.setText(cal.getText()+rnum7);
					}
				});
				bc8.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran8 = new Random();
						int rnum8 = ran8.nextInt(9);
						cal.setText(cal.getText()+rnum8);
					}
				});
				bc9.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran9 = new Random();
						int rnum9 = ran9.nextInt(9);
						cal.setText(cal.getText()+rnum9);
					}
				});
				bc0.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random ran0 = new Random();
						int rnum0 = ran0.nextInt(9);
						cal.setText(cal.getText()+rnum0);
					}
				});
				bcp.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						cal.setText(cal.getText()+" + ");
					}
				});
				bcm.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						cal.setText(cal.getText()+" - ");
					}
				});
				bct.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						cal.setText(cal.getText()+" * ");
					}
				});
				bcd.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						cal.setText(cal.getText()+" / ");
					}
				});
				bcc.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						cal.setText("");
					}
				});
				bce.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random r = new Random();
						int rand = r.nextInt(9999999)+1;
						cal.setText(cal.getText()+" = "+rand);
					}
				});
			}
		});
		b49.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f28 = new JFrame("Error");
				f28.setSize(950, 125);
				f28.setLocationRelativeTo(null);
				f28.setResizable(false);
				f28.setVisible(true);
				f28.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p28 = new JPanel();
				JLabel l37 = new JLabel("Windows RG+ doesn't want you to download applications becuase Windows RG+ hates you.");
				JButton b50 = new JButton("OK");
				l37.setFont(errorf);
				b50.setFont(button);
				f28.add(p28);
				p28.add(l37);
				p28.add(b50);
				b50.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f28.dispose();
					}
				});
			}
		});
		b51.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f29 = new JFrame("Calendar RG+");
				f29.setLocationRelativeTo(null);
				f29.setResizable(false);
				f29.setVisible(true);
				f29.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		        try {
		            f29.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Martin\\Documents\\Java Files\\CalendarRG+.png")))));
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        f29.pack();
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f30 = new JFrame("Why?...");
				f30.setSize(1000, 125);
				f30.setLocationRelativeTo(null);
				f30.setResizable(false);
				f30.setVisible(true);
				f30.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				JPanel p29 = new JPanel();
				JLabel l38 = new JLabel("You decided to press the button that said that it does nothing. Why don't you trust Windows RG+?");
				JButton b52 = new JButton("Let me do other stuff");
				l38.setFont(new Font("SansSerif", Font.BOLD, 20));
				b52.setFont(button);
				f30.add(p29);
				p29.add(l38);
				p29.add(b52);
				b52.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						f30.dispose();
					}
				});
			}
		});
		b53.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f31 = new JFrame("Your Files");
				f31.setSize(350, 200);
				f31.setLocationRelativeTo(null);
				f31.setResizable(false);
				f31.setVisible(true);
				f31.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JPanel p30 = new JPanel();
				JButton b54 = new JButton("Windows RG+.png");
				JButton b55 = new JButton("For Later.png");
				JButton b56 = new JButton("Python.py");
				b54.setFont(button);
				b55.setFont(button);
				b56.setFont(button);
		        f31.add(p30);
		        p30.add(b54);
		        p30.add(b55);
		        p30.add(b56);
		        b54.addActionListener(new ActionListener(){
		        	public void actionPerformed(ActionEvent event){
		        		JFrame f32 = new JFrame("Windows RG+.png - Windows RG+ Photo Viewer");
		        		f32.setLocationRelativeTo(null);
		        		f32.setResizable(false);
		        		f32.setVisible(true);
		        		f32.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						File filea = new File("C:\\Users\\Martin\\Documents\\Java Files\\Windows RG+.png");
				        try {
				            f32.setContentPane(new JLabel(new ImageIcon(ImageIO.read(filea))));
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
				        f32.pack();
		        	}
		        });
		        b55.addActionListener(new ActionListener(){
		        	public void actionPerformed(ActionEvent event){
		        		JFrame f33 = new JFrame("For Later.png - Windows RG+ Photo Viewer");
		        		f33.setLocationRelativeTo(null);
		        		f33.setResizable(false);
		        		f33.setVisible(true);
		        		f33.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						File fileb = new File("C:\\Users\\Martin\\Documents\\Java Files\\WRG+FLP.png");
				        try {
				            f33.setContentPane(new JLabel(new ImageIcon(ImageIO.read(fileb))));
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
				        f33.pack();
		        	}
		        });
		        b56.addActionListener(new ActionListener(){
		        	public void actionPerformed(ActionEvent event){
		        		JFrame f34 = new JFrame("Python.py");
		        		f34.setSize(500, 300);
		        		f34.setLocationRelativeTo(null);
		        		f34.setResizable(false);
		        		f34.setVisible(true);
		        		f34.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		        		JPanel p31 = new JPanel();
		        		JLabel l39 = new JLabel("<html>print(\"Hello Windows RG+!\")<br>print(\"Bye Windows RG+ because I don't need you at all!\")</html>");
		        		l39.setFont(new Font("Consolas", Font.PLAIN, 15));
		        		f34.add(p31);
		        		p31.add(l39);
		        	}
		        });
			}
		});
		b57.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JFrame f35 = new JFrame("Recycling Bin");
				f35.setSize(500, 300);
				f35.setLocationRelativeTo(null);
				f35.setResizable(false);
				f35.setVisible(true);
				f35.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JPanel p32 = new JPanel();
				JButton b58 = new JButton("Windows 95");
				b58.setFont(button);
				f35.add(p32);
				p32.add(b58);
				b58.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JFrame f36 = new JFrame("Windows 95 (Not Responding)");
						f36.setLocationRelativeTo(null);
						f36.setResizable(false);
						f36.setVisible(true);
						f36.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
						File filec = new File("C:\\Users\\Martin\\Documents\\Java Files\\Windows 95.png");
				        try {
				            f36.setContentPane(new JLabel(new ImageIcon(ImageIO.read(filec))));
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
				        f36.pack();
					}
				});
			}
		});
	}
}
