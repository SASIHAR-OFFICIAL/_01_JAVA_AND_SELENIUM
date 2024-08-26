//package _J_30_Expectation_Handling_Try;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import wordmine.main.*;
//import wordmine.learn.*;
//import wordmine.play.*;
//
//
//public class CWTitle extends JPanel implements ActionListener
//{
//   JButton enter,bhome;
//   JFrame frame;
//   static CardLayout card;
//   CrossWord cross;
//   private  String  workpath   =   "wordmine/play/play_imgs/";   // this variable sets the aplication path
//
//   public CWTitle(JFrame f)
//   {
//	   try{
//       frame=f;
//       setOpaque(true);
//       JPanel titlePanel = new JPanel(new BorderLayout());
//       titlePanel.setBackground(new Color(222,247,253));
//
// 	   JLabel lbanner = new JLabel(new ImageIcon(mainpage.MainPage.workpath+workpath+"title2.gif"));
//
//	   JLabel l = new JLabel(new ImageIcon(mainpage.MainPage.workpath+workpath+"Cross-words.jpg"));
//       l.setBorder(BorderFactory.createLineBorder(new Color(222,247,253)));
//       l.setBackground(new Color(222,247,253));
//       l.setOpaque(true);
//		titlePanel.add("North",lbanner);
//       titlePanel.add("Center",l);
//
//       enter = new JButton(new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_enter.gif"));
//       enter.setBorder(BorderFactory.createLineBorder(new Color(222,247,253)));
//       enter.setOpaque(true);
//       enter.addActionListener(this);
//       enter.setRolloverIcon(new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_enter.gif"));
//	   enter.setMnemonic('e');
//	   enter.setToolTipText("Enter");		
//
//       bhome = new JButton(new ImageIcon(mainpage.MainPage.workpath+workpath+"play1_home.gif"));
//       bhome.setRolloverIcon(new ImageIcon(mainpage.MainPage.workpath+workpath+"play2_home.gif"));
//       bhome.setBorder(BorderFactory.createLineBorder(new Color(222,247,253)));
//       bhome.setOpaque(true);
//       bhome.setBackground(new Color(222,247,253));
//       bhome.addActionListener(this);
//	   bhome.setMnemonic('h');
//	   bhome.setToolTipText("Home");		
//
//       JPanel p = new JPanel(new BorderLayout());
//       p.setBackground(new Color(222,247,253));
//       p.setOpaque(true);
//       p.add(bhome,BorderLayout.WEST);
//       p.add(enter,BorderLayout.EAST);
//       titlePanel.add("South",p);
//       card = new CardLayout();
//       setLayout(card);
//       add("title",titlePanel);
//       cross = new CrossWord(frame);
//       add("cw",cross);
//	   } catch(Exception CROSSWORD1) { error(CROSSWORD1,"CROSSWORD1001"); }
//   }	// end of CWTitle constructor
//
//   public void actionPerformed(ActionEvent ae)
//   {
//	   try{
//       if(ae.getSource()==enter)
//       {
//          cross.mm=0;
//          cross.sc=0;
//		  cross.restart();
//          card.show(this,"cw");
//       }	// end of enter if condition
//
//       if(ae.getSource()==bhome)
//       {
//		  wordmine.main.WordMine1.count=0;
//		  
//	      wordmine.main.WordMine1.cards.show(wordmine.main.WordMine1.panelCard1,"WordMine");
//		  wordmine.main.WordMine1.forMain1();
//       }	// end of bhome if condition
//	   } catch(Exception CROSSWORD2) { error(CROSSWORD2,"CROSSWORD1002"); }
//   }	// end of actionPerformed method
//
//   public void showCard(String str)
//   {
//		card.show(this,str);
//   }
//
//	private void error(Exception exec,String str)
//	{
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of CWTitle class
