///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*...............................................................................................
//. This file takes the strings from passages and converts normal word into jumbled word and will .
//. be displayed on the pane. Based on the passage, user should guess the word and type it in     .
//. Textfield. Here the encrypted wordmaster file will be decrypted(Using Rijndal algorithm) and  .
//. displayes the content.																		.
//. @author  SATISH REDDY																			.
//. @Date    8.9.2001																				.
//. @Version  1.0																					.
//...............................................................................................*/
//
//package wordmine.play;
//
//import java.io.*;
//import java.math.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.text.*;
//import java.util.*;
//import java.util.StringTokenizer;
//import wordmine.main.*;
//import wordmine.learn.*;
//import rijndael.*;		// package to encrypt & decrypt the files
//
//public class PassageWord extends JPanel implements ActionListener
//{
//	private JTextPane tp_passage;	// text panes
//	public static Hashtable ht;		// static ref obj of Hashtable
//	private JLabel lbl_jumbleword[],lbl_anssym[],lbl_title,lbl_subtitle,lbl_back,lbl_showans,lbl_verify;
//	private JLabel lbl_nextset,lbl_home,lbl_psgwds[],lbl_drawline;	// labels
//	private ImageIcon imgi_title,imgi_subtitle,imgi_back1,imgi_back2,imgi_showans1,imgi_showans2,imgi_help1,imgi_help2;	// image icons
//	private ImageIcon imgi_verify1,imgi_verify2,imgi_yes,imgi_no,imgi_nextset1,imgi_nextset2,imgi_home1,imgi_home2;
//	private JTextField tf_ans[];
//	private JButton btn_back,btn_showans,btn_verify,btn_nextset,btn_home,btn_help;	// buttons
//	private Vector vect_totaljumbwds,vect_totalwds;		// different vector variables
//	private int len = 0,y = 10;  
//	private JumbledWord jumbword;			// ref obj of the JumbleWord class
//	private boolean flag_verify = true,flag = true;		// flag variable of the verify block
//	private Anagrams ang;			// ref obj of the Anagrams class
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//	private EncryptString dec;
//
//	public PassageWord()
//	{
//		/**
//		* This is a constuctor which calls design method and other methods and also
//		* initializes the text pane,label components. It calls the getPassageData method.
//		*/
//		try{
//		setLayout(null);		// setting panel layout to null
//	 	setBackground(new Color(228,250,250));
//		dec = new EncryptString();
//		ht = new Hashtable();
//		lbl_jumbleword = new JLabel[10];
//		tf_ans = new JTextField[10];                
//		lbl_anssym = new JLabel[10];
//		design();			// calling design method
// 		getPassageData();	// calling getPassageData method
//   		setSize(800,600);
//	    } catch(Exception ANAGRAMS28) { error(ANAGRAMS28,"ANAGRAMS1028"); }
//
// 	}	// end of PassageWord constructor
//
// 	public void design()
// 	{
//
//		/**
//	    * This method initializes and adds the components like buttons,labels,
//	    * images and text fields.
//	    */
//		try{
// 		imgi_title = new ImageIcon(mainpage.MainPage.workpath+workpath+"title2.gif");
// 		lbl_title = new JLabel(imgi_title);
// 		lbl_title.setBounds(0,0,800,70);
// 		add(lbl_title);
//
//		imgi_subtitle = new ImageIcon(mainpage.MainPage.workpath+workpath+"title_anagrams.gif");
// 		lbl_subtitle = new JLabel(imgi_subtitle);
// 		lbl_subtitle.setBounds(0,71,800,20);
// 		add(lbl_subtitle);
//
//	 	tp_passage = new JTextPane();		// creating obj of text pane, which contains first passage
//	 	tp_passage.setBounds(50,100,700,200);//250
//	 	tp_passage.setBackground(new Color(228,250,250));
//		tp_passage.setEditable(false);
//
//	 	lbl_drawline = new JLabel();		// creating obj of label, which displays a line
//		lbl_drawline.setSize(tp_passage.getWidth(),30);
//
//		for(int i=0; i<10; i++)
//		{
//			lbl_jumbleword[i] = new JLabel();		// creating objs of jumbleword labels
//			lbl_jumbleword[i].setBounds(40,320+20*i,120,24);
//			add(lbl_jumbleword[i]);					// adding labels to panel
// 			tf_ans[i] = new JTextField();           // creating objs of answer text fields    
//			tf_ans[i].setBounds(175,320+20*i,160,24);
//	        add(tf_ans[i]);							// adding text fields to panel
// 	        tf_ans[i].setToolTipText("Type Your Word");	// setting ToolTipText of the text fields
//			lbl_anssym[i] = new JLabel();
//			lbl_anssym[i].setBounds(345,320+20*i,50,24);
//			add(lbl_anssym[i]);
//			int j = i;
//			i++;
//
//			lbl_jumbleword[i] = new JLabel();
//			lbl_jumbleword[i].setBounds(400,320+20*j,120,24);
//			add(lbl_jumbleword[i]);
// 			tf_ans[i] = new JTextField();               
// 			tf_ans[i].setBounds(570,320+20*j,160,24);
// 	        add(tf_ans[i]);
//	        tf_ans[i].setToolTipText("Type Your Word");
//			lbl_anssym[i] = new JLabel();
//			lbl_anssym[i].setBounds(740,320+20*j,50,24);
//			add(lbl_anssym[i]);
//   		}	// end of for loop
//
//		imgi_back1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_back.gif");		// creating image icon objs
//		imgi_back2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_back.gif");
//		btn_back = new JButton(imgi_back1);
//		btn_back.setBounds(140,510,125,32);
//		add(btn_back);
//		btn_back.addActionListener(this);				// adding actionListener to button
//		btn_back.setMnemonic('b');						// setting Mnemonic value of the button
//		btn_back.setToolTipText("Back");				// setting Tool tip text of the button
//	    btn_back.requestFocus();
//	    btn_back.setNextFocusableComponent(btn_showans);
//		btn_back.setRolloverIcon(imgi_back2);			// setting Rollover icon of the button
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
//	    } catch(Exception ANAGRAMS29) { error(ANAGRAMS29,"ANAGRAMS1029"); }
//
//	}	// end of design method
//
//	public void actionPerformed(ActionEvent ae)
//	{
//	  /**
//	  * This method is used to listen the swing components, whenever a particular compnent is
//	  * activated then the corresponding action will be displayed on the pane.
//	  */
//		try{
//		Object source = ae.getSource();
//		if(source == btn_back)
//		{
//		 // if the user pressed back button then it decrements the index val by 10 and shows the previous page
//		 flag_verify = true;
//			btn_verify.setRolloverEnabled(true);		// setting button rollover enabled to true
//			if(!flag)
//			{
//				btn_verify.addActionListener(this);		// adding actionListener to buttons
//				btn_showans.addActionListener(this);
//				flag = true;
//			}
//			clear();				// calling clear method
//			for(int i=0;i<10;i++)
//			{
//				lbl_anssym[i].setVisible(false);
//				tf_ans[i].setEditable(true);
//			}	// end of for loop
//			tp_passage.setEditable(true);
//			tp_passage.setText(" ");		// setting the passage values to blank
//			tp_passage.setEditable(false);
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
//			for (int i=0; i<10; i++)
//			{
//				lbl_anssym[i].setVisible(false);	// setting answer symbol lable visible to false
//				tf_ans[i].setText((String)vect_totalwds.elementAt(i));
//				tf_ans[i].setEditable(false);	// setting textfield answer editable to false
//			}	// end  of for loop
//			repaint();		// calling repaint method
//			flag_verify = false;
//			flag = false;
//			btn_verify.setRolloverEnabled(false);		// setting button rollover enabled to false
//			btn_showans.removeActionListener(this);		// removes actionListener from buttons
//			btn_verify.removeActionListener(this);
//	    }	// end of btn_showans if condition
//
//		else if((source == btn_verify)&&(flag_verify == true))
//		{
//			
//		 /**
//		 * This will check the values from textfields with original answer vector elements
//		 * and displays the correct or wrong answer symbols.
//		 */
//			for(int i=0; i<10; i++)
//			{
//				if(tf_ans[i].getText().length()!=0)		// if user selected the answer
//				{
//					lbl_anssym[i].setVisible(true);
//					if(((String)vect_totalwds.elementAt(i)).equalsIgnoreCase(tf_ans[i].getText()))
//						lbl_anssym[i].setIcon(imgi_yes);	// setting the answer symbol icon to label
//					else
//						lbl_anssym[i].setIcon(imgi_no);
//					repaint();
//					tf_ans[i].setEditable(false);		// setting text field editable to false
//				}	// end of inner if condition
//			}	// end of for loop
//		}	// end of btn_verify if condition
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
//
//		else if(source == btn_nextset)
//		{
//
//		  /**
//		  *	NextSet will get the next passages & 10 jumbled words from that passages and
//		  *	set to labels.
//		  */
//
//			flag_verify = true;
//			btn_verify.setRolloverEnabled(true);		// setting button rollover enabled to true
//			if(!flag)
//			{
//				btn_verify.addActionListener(this);		// adding actionListener to buttons
//				btn_showans.addActionListener(this);
//				flag = true;
//			}	// end of if condition
//			clear();				// calling clear method
//			for(int i=0;i<10;i++)
//			{
//				lbl_anssym[i].setVisible(false);
//				tf_ans[i].setEditable(true);
//			}	// end of for loop
//			tp_passage.setEditable(true);
//			tp_passage.setText(" ");		// setting the passage values to blank
//			tp_passage.setEditable(false);
//			int ind = ((Anagrams.index)/10)+1;
//			Anagrams.angcards.show(getParent(),"gotoanagrams");	// showing particular card
//		}	// end of btn_nextset if condition
//
//		else if(source == btn_home)
//		{
//			 Anagrams.angcards.show(getParent(),"gotoanagrams");
// 			 wordmine.main.WordMine1.Wordmineid[4]=Anagrams.index;
//			 wordmine.main.WordMine1.count=0;
//			 wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine"); 			
//			 wordmine.main.WordMine1.forMain1();
////		     wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.c,"WordMine");//added for integration
//		}	// end of btn_home if condition
//	    } catch(Exception ANAGRAMS30) { error(ANAGRAMS30,"ANAGRAMS1030"); }
//	}	// end of actionPerformed method
//
//	private void getPassageData()
//	{
//		/**
//		* getPassageData will gets the data from the file, made into different tokens by
//		* using string tokenizer and the required token is stored it in hash table.
//		*/
//		 try{
//		 Tokenizer stz_str3 = new Tokenizer(Anagrams.str_filedata[3],"#");
//         while(stz_str3.hasMoreElements())
//         {
//		 	Tokenizer stz_str4 = new Tokenizer(stz_str3.nextToken(),"$");
//		 	String key =(String)stz_str4.nextToken();
//			String str_passages = stz_str4.nextToken();
//		 	ht.put(key,str_passages);	// storing passages in hash table based on key value
//		 }	// end of while loop
//	     } catch(Exception ANAGRAMS31) { error(ANAGRAMS31,"ANAGRAMS1031"); }
//	}	// end of getPassageData method
//
//	public JLabel[] getPsgLabels(String passage)
//	{
//		/**
//		* getPsgLabels method will takes the passage data as input, made into different
//		* tokens by using string tokenizer and creates required no of labels and returns
//		* that label array as output.
//		*/
//			try{
//			StringTokenizer  str;
//			String substr = "";
//			str = new StringTokenizer(passage);
//			len = str.countTokens();		// returns no of words in particular passage
//			lbl_psgwds = new JLabel[len];	
//			for(int i=0;i<len;i++)
//				lbl_psgwds[i] = new JLabel();
//			int count=0;
//		    jumbword = new JumbledWord();		// creating obj of the JumbledWord class
//			while(count<len)
//			{
//				substr = str.nextToken();
//				if ((substr.charAt(0))=='~')	// if the word exists
//				{
//					substr = substr.substring(1,(substr.length())-1);
//					Vector vect_word = new Vector();
//					vect_word.addElement(dec.encryptString(substr));	// adding word into vector	
//					vect_totalwds.addElement(substr);
//					Vector vect_jumbwd = jumbword.getJumbleWords(vect_word);	// it returns jumbled word
//					vect_totaljumbwds.addElement((String)vect_jumbwd.elementAt(0));	// adding jumbled words into vector
//					lbl_psgwds[count].setText((String)vect_jumbwd.elementAt(0)+"  ");
//					lbl_psgwds[count].setForeground(Color.red);		// setting answord label foreground color to red
//				}	// end of if block
//				else
//				{
//					lbl_psgwds[count].setText(substr+"  ");
//					lbl_psgwds[count].setForeground(Color.black);	// setting jumbledword label foreground color to black
//				}	// end of else block
//				count++;
//			}	// end of while loop
//			} catch(Exception ANAGRAMS32) { error(ANAGRAMS32,"ANAGRAMS1032"); }
//			return(lbl_psgwds);			// returning label array
//	}	// end of getPsgLabels method
//
//	public void clear()
//	{
//	   /**
//	   * clear method will clears the different component values.
//	   */
//		try{
//		for(int k=0; k<10; k++)
//		{
//			lbl_jumbleword[k].setText("");		// setting different component values to blank
//			lbl_anssym[k].setVisible(false);
//			tf_ans[k].setText("");
//			tf_ans[k].setEditable(true);
//			repaint();
//		}	// end of for loop
//	    } catch(Exception ANAGRAMS33) { error(ANAGRAMS33,"ANAGRAMS1033"); }
//	}	// end of clear method
//
//	public void splitPassage(String str_passages)
//	{
//	  /**
//	  * splitPassage method will takes the passage as input and divided this passage into two
//	  * different passages. And calls the getPsgLabels by passing each passage in a single time.
//	  * getPsgLabels method returns label array. Then this method creates the two text pane objs
//	  * and inserts all the label components into text pane.
//	  */
//
//		 try{
//		 vect_totalwds = new Vector();
//		 vect_totaljumbwds = new Vector();
//		 String str_passage1 =  str_passages.substring(0,str_passages.indexOf("@"));	// dividing passage into two different passages
//		 String str_passage2 = str_passages.substring(str_passages.indexOf("@")+1,str_passages.length());
//		 String lineStr = "";
//		 lbl_psgwds = getPsgLabels(str_passage1);	// it returns label array
//		 int totlen=0;
//		 tp_passage.setEditable(true);
//		 tp_passage.setText(" ");
//		 for(int i=0;i<len;i++)
//		 {
//			tp_passage.setCaretPosition(totlen);	// setting caret position of the first passage textpane
//		 	tp_passage.insertComponent(lbl_psgwds[i]);	// inserting different label components to textpane
//			totlen++;
//		 }	// end of for loop
//		 tp_passage.setCaretPosition(totlen);	// setting caret position of the first passage textpane
//		 for(int i=0;i<tp_passage.getWidth();i++)
//		    lineStr += "_";
//		 lbl_drawline.setText(lineStr);
//		 tp_passage.insertComponent(lbl_drawline);
//		 totlen++;
//		 lbl_psgwds = getPsgLabels(str_passage2);
//		 for(int i=0;i<10;i++)
//		    lbl_jumbleword[i].setText((String)vect_totaljumbwds.elementAt(i));
//		 tp_passage.setCaretPosition(totlen);	// setting caret position of the second passage textpane
//		 for(int i=0;i<len;i++)
//		 {
//			tp_passage.setCaretPosition(totlen);	// setting caret position of the second passage textpane
//		 	tp_passage.insertComponent(lbl_psgwds[i]); // inserting different label components to textpane
//			totlen++;
//		 }	// end of for loop
//		 tp_passage.setEditable(false);
//		 add(tp_passage);				// adding first passage textpane into panel
//	     } catch(Exception ANAGRAMS34) { error(ANAGRAMS34,"ANAGRAMS1034"); }
//
//	}	// end of splitPassage method
//
//	private void error(Exception exec,String str)
//	{
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of PassageWord class
