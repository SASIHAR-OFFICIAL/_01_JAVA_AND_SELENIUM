///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*...............................................................................................
//. This file displays the main(front) page of the commonly confused words screens. It displays   .
//. the images and two navigation buttons. If the user pressed the navigation control based on	.
//. user requirements it displays the further pages.												.
//. @author  SATISH REDDY                                                                         .  
//. @Date    22/10/2001																			.
//. @Verion  1.0 																	                . 
//...............................................................................................*/
//
//package _J_30_Expectation_Handling_Try;
//
//import javax.swing.*;
//import java.awt.*;
//import javax.swing.event.*;
//import java.awt.event.*;
//import wordmine.main.*;
//
//public class CCWordsMain extends JPanel implements ActionListener
//{
//
//	/**
//	*  This class is creates and displays the main screen of the commonly
//	*  confused words module.
//	*/
//
//    private ImageIcon imgi_title,imgi_tccwds,imgi_ccwds,imgi_home1,imgi_home2,imgi_enter1,imgi_enter2;
//    private JLabel lbl_title,lbl_tccwds,lbl_ccwds;
//    private JButton btn_home,btn_enter;
//    private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//
//    public CCWordsMain()
//    {
//	   /**
//	   *  This function calls the design method.
//	   */
//
//	   try{
//       design();
//	   } catch(Exception CCWDS2) { error(CCWDS2,"CCWDS1002"); }
//
//    }	// end of CCWordsMain constructor
//
//    void design()
//    {
//
//	   /**
//	   *  This function initializes and adds the necessary components like
//	   *  labels,buttons and images.
//	   */
//	   try{
//	   setLayout(null);					// setting panel layout to null
//       setBackground(Color.white);		
//       setSize(800,600);				// setting the panel size
//       setVisible(true);				// setting panel visible to true
//     
//       imgi_title = new ImageIcon(mainpage.MainPage.workpath+workpath+"title2.gif");	// creating image icon obj
//       lbl_title = new JLabel(imgi_title);					// creating label obj passing to image icon obj
//       lbl_title.setBounds(0,0,800,70);						// setting label bounds
//       add(lbl_title);										// adding label to panel
//
//       imgi_tccwds = new ImageIcon(mainpage.MainPage.workpath+workpath+"title_commonly-confused-wor.gif");
//       lbl_tccwds = new JLabel(imgi_tccwds);
//       lbl_tccwds.setBounds(0,72,800,22);
//       add(lbl_tccwds);
//
//       imgi_ccwds = new ImageIcon(mainpage.MainPage.workpath+workpath+"commconfusedwords.jpg");
//       lbl_ccwds = new JLabel(imgi_ccwds);
//       lbl_ccwds.setBounds(0,96,800,504);
//
//       imgi_home1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_home.gif");	
//       imgi_home2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_home.gif");	
//       btn_home = new JButton(imgi_home1);					  // creating button obj passing to image icon obj
//       btn_home.setBackground(Color.white);					  
//	   btn_home.setBorderPainted(false);					  // setting border paint of the button	
//       btn_home.setRolloverIcon(imgi_home2);		// setting button rollover icon
//       btn_home.setBounds(30,510,125,32);					  // setting button bounds
//       add(btn_home);										  // adding button to the panel		
//	   btn_home.setMnemonic('h');
//	   btn_home.setToolTipText("Home");		
//       btn_home.requestFocus();
//	   btn_home.setNextFocusableComponent(btn_enter);
//       btn_home.addActionListener(this);					  // adding action listener to the button
//
//       imgi_enter1 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_enter.gif");
//       imgi_enter2 = new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_enter.gif");
//       btn_enter = new JButton(imgi_enter1);
//       btn_enter.setBorderPainted(false);
//       btn_enter.setRolloverIcon(imgi_enter2);		// setting button rollover icon
//       btn_enter.setBackground(new Color(243,254,237));
//       btn_enter.setBounds(620,510,125,32);
//       add(btn_enter);
//	   btn_enter.setMnemonic('e');
//	   btn_enter.setToolTipText("Enter");		
//	   btn_enter.setNextFocusableComponent(btn_home);
//       btn_enter.addActionListener(this);
//	   add(lbl_ccwds);
//	   } catch(Exception CCWDS3) { error(CCWDS3,"CCWDS1003"); }
//
//	} // end of design method
//
//    public void actionPerformed(ActionEvent ae)
//    {
//
//      /**
//	  * This method will listens button actions and takes the corrseponding 
//	  * actions.
//	  */
//	  try{
//	  Object source=ae.getSource();
//      if(source==btn_home)
//	  {
//			wordmine.main.WordMine1.count=0;
//			
//			wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");
//			wordmine.main.WordMine1.forMain1();
//	  }	// end of btn_home if condition
//
//	  else if(source==btn_enter)
//           CCWordsCldemo.cl_cards.show(getParent(),"CCWords");	// particular card should be shown
//		   // end of btn_enter if condition
//      } catch(Exception CCWDS4) { error(CCWDS4,"CCWDS1004"); }
//     }   // end of action performed method
//
//	private void error(Exception exec,String str)
//	{ 
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of CCWordsMain class
package _JD_53_CHECK_GLOBARENA_WEBTECHNOLOGIES;


