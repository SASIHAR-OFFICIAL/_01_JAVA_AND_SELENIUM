///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*.................................................................................................
//. This file gives the option to select a level like Antonym clues,Synonym clues,No clues & passage.
//. clues.																						  .
//. @author  SATISH REDDY                                                                            .
//. @Date    15.9.2001										 							          .
//. @Version  1.0 						                                                          .
//.................................................................................................*/
//
//package wordmine.play;
//
//import java.io.*;
//import java.math.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.util.*;
//import java.util.StringTokenizer;
//import wordmine.main.*;
//import rijndael.*;
//import mainpage.*;
//
//public class GoToAnagrams extends JPanel implements ActionListener
//{
//
//	private JButton btn_home,btn_enter,btn_home1,btn_help,btn_ganag;		// different buttons
//	private JLabel lbl_title,lbl_subtitle,lbl_layout1,lbl_layout2; 	// labels
//	private JRadioButton rb_synonym,rb_antonym,rb_noclues,rb_passage;	// radio buttons
//	public JRadioButton rb_dummy;
//	private ImageIcon image1,image2,img2,img3,img4,img5,imgfill,imgfill1,imgfill2,imgfill3,imgi_help1,imgi_help2;	// image icons
//	private ButtonGroup group;			// ref obj of the button group
//	private ImageIcon imgi_title,imgi_subtitle,imgi_layout1,imgi_layout2,imgi_home1,imgi_home2,imgi_enter1,imgi_enter2,imgi_fill1,imgi_fill2,imgi_ganag1,imgi_ganag2; // image icons
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//	private EncryptString dec;
//
//	public GoToAnagrams()
//	{
//		/**
//		* This Constructor calls the design method and sets the back ground color.
//		*/
//		try{
//		setLayout(null);
//		setBackground(new Color(228,250,250));
//		dec = new EncryptString();
//		design();					// calling design method
//	    } catch(Exception ANAGRAMS5) { error(ANAGRAMS5,"ANAGRAMS1005"); }
//
//	}	// end of GoToAnagrams Constructor
//
//	public void design()
//	{
//
//		/**
//		* Design part of GoToAnagrams with image icons,labels,buttons,radio buttons.
//		*/
//		try{
//		imgi_title = new ImageIcon(mainpage.MainPage.workpath+workpath+"title2.gif");
//		lbl_title = new JLabel(imgi_title);
//		lbl_title.setBounds(0,0,800,70);
//		add(lbl_title);
//
//		imgi_subtitle = new ImageIcon(mainpage.MainPage.workpath+workpath+"title_anagrams.gif");
//		lbl_subtitle = new JLabel(imgi_subtitle);
//		lbl_subtitle.setBounds(0,71,800,20);
//		add(lbl_subtitle);
//
//		imgi_layout1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"anagrams_layout.jpg");
//		lbl_layout1 = new JLabel(imgi_layout1);
//		lbl_layout1.setBounds(0,92,800,504);
//
//		imgi_home1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_home.gif");
//		imgi_home2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_home.gif");
//		btn_home = new JButton(imgi_home1);
//		add(btn_home);
//        btn_home.setBorderPainted(false);
//		btn_home.setBounds(30,510,125,32);
//		btn_home.addActionListener(this);		// adding ActionListener to button
//		btn_home.setMnemonic('h');				// setting mnemonic of button
//		btn_home.setToolTipText("Home");		// setting tool tip text of the button
//	    btn_home.requestFocus();
//	    btn_home.setNextFocusableComponent(btn_help);
//		btn_home.setRolloverIcon(imgi_home2);	// setting Rollover Icon of the button
//		btn_home.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//		btn_home.setVisible(true);
//
//		imgi_help1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_help.gif");
//	    imgi_help2 = new ImageIcon(mainpage.MainPage.workpath+"play2_help.gif");
//        btn_help = new JButton(imgi_help1);
//        btn_help.setBorderPainted(false);
//        btn_help.setBounds(315,510,125,31);
//        add(btn_help);
//		btn_help.setRolloverIcon(imgi_help2);
//	    btn_help.setMnemonic('p');							// setting mnemonic of button
//		btn_help.setToolTipText("Help");				// setting tool tip text to button
//	    btn_help.setNextFocusableComponent(btn_enter);
//		btn_help.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//        btn_help.addActionListener(this);
//
//		imgi_enter1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_enter.gif");
//		imgi_enter2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_enter.gif");
//		btn_enter =new JButton(imgi_enter1);
//		add(btn_enter);
//        btn_enter.setBorderPainted(false);
//		btn_enter.setBounds(600,510,125,31);
//		btn_enter.addActionListener(this);
//		btn_enter.setRolloverIcon(imgi_enter2);
//		btn_enter.setMnemonic('e');
//		btn_enter.setToolTipText("Enter");
//	    btn_enter.setNextFocusableComponent(btn_home1);
//		btn_enter.setBackground(new Color(228,250,250));
//		btn_enter.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//
//		add(lbl_layout1);
//
//	    //end of default page design
//
//		imgi_layout2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"anagrams_frontbg1.gif");
//		lbl_layout2 = new JLabel(imgi_layout2);
//		lbl_layout2.setBounds(100,100,575,400);
//
//		imgi_fill1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play_oval1.gif");
//		imgi_fill2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play_oval2.gif");
//		rb_synonym = new JRadioButton("Anagrams with Synonym Clues",imgi_fill1,true);
//		rb_synonym.setFocusPainted(false);
//		rb_synonym.addActionListener(this);			// adding ActionListener to radio button
//		rb_synonym.setBounds(250,200,250,30);
//		rb_synonym.setBackground(new Color(228,250,250));
//		rb_synonym.setActionCommand("synonym");			// setting ActionCommand for radio buttons
//		rb_synonym.setMnemonic(KeyEvent.VK_S);			// setting Mnemonic of the radio button
//		rb_synonym.doClick();							// setting doclick of the radio button
//		rb_synonym.setSelectedIcon(imgi_fill2);			// setting selected icon of the radio button
//
//		rb_antonym = new JRadioButton("Anagrams with Antonym Clues",imgi_fill1,true);
//		rb_antonym.setFocusPainted(false);
//		rb_antonym.addActionListener(this);
//		rb_antonym.setBounds(250,250,250,30);
//		rb_antonym.setBackground(new Color(228,250,250));
//		rb_antonym.setActionCommand("antonym");
//		rb_antonym.setMnemonic(KeyEvent.VK_A);
//		rb_antonym.doClick();
//		rb_antonym.setSelectedIcon(imgi_fill2);
//
//		rb_noclues = new JRadioButton("Anagrams with No Clues",imgi_fill1,true);
//		rb_noclues.setFocusPainted(false);
//		rb_noclues.addActionListener(this);
//		rb_noclues.setBounds(250,300,250,30);
//		rb_noclues.setBackground(new Color(228,250,250));
//		rb_noclues.setActionCommand("noclues");
//		rb_noclues.setMnemonic(KeyEvent.VK_N);
//		rb_noclues.doClick();
//		rb_noclues.setSelectedIcon(imgi_fill2);
//
//		rb_passage = new JRadioButton("Anagrams with Passages",imgi_fill1,true);
//		rb_passage.setFocusPainted(false);
//		rb_passage.addActionListener(this);
//		rb_passage.setBounds(250,350,250,30);
//		rb_passage.setBackground(new Color(228,250,250));
//		rb_passage.setActionCommand("passage");
//		rb_passage.setMnemonic(KeyEvent.VK_P);
//		rb_passage.doClick();
//		rb_passage.setSelectedIcon(imgi_fill2);
//	
//		rb_dummy=new JRadioButton();
//		rb_dummy.addActionListener(this);
//		rb_dummy.setBounds(270,350,250,30);
//		rb_dummy.setSelected(true);
//		rb_dummy.setVisible(false);
//
//		group = new ButtonGroup();			// creating obj of the ButtonGroup
//		group.add(rb_synonym);				// adding radio buttons to button group
//		group.add(rb_antonym);
//		group.add(rb_noclues);
//		group.add(rb_passage);
//		group.add(rb_dummy);
//
//		btn_home1 = new JButton(imgi_home1);
//        btn_home1.setBorderPainted(false);
//		btn_home1.setBounds(30,510,125,32);
//		btn_home1.addActionListener(this);
//		btn_home1.setMnemonic('h');
//		btn_home1.setToolTipText("Home");		// setting tool tip text of the button
//	    btn_home1.setNextFocusableComponent(btn_ganag);
//		btn_home1.setRolloverIcon(imgi_home2);
//		btn_home1.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//
//		imgi_ganag1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_gotoanag.gif");
//		imgi_ganag2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_gotoanag.gif");
//		btn_ganag = new JButton(imgi_ganag1);
//        btn_ganag.setBorderPainted(false);
//		btn_ganag.setBounds(600,510,125,32);
//		btn_ganag.addActionListener(this);
//		btn_ganag.setMnemonic('g');
//		btn_ganag.setToolTipText("Go to Anagrams");		// setting tool tip text of the button
//	    btn_ganag.setNextFocusableComponent(btn_home);
//		btn_ganag.setRolloverIcon(imgi_ganag2);
//		btn_ganag.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//	    } catch(Exception ANAGRAMS6) { error(ANAGRAMS6,"ANAGRAMS1006"); }
//
//	}	// end of design method
//
//	public void actionPerformed(ActionEvent ae)
//	{
//	
//	  /**
//	  * This method is used to listen the swing components,whenever a particular compnent
// 	  *  is activated then the  corresponding  action  will be displayed on the pane.
// 	  */
//	    try{
//		Object source=ae.getSource();
//		if(source==btn_home)
//		{
//			 wordmine.main.WordMine1.Wordmineid[4]=Anagrams.index;
//			 wordmine.main.WordMine1.count=0;
//			 
//		     wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");//added for integration
//			 wordmine.main.WordMine1.forMain1();
//		}	// end of btn_home if condition
//
//		else if(source==btn_enter)
//		{
//			removepane();
//			addpane();
//			repaint();
//		}	// end of btn_enter if condition
//
//		else if(source==btn_home1)
//		{
//			 rb_dummy.setSelected(true);
//			 Anagrams.angcards.show(getParent(),"gotoanagrams");
//			 wordmine.main.WordMine1.Wordmineid[4]=Anagrams.index;
//			 wordmine.main.WordMine1.count=0;
//			 
//		     wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");//added for integration
//			 wordmine.main.WordMine1.forMain1();
//
//		}	// end of btn_home1 if condition
//	    
//		else if(source==btn_help)
//	    {
//          /**
//	      * In this it creates the runtime obj and based on exec method it will runs
//		  * the particular help file by using of windows hh.exe file.
//	      */
//			try{
//			 if(WordMine1.wh.isAlive())
//			 {
//				this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
//				WordMine1.wh.join();
//			 }
//			} catch(Exception e61){ }
//			this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//
//			/*WordMine1.wmh.setVisible(true);
//			if(WordMine1.wmh.getState()==Frame.ICONIFIED)
//			{
//				WordMine1.wmh.setState(Frame.NORMAL);
//				WordMine1.wmh.toFront();
//			}*/
//			WordMine1.wmh.show();
//	    }	// end of btn_help if condition
//
//		else if(source==btn_ganag)
//		{
//				try{
//				if(Anagrams.flag_back == false)
//				// if user pressed back button then decrementing record index value by counter(i.e, 10)
//				{
//				   Anagrams.index = Anagrams.count;
//				   Anagrams.flag_back = true;
//				}
//		  
//				if(group.getSelection().getActionCommand().equals("synonym"))
//				{
//					// it calls the synonym clues page display method
//					if(Anagrams.index >= Anagrams.synonymclues.vect_jumbword.size())
//					{
////					    JOptionPane.showMessageDialog(getParent(),"Anagrams excercise completed","M.S-Ph.d Wordmine",1);
//						 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Anagrams excercise completed.");
//					    Anagrams.index = 1;
//					}
//					else
//					{
//						Anagrams.synonymclues.clear();
//						Anagrams.synonymclues.pageDisplay(Anagrams.index);
//						Anagrams.index += 10;
//						rb_dummy.setSelected(true);
//						Anagrams.angcards.show(this.getParent(),"synonymclues");
//					}
//				}
//				else if(group.getSelection().getActionCommand().equals("antonym"))
//				{
//					// it calls the antonym clues page display method
////				    if(Anagrams.index>=3141)
//				    if(Anagrams.index>=2201)
//				    {
//					  // JOptionPane.showMessageDialog(getParent(),"Antonyms excercise completed","M.S-Ph.d Wordmine",1);
//						 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Antonyms excercise completed.");
////						 if(Anagrams.index==4141)
//						 if(Anagrams.index==2201)
//						   Anagrams.index = 1;
//					}
//					else
//					{
//						Anagrams.antonymclues.clear();
//						Anagrams.antonymclues.pageDisplay(Anagrams.index);
//						rb_dummy.setSelected(true);
//						Anagrams.angcards.show(this.getParent(),"antonymclues");
//						Anagrams.index += 10;
//					}
//					repaint();
//				}
//				else if(group.getSelection().getActionCommand().equals("noclues"))
//				{
//					// it calls the no clues page display method
//					if(Anagrams.index >= Anagrams.noclues.vect_jumbword.size())
//					{
//					    //JOptionPane.showMessageDialog(getParent(),"Anagrams excercise completed","M.S-Ph.d Wordmine",1);
//						 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Anagrams excercise completed.");
//					    Anagrams.index = 1;
//					}
//					else
//					{
//						Anagrams.noclues.clear();
//						Anagrams.noclues.pageDisplay(Anagrams.index);
//						Anagrams.index += 10;
//						rb_dummy.setSelected(true);
//						Anagrams.angcards.show(this.getParent(),"noclues");
//					}
//				}
//				else if(group.getSelection().getActionCommand().equals("passage"))
//				{
//					// it calls the splitPassage method of the PassageWord class
//
//					int ind = ((Anagrams.index)/10)+1;
//					if(ind == PassageWord.ht.size())		
//					{
//					// if index value is greaterthan or equal to hashtable then sets record pointer value to zero
//					   //JOptionPane.showMessageDialog(getParent(),"Passage excercise completed","M.S-Ph.d Wordmine",1);
//						 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Passage excercise completed.");
//					   Anagrams.index = 1;		// setting record pointer value to zero
//					}
//					else
//					{
//						Anagrams.passageword.clear();
//						Anagrams.passageword.splitPassage(dec.decryptString((String)(Anagrams.passageword.ht).get(""+ind)));
//						Anagrams.index += 10;
//						rb_dummy.setSelected(true);// incrementing record index value by 10
//						Anagrams.angcards.show(this.getParent(),"passageword");
//					}
//				}
//				} catch(NullPointerException ne)
//				{	// if not selected any value it displays message dialog box
//					//JOptionPane.showMessageDialog(getParent(),"Select a level","M.S-Ph.d Wordmine",1);
//					 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Select a level.");
//				}
//		}	// end of btn_ganag if condition
//	    } catch(Exception ANAGRAMS7) { error(ANAGRAMS7,"ANAGRAMS1007"); }
//
//	}	// end of actionPerformed method
//	
//	public void addpane()
//	{
//		  try{
// 		  add(rb_synonym);				// removing components from panel
//		  add(rb_antonym);
//		  add(rb_noclues);
//		  add(rb_passage);
//		  add(lbl_layout2);
//		  add(btn_home1);
//		  add(btn_help);
//		  add(btn_ganag);
//		   Anagrams.angcards.show(this.getParent(),"gotoanagrams");
//	      } catch(Exception ANAGRAMS8) { error(ANAGRAMS8,"ANAGRAMS1008"); }
//
//	}	// end of addpane method
//public void adder()
//{
//		  try{
//		  remove(rb_synonym);				// removing components from panel
//		  remove(rb_antonym);
//		  remove(rb_noclues);
//		  remove(rb_passage);
//		  remove(lbl_layout2);
//		  remove(btn_home1);
//		  remove(btn_help);
//		  remove(btn_ganag);
//		  add(btn_home);
//		  add(btn_help);
//		  add(btn_enter);
//		  add(lbl_layout1);			// adding components to panel
//		  Anagrams.angcards.show(this.getParent(),"gotoanagrams");
//	      } catch(Exception ANAGRAMS9) { error(ANAGRAMS9,"ANAGRAMS1009"); }		  
//
//}
//	public void removepane()
//	{
//		  try{
//		  remove(lbl_layout1);			// adding components to panel
//		  remove(btn_home);
//		  remove(btn_help);
//		  remove(btn_enter);
//	      } catch(Exception ANAGRAMS10) { error(ANAGRAMS10,"ANAGRAMS1010"); }
//
//	}	// end of removepane method
//
//	private void error(Exception exec,String str)
//	{ 
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of GoToAnagrams class