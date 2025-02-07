///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*.................................................................................................
//. This file takes the strings from wordmaster file and converts normal word into jumbled word and .
//. will be displayed on the pane. Antonym clues will be given to the user to guess the word and    .
//. type it in Textfield. Here the encrypted wordmaster file will be decrypted(Using Rijndal        .
//. algorithm) and displayes the content.															  .
//. @author  SATISH REDDY                                                                            .
//. @Date    8.9.2001										 							              .
//. @Version  1.0 						                                                          .
//.................................................................................................*/
//
//package _J_30_Expectation_Handling_Try;
//
//import java.io.*;
//import java.math.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.util.*;
//import java.util.StringTokenizer;
//import wordmine.main.*;
//import wordmine.learn.*;
//import rijndael.*;		// package to encrypt & decrypt the files
//
//public class AntonymClues_Others extends JPanel  implements ActionListener
//{
//	private JLabel lbl_jumbword,lbl_antclues,lbl_typecorword,lbl_title,lbl_subtitle,lbl_inst,lbl_instexp;
//	private JLabel lbl_jumbwordans[],lbl_antcluesans[],lbl_anssym[];	// labels
//	private ImageIcon imgi_title,imgi_subtitle,imgi_back1,imgi_back2,imgi_showans1,imgi_showans2,imgi_help1,imgi_help2;	// image icons
//	private ImageIcon imgi_verify1,imgi_verify2,imgi_nextset1,imgi_nextset2,imgi_home1,imgi_home2,imgi_yes,imgi_no;
//	private JButton btn_back,btn_showans,btn_verify,btn_home,btn_nextset,btn_help;	// buttons
//	private JTextField[] tf_ans;
//	private JTextArea ta_inst,ta_instexp;	// text areas
//	private Font f1,f2;
//	private StringTokenizer stz_str2,stz_st;	// different string tokenizer variables
//	private Tokenizer stz_str3;
//	private String str_s;
//	private Vector vect_jumbword,vect_antcluesans,vect_jumbwordans;		// different vector variables
//	private boolean flag_verify = true,flag = true;		
//    private int i=0,a=0,indx_verify=0,indx_show=0;		// index values of verify and show blocks
//	private Rand rand;				// ref obj of the Rand class
//	private JumbledWord jumbword;	// ref obj of the JumbledWord class
//	private Anagrams ang;			// ref obj of the Anagrams class
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//	private EncryptString dec;
//
//	public AntonymClues_Others()
//	{
//		/**
//		* This is a constuctor which calls design method and other methods
//		* and also initializes the different vectors and components.
//		*/
//		try{
//		dec = new EncryptString();
//		lbl_anssym = new JLabel[10];
//		tf_ans = new JTextField[10];	
//		design();				// calling design method
//		setLayout(null);		// setting panel layout to null
//	 	setBackground(new Color(228,250,250));
//		setSize(800,600);
//		lbl_jumbwordans = new JLabel[10];
//		lbl_antcluesans = new JLabel[10];
//		for(int i=0;i<10;i++)
//		{
//			lbl_jumbwordans[i] = new JLabel();
//			lbl_antcluesans[i] = new JLabel();
//		}
//		vect_antcluesans = new Vector();
//		rand = new Rand();	
//		vect_jumbwordans = Anagrams.getWordsData(Anagrams.str_filedata[0]); // returns vector which holds word answers
//        antonym();			// calling antonym method
//		jumbword = new JumbledWord();
//		vect_jumbword = jumbword.getJumbleWords(vect_jumbwordans);	// returns vector which holds jumbled words
//	    } catch(Exception ANAGRAMS17) { error(ANAGRAMS17,"ANAGRAMS1017"); }
//
//	}	// end of AntonymClues constructor
//
//	public void design()
//	{
//	    /**
//	    * This method initializes and adds the components like buttons,labels,
//	    * images,text fields and text areas.
//	    */
//
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
//		f1  = new Font("Arial",Font.BOLD,13);					// setting the text font type,size
//        f2  = new Font("Arial",Font.PLAIN,12);
//
//		ta_inst = new JTextArea("Instructions:");
//		ta_inst.setForeground(Color.red);
//	 	ta_inst.setBackground(new Color(228,250,250));
//		ta_inst.setFont(f1);
//		ta_inst.setBounds(30,110,80,24);
//		add(ta_inst);
//		ta_inst.setEditable(false);
//
//		ta_instexp = new JTextArea("These jumbled words are a real challenge. Take care that they don't scramble up your brain!.");
//		ta_instexp.setForeground(Color.blue);
//	 	ta_instexp.setBackground(new Color(228,250,250));
//		ta_instexp.setFont(f2);
//		ta_instexp.setBounds(120,110,650,24);
//		add(ta_instexp);
//		ta_instexp.setEditable(false);
//
//		lbl_jumbword = new JLabel("Jumbled Word");
//		lbl_jumbword.setBounds(70,130,120,30);
//		add(lbl_jumbword);
//	    lbl_jumbword.setFont(new Font("SansSerif",Font.BOLD,15));
//
//        lbl_antclues = new JLabel("Antonym Clues");
//		lbl_antclues.setBounds(250,130,200,24);
//		add(lbl_antclues);
//		lbl_antclues.setFont(new Font("SansSerif",Font.BOLD,14));
//
//        lbl_typecorword = new JLabel("Type Correct Word");
//		lbl_typecorword.setBounds(510,130,170,34);
//		add(lbl_typecorword);
//		lbl_typecorword.setFont(new Font("SansSerif",Font.BOLD,14));
//
//		for(int i=0;i<10;i++)
//		{
//			tf_ans[i] = new JTextField();		// creating answer textfield objs 
//			tf_ans[i].setToolTipText("Type your word");	// setting ToolTipText of the textfield
//			tf_ans[i].setBounds(520,180+30*i,140,24);	
//	        add(tf_ans[i]);					// adding textfield to panel
//	    }	// end of for loop
//
//		imgi_back1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_back.gif");		// creating objs of imageicons
//		imgi_back2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_back.gif");
//		btn_back = new JButton(imgi_back1);
//		btn_back.setBounds(140,510,125,32);
//		add(btn_back);
//		btn_back.addActionListener(this);		// adding actionListener to button
//		btn_back.setMnemonic('b');				// setting Mnemonic of the button
//		btn_back.setToolTipText("Back");		// setting Tool tip text of the button
//	    btn_back.requestFocus();
//	    btn_back.setNextFocusableComponent(btn_showans);
//		btn_back.setRolloverIcon(imgi_back2);	// setting Rollover icon of the button
//		btn_back.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250))); // removing lineborder of the button
//
//		imgi_showans1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_showans.gif");
//		imgi_showans2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_showans.gif");
//		btn_showans = new JButton(imgi_showans1);
//		btn_showans.setBounds(400,510,125,32);
//		add(btn_showans);
//		btn_showans.addActionListener(this);
//		btn_showans.setMnemonic('s');
//		btn_showans.setToolTipText("Show Answers");
//	    btn_showans.setNextFocusableComponent(btn_verify);
//		btn_showans.setRolloverIcon(imgi_showans2);
//		btn_showans.setBorder(BorderFactory.createLineBorder(new Color(228,250,250)));
//
//		imgi_verify1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_verians.gif");
//		imgi_verify2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_verians.gif");
//		btn_verify =new JButton(imgi_verify1);
//		btn_verify.setBounds(270,510,125,32);
//		add(btn_verify);
//		btn_verify.addActionListener(this);
//		btn_verify.setMnemonic('v');
//		btn_verify.setToolTipText("Verify Answers");
//	    btn_verify.setNextFocusableComponent(btn_help);
//		btn_verify.setRolloverIcon(imgi_verify2);
//		btn_verify.setBorder(BorderFactory.createLineBorder(new Color(228,250,250)));
//
//		imgi_yes = new ImageIcon(mainpage.MainPage.workpath+workpath+"bu1_yes.gif");
//		imgi_no = new ImageIcon(mainpage.MainPage.workpath+workpath+"bu1_no.gif");
//		for(int i=0;i<10;i++)
//		{
//			lbl_anssym[i] = new JLabel();		// creating objs of answer symbol labels
//			lbl_anssym[i].setBounds(670,175+30*i,50,32); //600,180
//			add(lbl_anssym[i]);		// adding labels to panel
//	    }	// end of for loop
//
//		imgi_help1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_help.gif");
//	    imgi_help2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_help.gif");
//        btn_help = new JButton(imgi_help1);
//        btn_help.setBorderPainted(false);
//        btn_help.setBounds(530,510,125,31);
//        add(btn_help);
//		btn_help.setRolloverIcon(imgi_help2);
//	    btn_help.setMnemonic('p');							// setting mnemonic of button
//		btn_help.setToolTipText("Help");				// setting tool tip text to button
//	    btn_help.setNextFocusableComponent(btn_nextset);
//        btn_help.addActionListener(this);
//
//		imgi_nextset1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_nextset.gif");
//		imgi_nextset2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_nextset.gif");
//		btn_nextset = new JButton(imgi_nextset1);
//		btn_nextset.setBounds(660,510,125,32);
//		add(btn_nextset);
//		btn_nextset.addActionListener(this);
//		btn_nextset.setMnemonic('n');
//		btn_nextset.setToolTipText("Next Set");
//	    btn_nextset.setNextFocusableComponent(btn_home);
//		btn_nextset.setRolloverIcon(imgi_nextset2);
//		btn_nextset.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//
//		imgi_home1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_home.gif");
//		imgi_home2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_home.gif");
//		btn_home =new JButton(imgi_home1);
//		add(btn_home);
//		btn_home.setBounds(10,510,125,32);
//		btn_home.addActionListener(this);
//		btn_home.setMnemonic('h');
//		btn_home.setToolTipText("Home");
//	    btn_home.setNextFocusableComponent(btn_back);
//		btn_home.setRolloverIcon(imgi_home2);
//		btn_home.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250)));
//	    } catch(Exception ANAGRAMS18) { error(ANAGRAMS18,"ANAGRAMS1018"); }
//
//	}	// end of design method
//
//	public void actionPerformed(ActionEvent ae)
//	{
//	  /**
//	  * This method is used to listen the swing components, whenever a particular compnent is
//	  * activated then the corresponding action will be displayed on the pane.
//	  */
//
//		try{
//		Object source = ae.getSource();
//		if(source == btn_back)
//		{
//		 // if the user pressed back button then it decrements the index val by 10 and shows the previous page
//			clear();			// calling clear method
//			btn_showans.addActionListener(this);	
//			btn_verify.addActionListener(this); 
//			for(int j=0; j<10; j++)
//			{
//				lbl_anssym[j].setVisible(false);
//				tf_ans[j].setEditable(true);
//			}	// end of for loop
//			Anagrams.flag_back = false;
//			Anagrams.count = Anagrams.index-10;
//			Anagrams.angcards.show(getParent(),"gotoanagrams");
//	 	}	// end of btn_back if condition
//
//	    else if(source == btn_showans)
//	    {
//		  /**
//		  *	It will show the answers in text fields by taking the values from vectors.
//		  */
//			int loc_show=indx_show;
//			for (int i=0; i<10; i++)
//			{
//				lbl_anssym[i].setVisible(false);	// setting answer symbol label visible to false
//				tf_ans[i].setText(dec.decryptString((String)vect_jumbwordans.elementAt(loc_show-1)));
//				tf_ans[i].setEditable(false);	// setting answer textfield editable to false
//				loc_show++;			// incrementing index value of show block
//			}	// end of for loop
//			repaint();			// calling repaint method
//			flag_verify = false;
//			flag = false;
//			btn_verify.setRolloverEnabled(false);		// setting button rollover enabled to false
//			btn_showans.removeActionListener(this);		// removing actionListener from the buttons
//			btn_verify.removeActionListener(this);
//	    }	// end of btn_showans if condition
//
//		else if((source == btn_verify) && (flag_verify == true))
//		{
//
//		 /**
//		 * This will check the values from textfields with original answer vector elements
//		 * and displays the correct or wrong answer symbols.
//		 */
//		  int loc_verify;
//		 loc_verify=indx_verify;
//			for(int i=0; i<10; i++)
//			{
//				if(tf_ans[i].getText().length()!=0)	 // if the user selected the answer
//				{
//					lbl_anssym[i].setVisible(true);	// setting answer symbol label visible to true
//					if((dec.decryptString((String)vect_jumbwordans.elementAt(loc_verify-1))).equalsIgnoreCase(tf_ans[i].getText()))
//						lbl_anssym[i].setIcon(imgi_yes);	// setting the answer symbol icon to label
//					else
//						lbl_anssym[i].setIcon(imgi_no);
//					repaint();
//					tf_ans[i].setEditable(false);		// setting answer textfield editable to false
//				}	// end of inner if condition
//				loc_verify++;			// incrementing index value of the verify block
//			}	// end of for loop
//		}	// end of btn_verify if condition
//
//		else if(source == btn_nextset)
//		{
//		   /**
//		   * NextSet will displays the next 10 jumbled values
//		   */
//			flag_verify = true;
//			btn_verify.setRolloverEnabled(true);		// setting button rollover enabled to true
//			if(!flag)
//			{
//				btn_verify.addActionListener(this);		// adding actionListener to buttons
//				btn_showans.addActionListener(this);
//				flag = true;
//			}
//       		clear();			// calling clear method
//			for(int j=0; j<10; j++)
//			{
//				lbl_anssym[j].setVisible(false);
//				tf_ans[j].setEditable(true);
//			}	// end of for loop
//
////			if(Anagrams.index >= vect_jumbwordans.size())
//			// if main record index value is greaterthan or equal to total records then sets record pointer value to zero				
////			{
////				Anagrams.index = 1;
////			}
//			Anagrams.angcards.show(getParent(),"gotoanagrams");	// shows particular card
//		}	// end of btn_nextset if condition
//
//		else if(source == btn_home)
//		{
//			 Anagrams.angcards.show(getParent(),"gotoanagrams");
////			 play.Anagrams.index=play.Anagrams.index+1;
// 			 wordmine.main.WordMine1.Wordmineid[4]=Anagrams.index;
//			 wordmine.main.WordMine1.count=0;
//			 
//		     wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");//added for integration
//			 wordmine.main.WordMine1.forMain1();
//		}	// end of btn_home if condition
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
////				WordMine1.wmh.setVisible(true);
//			/*WordMine1.wmh.setVisible(true);
//			if(WordMine1.wmh.getState()==Frame.ICONIFIED)
//			{
//				WordMine1.wmh.setState(Frame.NORMAL);
//				WordMine1.wmh.toFront();
//			}*/
//			WordMine1.wmh.show();
//		}	// end of btn_help if condition
//	    } catch(Exception ANAGRAMS19) { error(ANAGRAMS19,"ANAGRAMS1019"); }
//
//	}	// end of actionPerformed method
//
//	public void antonym()
//	{
//	  /**
//	  * antonym method will read the particular record from readfile and make it into
//	  *	tokens. And stores antonym clues values into particular vector.
//	  */
//		try{
//		int i=0;
//    	stz_str3 = new Tokenizer((Anagrams.str_filedata[2]),"#");
//		while(stz_str3.hasMoreElements())
//		{
//			 Tokenizer stz_str4 = new Tokenizer(stz_str3.nextToken(),"$");
//			 String  str_s1 = stz_str4.nextToken();
//			 String[] a3 = new String[4];
//			 a3[0] = stz_str4.nextToken();
//			 a3[1] = stz_str4.nextToken();
//			 a3[2] = stz_str4.nextToken();
//			 a3[3] = stz_str4.nextToken();
//			 int ans = Integer.parseInt(dec.decryptString(stz_str4.nextToken()));
//			 if(ans==0)
//				 vect_antcluesans.addElement(a3[0]);		// adding antclues into vector
//			 else
//				 vect_antcluesans.addElement(a3[ans-1]);		// adding antclues into vector
//       }	// end of while loop
//	   } catch(Exception ANAGRAMS20) { error(ANAGRAMS20,"ANAGRAMS1020"); }
//  	}	// end of antonym method
//
//	public void pageDisplay(int ind)
//	{
// 	  /**
//	  * This method takes the record index value as input and displays different components
//	  * along with values.
//	  */
//		try{
//		indx_verify = ind;		// setting index value to verify and show block indices
//		indx_show = ind;
//		
//		if(ind == vect_jumbword.size())
//		{
//			ind=1;
//		}
//
////		if(ind>=3141)
////		{
////		   JOptionPane.showMessageDialog(null,"Anagrams Excercise Completed","NEOVEDA-WORDMINE",1);
////	 	   ind = 1;
////		}	// end of if block
////		else	
////		if(ind<3141)
//		if(ind<2201)
//		{
//          for(int h=0; h<10; h++)
//		  {
//		    lbl_jumbwordans[h].setText((String)vect_jumbword.elementAt(ind-1));
//	        lbl_jumbwordans[h].setBounds(70,180+30*h,120,24);
//  		    add(lbl_jumbwordans[h]);
//			if(dec.decryptString((String)vect_antcluesans.elementAt(ind-1)).equals("null"))
//			    lbl_antcluesans[h].setText("--") ;
//			else
//			    lbl_antcluesans[h].setText(dec.decryptString((String)vect_antcluesans.elementAt(ind-1))) ;
//		    lbl_antcluesans[h].setBounds(250,180+30*h,225,24);
//		    add(lbl_antcluesans[h]);
//			ind++;
//  		  }	// end of for loop
//        }	// end of if block
//	    } catch(Exception ANAGRAMS21) { error(ANAGRAMS21,"ANAGRAMS1021"); }
//
//	}	// end of pageDisplay method
//
//	public void clear()
//	{
//	  /**
//	  *	clear method will clears the different component values.
//	  */
//		try{
//		flag_verify = true;
//		btn_showans.addActionListener(this);	
//		btn_verify.addActionListener(this); 
//		for(int k=0; k<10; k++)
//		{
//			tf_ans[k].setEditable(true);
//			lbl_anssym[k].setVisible(false);
//			lbl_jumbwordans[k].setText("");
//			lbl_antcluesans[k].setText("");
//			tf_ans[k].setText("");
//			repaint();
//		}	// end of for loop
//	    } catch(Exception ANAGRAMS22) { error(ANAGRAMS22,"ANAGRAMS1022"); }
//
//	}	// end of clear method
//
//	private void error(Exception exec,String str)
//	{ 
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of AntonymClues class
package _JD_53_CHECK_GLOBARENA_WEBTECHNOLOGIES;


