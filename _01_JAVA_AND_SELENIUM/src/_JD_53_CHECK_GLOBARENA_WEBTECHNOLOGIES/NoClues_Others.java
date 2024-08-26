///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*..............................................................................................
//. This file takes the strings from wordmaster file and converts normal word into jumbled word  . 
//. and will be displayed on the pane. User should guess the word without any clues and type it  .
//. in Textfield. Here the encrypted wordmaster file will be decrypted(Using Rijndal algorithm)  .
//. and displayes the content.																   .
//. @author  SATISH REDDY                                                                        .
//. @Date    8.9.2001										 							           .
//. @Version  1.0 						                                                       .
//..............................................................................................*/
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
//public class NoClues extends JPanel  implements ActionListener
//{
//	private JLabel lbl_jumbword,lbl_typecorword,lbl_title,lbl_subtitle,lbl_inst,lbl_instexp;
//	private JLabel lbl_jumbwordans[],lbl_anssym[];	// labels
//	private ImageIcon imgi_title,imgi_subtitle,imgi_back1,imgi_back2,imgi_showans1,imgi_showans2,imgi_help1,imgi_help2;	// image icons
//	private ImageIcon imgi_verify1,imgi_verify2,imgi_nextset1,imgi_nextset2,imgi_home1,imgi_home2,imgi_yes,imgi_no;
//	private JButton btn_back,btn_showans,btn_verify,btn_home,btn_nextset,btn_help;	// buttons
//	private JTextField[] tf_ans;
//	private JTextArea ta_inst,ta_instexp;
//	private Font f1,f2;
//	private StringTokenizer stz_str2,stz_str3,stz_st;	// string tokenizer variables
//	private String str_s;
//	public Vector vect_jumbword,vect_jumbwordans;		// different vector variables
//	private boolean flag_verify = true,flag = true;	
//    private int i=0,a=0,indx_verify=0,indx_show=0;		// index variables of verify and show blocks
//	private Rand rand;					// ref obj of Rand class
//	private JumbledWord jumbword;		// ref obj of JumbledWord class
//	private Anagrams ang;				// ref obj of Anagrams class
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//	private EncryptString dec;
//
//	public NoClues()
//	{
//		/**
//		* This is a constuctor which calls design method and other methods and also initializes
//		* the different components. It calls getWordsData and getJumbleWords methods.
//		*/
//		try{
//		dec = new EncryptString();
//		lbl_anssym = new JLabel[10];
//		tf_ans = new JTextField[10];
//		design();			// calling design method
//		setLayout(null);	// setting panel layout to null
//	 	setBackground(new Color(228,250,250));
//		setSize(800,600);
//		lbl_jumbwordans = new JLabel[10];
//		for(int i=0;i<10;i++)
//			lbl_jumbwordans[i] = new JLabel();
//		rand = new Rand();
//		vect_jumbwordans = Anagrams.getWordsData(Anagrams.str_filedata[0]);	// it returns vector which holds answer values
//		jumbword = new JumbledWord();
//		vect_jumbword = jumbword.getJumbleWords(vect_jumbwordans);	// it returns vector which holds jumbled words
//	    } catch(Exception ANAGRAMS23) { error(ANAGRAMS23,"ANAGRAMS1023"); }
//
//	}	// end of NoClues constructor
//
//	public void design()
//	{
//
//	    /**
//	    * This method initializes and adds the components like buttons,labels,
//	    * images,text fields and text areas.
//	    */
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
//        f1  = new Font("Arial",Font.BOLD,13);					// setting the text font type,size
//        f2  = new Font("Arial",Font.PLAIN,12);
//
//		ta_inst = new JTextArea("Instructions:");
//        ta_inst.setForeground(Color.red);
//	 	ta_inst.setBackground(new Color(228,250,250));
//        ta_inst.setFont(f1);
//		ta_inst.setBounds(30,110,80,24);
//		add(ta_inst);
//		ta_inst.setEditable(false);
//
//		ta_instexp = new JTextArea("These jumbled words are a real challenge. Take care that they don't scramble up your brain!.");
//        ta_instexp.setForeground(Color.blue);
//	 	ta_instexp.setBackground(new Color(228,250,250));
//        ta_instexp.setFont(f2);
//		ta_instexp.setBounds(120,110,650,24);
//		add(ta_instexp);
//		ta_instexp.setEditable(false);
//
//		lbl_typecorword = new JLabel("Jumbled Word");
//		lbl_typecorword.setBounds(70,130,120,30);
//		add(lbl_typecorword);
//		lbl_typecorword.setFont(new Font("SansSerif",Font.BOLD,14));
//		
//		lbl_jumbword = new JLabel("Type Correct Word");
//		lbl_jumbword.setBounds(300,130,170,34);
//		add(lbl_jumbword);
//	    lbl_jumbword.setFont(new Font("SansSerif",Font.BOLD,15));
//
//		for(int i=0; i<10; i++ )
//		{
//			tf_ans[i] = new JTextField();
//			tf_ans[i].setToolTipText("Type your word");
//			tf_ans[i].setBounds(300,180+30*i,140,24);
//	        add(tf_ans[i]);
//	    }	// end of for loop
//
//		imgi_back1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_back.gif");
//		imgi_back2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_back.gif");
//		btn_back = new JButton(imgi_back1);
//		btn_back.setBounds(140,510,125,32);
//		add(btn_back);
//		btn_back.addActionListener(this);			// adding actionListener to button
//		btn_back.setMnemonic('b');					// setting Mnemonic value of the button
//		btn_back.setToolTipText("Back");			// setting Tool tip text of the button
//	    btn_back.requestFocus();
//	    btn_back.setNextFocusableComponent(btn_showans);
//		btn_back.setRolloverIcon(imgi_back2);		// setting Rollover icon of the button
//		btn_back.setBorder(BorderFactory.createLineBorder(new Color(228, 250, 250))); // removing lineborder from button
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
//			lbl_anssym[i] = new JLabel();		// creating objs of the answer symbol label components
//			lbl_anssym[i].setBounds(450,175 +30*i,50,32);	// setting bounds of the labels
//			add(lbl_anssym[i]);
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
//	    } catch(Exception ANAGRAMS24) { error(ANAGRAMS24,"ANAGRAMS1024"); }
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
//		 // if the user pressed back button then decreases the record index value by 10 and also shows the previous page
//			flag_verify = true;
//			btn_verify.setRolloverEnabled(true);		// setting button rollover enabled to true
//			btn_showans.addActionListener(this);	
//			btn_verify.addActionListener(this); 
//			if(!flag)
//			{
//				btn_verify.addActionListener(this);		// adding actionListeners to buttons
//				btn_showans.addActionListener(this);
//				flag = true;
//			}	// end of !flag if condition
//       		clear();		// calling clear method, which clears the all the component values
//			for(int j=0; j<10; j++)
//			{
//				lbl_anssym[j].setVisible(false);
//				tf_ans[j].setEditable(true);
//			}	
//			Anagrams.flag_back = false;
//			Anagrams.count = Anagrams.index-10;
//			Anagrams.angcards.show(getParent(),"gotoanagrams");
//	 	}	// end of btn_back if condition
//
//		else if(source == btn_showans)
//	    {
//		  /**
//		  *	It will show the answers in text fields by taking the values from vectors.
//		  */
//			int loc_show=indx_show;
//			for (int i=0; i<10; i++)
//			{
//				lbl_anssym[i].setVisible(false);	// setting answer symbol label visible to false
//				tf_ans[i].setText(dec.decryptString((String)vect_jumbwordans.elementAt(loc_show-1)));
//				tf_ans[i].setEditable(false);	// setting textfield answer editable to false
//				loc_show++;		// incrementing index val of show block
//			}	// end of for loop
//			repaint();
//			flag_verify = false;
//			flag = false;
//			btn_verify.setRolloverEnabled(false);		// setting button rollover enabled to false
//			btn_showans.removeActionListener(this);		// removing actionListeners from buttons
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
//		   int loc_verify;
//		 loc_verify=indx_verify;
//			for(int i=0; i<10; i++)
//			{
//				if(tf_ans[i].getText().length()!=0)		// if user selected the answer
//				{
//					lbl_anssym[i].setVisible(true);		// setting answer symbol label visible to true
//					if((dec.decryptString((String)vect_jumbwordans.elementAt(loc_verify-1))).equalsIgnoreCase(tf_ans[i].getText()))
//						lbl_anssym[i].setIcon(imgi_yes);	// setting the answer symbol icon to label
//					else
//						lbl_anssym[i].setIcon(imgi_no);
//					repaint();					// calling repaint method
//					tf_ans[i].setEditable(false);	// setting textfield answer editable to false	
//				}	// end of if condition
//				loc_verify++;			// incrementing index val of the verify block
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
//				btn_verify.addActionListener(this);		// adding actionListeners to buttons
//				btn_showans.addActionListener(this);
//				flag = true;
//			}	// end of !flag if condition
//       		clear();		// calling clear method, which clears the all the component values
//			for(int j=0; j<10; j++)
//			{
//				lbl_anssym[j].setVisible(false);
//				tf_ans[j].setEditable(true);
//			}	// end of for loop
//
//			Anagrams.angcards.show(getParent(),"gotoanagrams");	// showing particular card
//		}	// end of btn_nextset if condition
//
//		else if(source == btn_home)
//        {
//			 Anagrams.angcards.show(getParent(),"gotoanagrams");
//  			 wordmine.main.WordMine1.Wordmineid[4]=Anagrams.index;
//			 wordmine.main.WordMine1.count=0;
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
//			/*WordMine1.wmh.setVisible(true);
//			if(WordMine1.wmh.getState()==Frame.ICONIFIED)
//			{
//				WordMine1.wmh.setState(Frame.NORMAL);
//				WordMine1.wmh.toFront();
//			}*/
//			WordMine1.wmh.show();
//		}	// end of btn_help if condition
//	    } catch(Exception ANAGRAMS25) { error(ANAGRAMS25,"ANAGRAMS1025"); }
//
//	}	// end of actionPerformed method
//
//	public void pageDisplay(int ind)
//	{
//	  /**
//	  * This method takes the record index value as input and displays different components
//	  * along with values.
//	  */
//		try{
//		indx_verify = ind;		// setting index values to verify, show block indices 
//		indx_show = ind;
//
//		if(ind < vect_jumbword.size())
//		{
//          for(int h=0; h<10; h++)
//		  {
//		    lbl_jumbwordans[h].setText((String)vect_jumbword.elementAt(ind-1));
//	        lbl_jumbwordans[h].setBounds(70,180+30*h,120,24);
//  		    add(lbl_jumbwordans[h]);
//			ind++;
//  		  }	// end of for loop
//          flag=true;
//        }	// end of if block
//	    } catch(Exception ANAGRAMS26) { error(ANAGRAMS26,"ANAGRAMS1026"); }
//
//	}	// end of pageDisplay method
//
//	public void clear()
//	{
//	  /**
//	  *	clear method will clears the different component values.
//	  */
//		try{
//		for(int k=0; k<10; k++)
//		{
//			lbl_jumbwordans[k].setText("");
//			lbl_anssym[k].setVisible(false);
//			tf_ans[k].setText("");
//			tf_ans[k].setEditable(true);
//			repaint();
//		}	// end of for loop
//	    } catch(Exception ANAGRAMS27) { error(ANAGRAMS27,"ANAGRAMS1027"); }
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
//}	// end of NoClues class
package _JD_53_CHECK_GLOBARENA_WEBTECHNOLOGIES;


