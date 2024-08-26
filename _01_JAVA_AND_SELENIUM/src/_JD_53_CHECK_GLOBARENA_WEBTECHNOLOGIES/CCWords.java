///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*...............................................................................................
//. This file takes the encrypted file and decrypted it(Using Rijndal algorithm). And displays the. 
//. content in different screens. Here it displays the words, and usage of the particular word in .
//. sentences. if we press the next button it goes to the next page which displays the next set	.
//. of words and related usage sentences.															.
//. @author  SATISH REDDY                                                                         .  
//. @Date    21/10/2001																			.
//. @Verion  1.0 																	                . 
//...............................................................................................*/
//
//package _J_30_Expectation_Handling_Try;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.util.*;
//import java.io.*;
//import javax.swing.JTextPane;
//import rijndael.*;			// package to encrypt & decrypt the files
//import wordmine.main.*;
//import wordmine.learn.*;
//import mainpage.*;
//
//
//public class CCWords extends JPanel implements MouseListener, ActionListener
//{
//	private JPanel[] pnl_qns = new JPanel[6];		// array of panels
//	private JLabel[] lbl_reset = new JLabel[3];			// array of reset labels
//	private JButton btn_home,btn_help,btn_showans,btn_verify,btn_nextset;
//	private JLabel[] lbl_anssymb = new JLabel[6];		// array of answer symbol labels
//	private JLabel lbl_title,lbl_tccwds,lbl_inst,lbl_instexp,lbl_words1[],lbl_words2[],lbl_words3[],lbl_words4[];
//	private JLabel lbl_st1,lbl_st2;
//	private JLabel lbl_ans1[] = new JLabel[6];			// array of first answer choice labels
//	private JLabel lbl_ans2[] = new JLabel[6];			// array of second answer choice labels
//    private String str_totdata;				// string variable of total data
//	Font f1,f2;
//    private Vector ccwds_v1,ccwds_v3,ccwds_v4,ccwds_vall,ccwds_vans;;
//	private static int ccwds_ptr=0;				// record pointer
//	private ImageIcon imgi_title,imgi_tccwds,imgi_reset1,imgi_reset2,imgi_home1,imgi_home2,imgi_help1,imgi_help2,imgi_showans1,imgi_showans2,imgi_verify1,imgi_verify2,imgi_nextset1,imgi_nextset2,imgi_yes,imgi_no;
//	private Display disp = new Display();			// reference obj of the display class
//    private Vector vect_str1 = new Vector();		// vector of first questions
//    private Vector vect_str2 = new Vector();		// vector of second questions
//    private Vector vect_str3 = new Vector();		// vector of first answers
//    private Vector vect_str4 = new Vector();		// vector of second answers
//	private Vector vect_rand,vect_randall;			// vectors of random nos
//	private Vector ccwds_vsymb;						
//	private boolean bool_resetflags[] = new boolean[6];	// boolean array of resetflags
//	private boolean flag_show=true;	
//    private Rand rand;						// reference obj of the Rand class
//    private EncryptString dec;     // for decrypting file to a string   
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//
//	public CCWords()
//	{
//	   try{
//   	  ccwds_ptr=wordmine.main.WordMine1.Wordmineid[8];
//	   rand = new Rand();			// creating obj of the Rand class
//	   design();		// calling design method
//	   // It reads encrpted data from cpccwdsdata.txt file and decrpted it and stores into a string
//		dec=new EncryptString();
//
//		str_totdata = wordmine.main.WordMine1.p_ccwdsdata;     //wordmine.main.  dec.decryptByteArray(getFile("cpccwdsdata.txt"));			
//		
//    	ccwds_v1 = disp.getVectTokens(str_totdata,"#");   // retuns vector which hold all the records
//		ccwds_v3 = ccwdsNextSet(ccwds_ptr);			// it returns first set of records 
//		ccwds_vall = new Vector();
//	  
//	  	for(int i=0;i<ccwds_v3.size();i++)
//        {
//          ccwds_v4 = ccwdsNextRecord(ccwds_v3,i);			// calls the nextRecord method which takes the set of records and returns each record fileds vector
//		  Enumeration enm = ccwds_v4.elements();
//		  int count=0;    
//    	  while(enm.hasMoreElements())
//		  {
//             ccwds_vall.addElement((String)enm.nextElement());
//			 count++;
//		  }
//        }	// end of for loop
//		  
//		vect_randall = new Vector();		
//		for(int j=0;j<6;j++)
//		{
//		  vect_rand = rand.getRandNos(2,2);		// it returns vector which holds random nos
//		  for(int k=0;k<vect_rand.size();k++)
//		     vect_randall.addElement((String)vect_rand.elementAt(k));
//		  vect_rand.removeAllElements();
//		}
//		setResetFlags(true);			// setting all reset flag values to true
//		lblsymb_visible(false);			// setting all answer symbol labels visible to false
//		flag_show=true;
//        ccwdsPageDisplay(ccwds_vall);              // calling ccwdsPageDisplay method 
//	   } catch(Exception CCWDS5) { error(CCWDS5,"CCWDS1005"); }
//	}	// end of CCWords constructor
//	
//	public void design()
//	{
//
//	    /**
//	    *  This function initializes and adds the necessary components like
//	    *  labels,text panes,buttons and images.
//	    */
//		try{
//		setLayout(null);				// setting panel layout to null
//		setBackground(new Color(228,250,255));
//		setSize(800,600);				// setting panel size
//		setVisible(true);				// setting panel visible to true
//
//		imgi_title = new ImageIcon(mainpage.MainPage.workpath+workpath+"title2.gif");	// creating image icon obj
//		lbl_title = new JLabel(imgi_title);					// creating label obj by passing imge icon
//		lbl_title.setBounds(0,0,800,70);					// setting label bounds
//		add(lbl_title);										// adding label to panel
//		
//		imgi_tccwds = new ImageIcon(mainpage.MainPage.workpath+workpath+"title_commonly-confused-wor.gif");
//		lbl_tccwds = new JLabel(imgi_tccwds);
//		lbl_tccwds.setBounds(0,72,800,22);
//		add(lbl_tccwds);
//		
//		f1  = new Font("Arial",Font.BOLD,13);					// setting the text font type,size
//        f2  = new Font("Arial",Font.PLAIN,12);
//
//		lbl_inst = new JLabel("Instructions:");
//        lbl_inst.setFont(f1);
//        lbl_inst.setBounds(10,100,80,30);						
//        add(lbl_inst);											
//
//        lbl_instexp = new JLabel("These words resemble each other in spelling/pronounciation but they are far apart in meaning. Click on your choice.");
//        lbl_instexp.setFont(f2);
//        lbl_instexp.setBounds(100,100,650,30);
//        add(lbl_instexp);
//
//		int x=20,y=140,w=630,h=42;	
//		for(int i=0;i<6;i++)
//		{
//		   pnl_qns[i] = new JPanel(new FlowLayout(FlowLayout.LEFT,0,-2)); // creating obj of the panels			
//		   pnl_qns[i].setBackground(new Color(228,250,255));
//		   pnl_qns[i].setBounds(x,y,w,h);					   // setting the panel bounds
//		   pnl_qns[i].setFont(f1);							   // setting font 
//	       add(pnl_qns[i]);										// adding panel to main panel
//		   y += 60; 											// incrementing the right position
//		}	// end of for loop
//
//		imgi_reset1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_reset.gif");		// creating the image icon objs
//        imgi_reset2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_reset.gif");
//
//		x=670;y=180;w=42;h=24;				// setting values to left,right,width & height variables
//		for(int i=0;i<3;i++)
//		{
//		  lbl_reset[i] = new JLabel(imgi_reset1);	// creating objs of the reset labels
//	      lbl_reset[i].setBounds(x,y,w,h);			// setting bounds of the reset labels
//          add(lbl_reset[i]);						// adding reset labels to panel
//	      lbl_reset[i].addMouseListener(this);		// setting mouse listener to label component
//		  y += 120;									
//		}	// end of for loop
//
//		x=740;y=140;w=22;h=22;	
//		for(int i=0;i<6;i++)
//		{
//		   lbl_anssymb[i] = new JLabel();
//		   lbl_anssymb[i].setBounds(x,y,w,h);
//   		   add(lbl_anssymb[i]);
//   		   y += 60; 								
//		   lbl_ans1[i] = new JLabel();				// creating objs of the first answer labels 
//		   lbl_ans2[i] = new JLabel();				// creating objs of the second answer labels 
//		   lbl_ans1[i].addMouseListener(this);		// adding mouse listeners to labels
//		   lbl_ans2[i].addMouseListener(this);
//        }	// end of for loop
//
//		imgi_home1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_home.gif");
//        btn_home = new JButton(imgi_home1);			// creating obj of the button
//        btn_home.setBorderPainted(false);			// setting button border painted value to false
//        btn_home.setBounds(30,510,125,32);			// setting button bounds
//        add(btn_home);								// adding button to panel
//        imgi_home2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_home.gif");
//        btn_home.setRolloverIcon(imgi_home2);		// setting button rollover icon
//	    btn_home.setMnemonic('h');
//	    btn_home.setToolTipText("Home");		
//        btn_home.requestFocus();
//	    btn_home.setNextFocusableComponent(btn_help);
//        btn_home.addActionListener(this);			// adding action listener to button		
//    
//        imgi_help1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_help.gif");
//        btn_help = new JButton(imgi_help1);
//		btn_help.setBackground(new Color(228,250,255));
//        btn_help.setBorderPainted(false);
//        btn_help.setBounds(465,510,125,32);
//        add(btn_help);
//        imgi_help2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_help.gif");
//        btn_help.setRolloverIcon(imgi_help2);				// setting button rollover icon
//	    btn_help.setMnemonic('p');
//	    btn_help.setToolTipText("Help");		
//	    btn_help.setNextFocusableComponent(btn_showans);
//        btn_help.addActionListener(this);
//
//        imgi_showans1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_showans.gif");
//        btn_showans = new JButton(imgi_showans1);
//        btn_showans.setBorderPainted(false);
//        btn_showans.setBounds(320,510,125,32);        
//		add(btn_showans);
//        imgi_showans2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_showans.gif");
//        btn_showans.setRolloverIcon(imgi_showans2);
//	    btn_showans.setMnemonic('s');
//	    btn_showans.setToolTipText("Show Answers");		
//	    btn_showans.setNextFocusableComponent(btn_verify);
//        btn_showans.addActionListener(this);
//
//		imgi_verify1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_verians.gif");
//        btn_verify = new JButton(imgi_verify1);
//        btn_verify.setBorderPainted(false);
//        btn_verify.setBounds(175,510,125,32);
//        add(btn_verify);
//        imgi_verify2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_verians.gif");
//        btn_verify.setRolloverIcon(imgi_verify2);
// 	    btn_verify.setMnemonic('v');
//	    btn_verify.setToolTipText("Verify Answers");		
//	    btn_verify.setNextFocusableComponent(btn_nextset);
//        btn_verify.addActionListener(this);
//
//        imgi_nextset1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_nextset.gif");
//        btn_nextset = new JButton(imgi_nextset1);
//        btn_nextset.setBorderPainted(false);
//        btn_nextset.setBounds(610,510,125,32);
//        add(btn_nextset);
//        imgi_nextset2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_nextset.gif");
//        btn_nextset.setRolloverIcon(imgi_nextset2);
// 	    btn_nextset.setMnemonic('n');
//	    btn_nextset.setToolTipText("Next Set");		
//	    btn_nextset.setNextFocusableComponent(btn_home);
//        btn_nextset.addActionListener(this);
//	    } catch(Exception CCWDS6) { error(CCWDS6,"CCWDS1006"); }
//
//	}	// end of design method
//
//	public void actionPerformed(ActionEvent ae)
//	{
//
//	   /**
//	   *  This method will listens button actions and takes the corrseponding
//	   *  actions.
//	   */
//		try{
//    	Object source=ae.getSource();
//		if(source==btn_home)//added for integration by Lavanya
//	    {
//		 callEnd();
//		 CCWordsCldemo.cl_cards.first(getParent());
//    	 wordmine.main.WordMine1.count=0;
//		 
//		 wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");
//		 wordmine.main.WordMine1.forMain1();
//	    }	// end of btn_home if condition
// 
//		else if(source==btn_help)
//		{
//		   /**
//	       * In this it creates the runtime obj and based on exec method it will runs
//		   * the particular help file by using of windows hh.exe file.
//	       */
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
//		else if(source==btn_showans)
//		{ 
//			lblsymb_visible(false);			// setting answer symbol labels visible to false
//			setResetFlags(false);			// setting all reset flag values to false
//			flag_show=false;				
//			for(int i=0;i<3;i++)
//  			   lbl_reset[i].removeMouseListener(this);	// removing mouse listener from reset labels
//			btn_verify.setRolloverEnabled(false);		// setting button rollover enabled to false
//			btn_verify.removeActionListener(this);		// removing mouse listener from verify button
//			lblans_visible(true);						// setting all answer labels visible to true
//			int j=0;
//	
//			for(int i=0;i<6;i++)
//			{
//				String sst1 = lbl_ans1[i].getText().trim();	
//				String sst2 = lbl_ans2[i].getText().trim();
//				String st3 = dec.decryptString((String) vect_str3.elementAt(j)).trim();
//				if(sst1.equalsIgnoreCase(st3))		// if selected first choice equal to the original answer
//					lbl_ans2[i].setVisible(false);	// setting the second choice label visible to false
//				if(sst2.equalsIgnoreCase(st3))	// if selected second choice equal to the original answer
//					lbl_ans1[i].setVisible(false);  // setting the first choice label visible to false
//				i++;
//			System.out.println("<--" + "sst1 :"+ sst1 + "sst2 :"+ sst2 + "st3 :"+ st3); 		
//				String sst3 = lbl_ans1[i].getText().trim();
//				String sst4 = lbl_ans2[i].getText().trim();
//				String st4 = dec.decryptString((String) vect_str4.elementAt(j)).trim();
//				if(sst3.equalsIgnoreCase(st4))	
//					lbl_ans2[i].setVisible(false);
//				else if(sst4.equals(st4))
//					lbl_ans1[i].setVisible(false);
//			System.out.println("sst3 :"+ sst3 + "sst4 :"+ sst4 + "st4 :"+ st4 +"->" );
//				j++;
//			}	// end of for loop
//		    validate();
//		    repaint();
//
//		}	// end of btn_showans if condition
//		else if((source==btn_verify)&&(flag_show==true))
//		{
//			ccwds_vans = new Vector();			// creating obj of the answer vector
//			for(int i=0;i<6;i++)
//				ccwds_vans.addElement("na");	// setting all answer values to 'na'(not attempted)
//			for(int i=0;i<6;i++)
//			{
//				if(bool_resetflags[i]==false)	// if reset flag value equal to false
//					ccwds_vans.setElementAt("a",i);	// setting the particular answer value to 'a'(attempted)
//			}	// end of for loop
//			ccwds_vsymb = new Vector();			// creating obj of the symbols vector
//			int j=0;
//			String strwr = "";
//			int count=0;						// initializing count value to zero
//			for(int i=0;i<6;i++)
//			{
//				if(((String)ccwds_vans.elementAt(i)).equals("na"))	// if user not attempt the question
//				{
//				  if(count==2)		// if count value equal to 2
//				  {
//					j++;			// incrementing the j value by 1
//					count=0;		// initializing count value to zero
//				  }
//				  strwr = "na";		// setting the strwr value to 'na'
//				  count++;			// incrementing count value by 1
//			   }	// end of na if condition
//			   else if(((String)ccwds_vans.elementAt(i)).equals("a"))	// if user attempt the question
//			   {
//				  if(count==2)
//				  {
//				    j++;
//					count=0;
//				  }
//
//				  if(count==0)
//				  {
//	  				 lbl_reset[j].removeMouseListener(this);	// removing mouser listener from reset label
//				     if(lbl_ans1[i].isVisible()==true)	// if first answer label visble true
//				     {
//						if((lbl_ans1[i].getText().trim()).equals(dec.decryptString((String)vect_str3.elementAt(j)).trim()))
//						// if first choice equal to original answer
//						   strwr = "r";		// setting the strwr value to 'r'(right)
//					    else		
//   						   strwr = "w";		// setting the strwr value to 'w'(wrong)
//				     } 
//  				     else if(lbl_ans2[i].isVisible()==true)
//				     {
//					     if((lbl_ans2[i].getText().trim()).equals(dec.decryptString((String)vect_str3.elementAt(j)).trim()))
//						    strwr = "r";
//					     else
//						    strwr = "w";
//				     }
//  			      } // end of count==0 if condition
//  				  else if(count==1)
//				  {
//	  				 lbl_reset[j].removeMouseListener(this);
//				     if(lbl_ans1[i].isVisible()==true)
//				     {
//					    if((lbl_ans1[i].getText().trim()).equals(dec.decryptString((String)vect_str4.elementAt(j)).trim()))
//						   strwr = "r";
//					    else
//   						   strwr = "w";
//				     }	// end of inner if condition
//
//  				     else if(lbl_ans2[i].isVisible()==true)
//				     {
//					     if((lbl_ans2[i].getText().trim()).equals(dec.decryptString((String)vect_str4.elementAt(j)).trim()))
//						    strwr = "r";
//					     else
//						    strwr = "w";
//				     }	// end of if condition
//  			      } // end of count==1 if condition
//		    	  count++;
//				}  // end of a if condition
//  				ccwds_vsymb.addElement(strwr);		// adding strwr value to symbol vector
//			}  // end of for loop
//			ansSymDisplay(ccwds_vsymb);		// calling ansSymDisplay method
//        }	// end of btn_verify if condition 
//       
//		else if(source==btn_nextset)
//		{ 
//			flag_show=true;
//			callEnd();
//		}	// end of btn_nextset if condition
//	    } catch(Exception CCWDS7) { error(CCWDS7,"CCWDS1007"); }
//
//	}	// end of action performed method
//
//	public void callEnd()
//	{
//		try{
//		lblsymb_visible(false);				// setting all symbol labels visible to false
//		for(int i=0;i<3;i++)
//  			lbl_reset[i].addMouseListener(this);	// adding mouse listener to reset labels
//		btn_verify.setRolloverEnabled(true);		// setting button rollover enabled to true
//		btn_verify.addActionListener(this);		// adding action listener to button
//
//	    if(ccwds_ptr>ccwds_v1.size())
//	    {
//		  // if the record pointer value and max no.of records are equal it displays the "end of records" message
////		  JOptionPane.showMessageDialog(getParent(),"Commonly confused words excercise completed","M.S-Ph.d Wordmine",1);
//		 CustomDialog cd = new CustomDialog(new Color(228,250,255),"wordmine/play",0,1,"Commonly confused words excercise completed.");
//		  ccwds_ptr = 1;
//	    }
//
//		if(ccwds_v3.size()!=0)
//		   ccwds_v3.removeAllElements();
//		ccwds_v3 = ccwdsNextSet(ccwds_ptr);			// it returns next set of records 
//
//		if(ccwds_vall.size()!=0)
//			ccwds_vall.removeAllElements();				// removing all the elements from the vector
//		if(ccwds_v4.size()!=0)
//			ccwds_v4.removeAllElements();				
//		for(int i=0;i<ccwds_v3.size();i++)
//		{
//			ccwds_v4 = ccwdsNextRecord(ccwds_v3,i);		// calls the nextRecord method which takes the set of records and returns each record fileds vector
//			Enumeration enm = ccwds_v4.elements();
//			while(enm.hasMoreElements())
//				ccwds_vall.addElement((String)enm.nextElement());
//	    }	// end of for loop
//
//		if(vect_randall.size()!=0)
//			vect_randall.removeAllElements();		// removing random nos from vector
//		for(int j=0;j<6;j++)
//		{
//			vect_rand = rand.getRandNos(2,2);			// it returns vector which holds random nos
//			for(int k=0;k<vect_rand.size();k++)
//				vect_randall.addElement((String)vect_rand.elementAt(k));
//			vect_rand.removeAllElements();
//		}	// end of for loop
//		lblans_visible(true);					// setting all answer labels visible to true
//		setResetFlags(true);						// setting all reset flag values to true
//		for(int i=0;i<6;i++)
//		  pnl_qns[i].removeAll();		// setting all text panes to blank
//		ccwdsPageDisplay(ccwds_vall);              // calling ccwdsPageDisplay method 
//		wordmine.main.WordMine1.Wordmineid[8]=ccwds_ptr;
//		validate();
//		repaint();
//		} catch(Exception CCWDS8) { error(CCWDS8,"CCWDS1008"); }
//	}	// end of callEnd method
//
//	public void mouseClicked(MouseEvent me)
//	{
//	    try{
//		for(int i=0;i<6;i++)
//		{
//			if(me.getSource()==lbl_ans1[i])		// if the user clicked first choice label
//			{
//   			   bool_resetflags[i] = false;		// setting the particular reset falg value to false
//			   lbl_ans2[i].setVisible(false);	// setting second choice label visible to false
//			}
//			else if(me.getSource()==lbl_ans2[i])
//			{
//   			   bool_resetflags[i] = false;
//			   lbl_ans1[i].setVisible(false);
//			}	
//		}  // end of for loop i
//
//		int k=0;
//		for(int j=0;j<3;j++)
//		{
//			if(me.getSource()==lbl_reset[j])		// if the user clicked the reset label
//			{
//			  k=j*2;
//		      if(bool_resetflags[k]==false)			// first question manipulation
//			  {
//				 bool_resetflags[k]=true;
//				 lbl_ans1[k].setVisible(true);
//				 lbl_ans2[k].setVisible(true);
//			  }
//			  k++;
//		  	  if(bool_resetflags[k]==false)			// second question manipulation
//			  {
//				 bool_resetflags[k]=true;
//				 lbl_ans1[k].setVisible(true);
//				 lbl_ans2[k].setVisible(true);
//			  }
//			}
//		}	// end of for loop j
//	    } catch(Exception CCWDS9) { error(CCWDS9,"CCWDS1009"); }
//
//	}	// end of mouseClicked method
//
//	public void mouseEntered(MouseEvent me)
//	{
//		try{
//		for(int i=0;i<3;i++)
//		{
//		// if the user entered mouse on reset label that particular label icon is changed
//			if(me.getSource()==lbl_reset[i])
//				lbl_reset[i].setIcon(imgi_reset2);	
//		}
//	    } catch(Exception CCWDS10) { error(CCWDS10,"CCWDS1010"); }
//
//	}	// end of mouseEntered method
//
//	public void mouseExited(MouseEvent me)
//	{
//		try{
//		for(int i=0;i<3;i++)
//		{
//		// if the user exited mouse on reset label that particular label icon is changed
//			if(me.getSource()==lbl_reset[i])
//				lbl_reset[i].setIcon(imgi_reset1);	
//		}
//	    } catch(Exception CCWDS11) { error(CCWDS11,"CCWDS1011"); }
//
//	}	// end of mouseExited method
//
//	public void mousePressed(MouseEvent me){}
//	public void mouseReleased(MouseEvent me){}
//
//	public Vector ccwdsNextSet(int i)
//    {
//       /**
//	   *  This method takes record pointer value and returns the vector which
//	   *  having set of new record values.
//	   */
//
//       Vector vns = new Vector();
//       try{
//	
//       for(int x=0;x<3;x++)
//       {
//		   String str_nsdata = (String) ccwds_v1.elementAt(i-1);
//		   vns.addElement(str_nsdata);
//		   i++;						// incrementing the record pointer
//       }
//       ccwds_ptr=i;				
//	   } catch(Exception CCWDS12) { error(CCWDS12,"CCWDS1012"); }
//       return vns;
//
//    }	// end of ccwdsNextSet method
//
//    public Vector ccwdsNextRecord(Vector vr,int i)
//    {
//
//	   /**
//	   *  This method takes vector of records and takes each record and passes
//	   *  to the tokens method which returns vector of the particular record
//	   *  fields.
//	   */
//	   Vector v2 = null	;
//       try{
//			String str_recdata = (String) vr.elementAt(i);
//			v2 = disp.getVectTokens(str_recdata,"@");		// calling getVectTokens method of the display class
//	   } catch(Exception CCWDS13) { error(CCWDS13,"CCWDS1013"); }
//       return v2;
//
//    }	// end of ccwdsNextRecord method
//
//    public void ccwdsPageDisplay(Vector vd)
//    {
//
//      /**
//	  *  This method takes the values of the vector and displays respected
//	  *  components values.
//	  */
//
//	  int main_no=1;
//	  String sub_no[] = {"i","ii"};		// String array which holds the sub question nos 
//	  String st1="",st2="",qst11="",qst12="",qst13="",qst21="",qst22="",qst23="",qst14="",qst15="";
//	  
//	  try{	
//	  ccwdsStorage(vd);		// calling ccwdsStorage method
//
//	  int j=0,k=0;			// here k is the random vector pointer
//
//	  for(int i=0;i<vect_str1.size();i++)
//	  {
//
//		st1 = dec.decryptString((String) vect_str1.elementAt(i));
//		st2 = dec.decryptString((String) vect_str2.elementAt(i));
//
//		qst11 = st1.substring(0,st1.indexOf("~")).trim();
//		qst12 = st1.substring(st1.lastIndexOf("~")+1,st1.length()).trim();
//		qst13 = st1.substring(st1.indexOf("~")+1,st1.lastIndexOf("~")).trim();
//		qst14 = qst13.substring(0,qst13.indexOf("/")).trim();
//		qst15 = qst13.substring(qst13.indexOf("/")+1,qst13.length()).trim();
//
//		qst21 = st2.substring(0,st2.indexOf("~")).trim();
//		qst22 = st2.substring(st2.lastIndexOf("~")+1,st2.length()).trim();
//		qst23 = st2.substring(st2.indexOf("~")+1,st2.lastIndexOf("~")).trim();
//
//		lbl_ans1[j].setForeground(Color.red);		
//		lbl_ans2[j].setForeground(Color.blue);
//  	    lbl_ans1[j].setBackground(new Color(228,250,255));
//		lbl_ans2[j].setBackground(new Color(228,250,255));
//		lbl_ans1[j].setCursor(new Cursor(Cursor.HAND_CURSOR));
//		lbl_ans2[j].setCursor(new Cursor(Cursor.HAND_CURSOR));
//
//		if((Integer.parseInt((String)vect_randall.elementAt(k)))==0)
//			lbl_ans1[j].setText(qst14+"  ");
//		else
//			lbl_ans1[j].setText(qst15+"  ");
//		k++;
//		if((Integer.parseInt((String)vect_randall.elementAt(k)))==1)
//			lbl_ans2[j].setText(qst15+"  ");
//		else
//			lbl_ans2[j].setText(qst14+"  ");
//		k++;
//		lbl_st1 = new JLabel();
//		lbl_st1.setText(main_no+")  "+sub_no[0]+".  ");
//		pnl_qns[j].add(lbl_st1);
//
//		StringTokenizer stz1 = new StringTokenizer(qst11);
//		int count1 = stz1.countTokens();
//		lbl_words1 = new JLabel[count1];
//		int a=0;
//		while(stz1.hasMoreElements())
//		{
//		  lbl_words1[a] = new JLabel();
//		  lbl_words1[a].setText(stz1.nextToken()+"  ");
//		  pnl_qns[j].add(lbl_words1[a]);
//		  a++;
//		}	// end of while loop
//		pnl_qns[j].add(lbl_ans1[j]);
//		pnl_qns[j].add(lbl_ans2[j]);
//
//		StringTokenizer stz2 = new StringTokenizer(qst12);
//		int count2 = stz2.countTokens();
//		lbl_words2 = new JLabel[count2];
//		int b=0;
//		while(stz2.hasMoreElements())
//		{
//		  lbl_words2[b] = new JLabel();
//		  lbl_words2[b].setText(stz2.nextToken()+"  ");
//		  pnl_qns[j].add(lbl_words2[b]);
//		  b++;
//		}	// end of while loop
//
//		j++;
//
//		lbl_ans1[j].setForeground(Color.red);
//		lbl_ans2[j].setForeground(Color.blue);
//  	    lbl_ans1[j].setBackground(new Color(228,250,255));
//		lbl_ans2[j].setBackground(new Color(228,250,255));
//		lbl_ans1[j].setCursor(new Cursor(Cursor.HAND_CURSOR));
//		lbl_ans2[j].setCursor(new Cursor(Cursor.HAND_CURSOR));
//
//		if((Integer.parseInt((String)vect_randall.elementAt(k)))==0)
//		// if the random no is zero then setting qst14 text to label otherwise qst15 text to label
//			lbl_ans1[j].setText(qst14+"  ");
//		else
//			lbl_ans1[j].setText(qst15+"  ");
//		k++;
//		if((Integer.parseInt((String)vect_randall.elementAt(k)))==1)
//			lbl_ans2[j].setText(qst15+"  ");
//		else
//			lbl_ans2[j].setText(qst14+"  ");
//		k++;
//
//		int totlen2=0;
//		lbl_st2 = new JLabel();
//		lbl_st2.setText(sub_no[1]+".  ");
//		pnl_qns[j].add(lbl_st2);
//
//		StringTokenizer stz3 = new StringTokenizer(qst21);
//		int count3 = stz3.countTokens();
//		lbl_words3 = new JLabel[count3];
//		int c=0;
//		while(stz3.hasMoreElements())
//		{
//		  lbl_words3[c] = new JLabel();
//		  lbl_words3[c].setText(stz3.nextToken()+"  ");
//		  pnl_qns[j].add(lbl_words3[c]);
//		  c++;
//		}	// end of while loop
//        pnl_qns[j].add(lbl_ans1[j]);
//        pnl_qns[j].add(lbl_ans2[j]);
//
//		StringTokenizer stz4 = new StringTokenizer(qst22);
//		int count4 = stz4.countTokens();
//		lbl_words4 = new JLabel[count4];
//		int d=0;
//		while(stz4.hasMoreElements())
//		{
//		  lbl_words4[d] = new JLabel();
//		  lbl_words4[d].setText(stz4.nextToken()+"  ");
//		  pnl_qns[j].add(lbl_words4[d]);
//		  d++;
//		}	// end of while loop
//		main_no++; j++;
//
//	  }	 // end of for loop
//	  } catch(Exception CCWDS14) { error(CCWDS14,"CCWDS1014"); }
//
//    }	// end of ccwdsPageDisplay method
//
//	public void ccwdsStorage(Vector svd)
//    {
//      /**
//	  * This method takes the vector and stores each element into different
//	  * vectors.
//	  */
//	  try{
//	  if(vect_str1.size()!=0)
//	      vect_str1.removeAllElements();
//	  if(vect_str2.size()!=0)
//	      vect_str2.removeAllElements();
//	  if(vect_str3.size()!=0)
//	      vect_str3.removeAllElements();
//	  if(vect_str4.size()!=0)
//	      vect_str4.removeAllElements();
//
//      for(int i=0;i<svd.size();)
//      {
//	    i++;
//	    vect_str1.addElement((String) svd.elementAt(i++));	// adding first question
//		vect_str2.addElement((String) svd.elementAt(i++));	// adding second question
//		vect_str3.addElement((String) svd.elementAt(i++));	// adding first question answer
//		vect_str4.addElement((String) svd.elementAt(i));	// adding second question answer
//		i += 3;
//	  }	// end of for loop
//	  } catch(Exception CCWDS15) { error(CCWDS15,"CCWDS1015"); }
//
//    }	// end of ccwdsStorage method
//
//	public void setResetFlags(boolean flag)
//    {
//   	  /**
//	  * This method sets the boolean reset flags values to respected flag values.
//	  */
//	    try{
//		for(int i=0;i<6;i++)
//		   bool_resetflags[i]= flag;		// setting the all reset flags to respected flag values
//	    } catch(Exception CCWDS16) { error(CCWDS16,"CCWDS1016"); }
//
//    }	// end of setResetFlags method
//
//	public void callEnd1()
//	{
//		try{
//		callEnd();
//		CCWordsCldemo.cl_cards.show(getParent(),"CCWordsMain");
//	    } catch(Exception CCWDS17) { error(CCWDS17,"CCWDS1017"); }
//	}	// end of callEnd1 method
//
//	public void ansSymDisplay(Vector vanssym)
//	{
//
//		/**
//	    * This method takes the vector and displays answer symbols based on vector
//		* values.
//	    */
//
//	    try{
//        imgi_yes = new ImageIcon(mainpage.MainPage.workpath+workpath+"bu1_yes.gif");		// creating the objs of the image icons
//        imgi_no = new ImageIcon(mainpage.MainPage.workpath+workpath+"bu1_no.gif");
//		for(int i=0;i<ccwds_vsymb.size();i++)
//		{
//			if(ccwds_vsymb.elementAt(i).equals("r"))	
//			{
//			 // if the selected answer is right, then setting answer symbol label visible to true and
//			 // setting the icon to yes image
//			  lbl_anssymb[i].setVisible(true);	
// 			  lbl_anssymb[i].setIcon(imgi_yes);
//			}	// end of 'r' if condition
//			else if(ccwds_vsymb.elementAt(i).equals("w"))
//			{
//			 // if the selected answer is wrong, then setting answer symbol label visible to true and
//			 // setting the icon to no image
//			  lbl_anssymb[i].setVisible(true);
// 			  lbl_anssymb[i].setIcon(imgi_no);
//			}	// end of 'w' if condition
//        }	// end of for loop
//	    } catch(Exception CCWDS18) { error(CCWDS18,"CCWDS1018"); }
//
//    }	// end of ansSymDisplay method
//
//	public void lblans_visible(boolean flag)
//    {
//   	  /**
//	  * This method sets the answers labels visible to respected flag values.
//	  */
//	  try{
//	  for(int i=0;i<6;i++)
//	  {
//          lbl_ans1[i].setVisible(flag);
//		  lbl_ans2[i].setVisible(flag);
//	  }	 // end of for loop
//      } catch(Exception CCWDS19) { error(CCWDS19,"CCWDS1019"); }
//    }	// end of lblans_visible method
//
//    public void lblsymb_visible(boolean flag)
//    {
//   	  /**
//	  * This method sets the answer symbol label visibility to respected flag values.
//	  */
//	  try{
//	  for(int i=0;i<6;i++)
//         lbl_anssymb[i].setVisible(flag);
//      } catch(Exception CCWDS20) { error(CCWDS20,"CCWDS1020"); }
//    }	// end of lblsymb_visible method
//	private void error(Exception exec,String str)
//	{ 
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of CCWords class
package _JD_53_CHECK_GLOBARENA_WEBTECHNOLOGIES;

