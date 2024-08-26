//package _J_30_Expectation_Handling_Try;
//
//import javax.swing.JEditorPane;
//import javax.swing.*;
//import java.awt.*;
//
//public class CWHelp extends JDialog
//{
//   private JEditorPane jep_editor;                            
//   private String str_readfile;
//   private JScrollPane scr_scroll;       
//
//String str="<html><body><p align=\"center\"><font face=\"Times New Roman\" color=\"#0000ff\" size=\"6\"><u><b>Welcome To CrossWord</b></u></font></p>"+
//"<p align=\"left\">&nbsp;</p><p style=\"TEXT-INDENT: 0px\" align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">"+
//"Whenever the User loads the CrossWord by default the first cell will be highlighted and Answers which entered by the User&nbsp; moves Across."+
//"Simultaneously whenever he wants to answer the desired position he has to highlight the Clues ie Across or Down .&nbsp;Whenever User starts the CrossWord "+
//"by default time will get Start . </font></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">The&nbsp; User will have so many options while playing this CrossWord .</font></p>"+
//"<p align=\"left\"><u><b><i><font face=\"Times New Roman\" color=\"#000000\" size=\"5\">Keyboard Options :</font></i></b></u></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">1. "+
//"Whenever he types any wrong Character he can erase those Characters by using Backspace Key.</font></p><p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">2 . The User can move around the Cells&nbsp; in all the directions by using Up, Down, "+
//"Left and Right Arrow Keys.</font></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">3 . The User can delete the desired Character in a particular Cell by using Delete Key.</font></p>"+
//"<p align=\"left\"><u><b><i><font face=\"Times New Roman\" color=\"#000000\" size=\"5\">Mouse Options :</font></i></b></u></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">1 . A Check Button will be displayed by the side of timer , whenever the user clicks"+
//"this Radio Button&nbsp;with Mouse the Timer will automatically get Paused (vice versa) .</font></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">2 . When ever user wants to enter&nbsp; into the particular Cell (randomly), he can highlight that Cell"+
//"by&nbsp;clicking the mouse at that particular cell .&nbsp;&nbsp;&nbsp;</font></p><p align=\"left\"><u><b><i><font face=\"Times New Roman\" color=\"#000000\" size=\"5\">Options :</font></i></b></u><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
//"</font></p><p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">Whenever the User clicks New Crossword Button a list of different CrossWords will be displayed . From&nbsp;that list he can choose the desired Crossword&nbsp; as he likes .&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
//"</p><p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">With the Save CrossWord Button user can save the current CrossWord in any location, later he can load the crossword with New CrossWord Button.</font></p> <p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">"+
//"With the Verify Answers Button user can verify the entire cells of the CrossWord.</font></p><p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">&nbsp;With the Show Answers Button entire cells will be displayed with correct answers .</font></p><p align=\"left\"><font face=\"Times New Roman\" color=\"#000000\" size=\"4\">&nbsp;&nbsp;"+
//"</font></p></body></html>";
//
//   public  CWHelp(JFrame frame,String title)
//   {
////	 try{//mainpage.MainPage.frm_atsgre
//	 super(mainpage.MainPage.frm_atsgre,title);
//	 try{
//	 jep_editor=new JEditorPane();
//         getContentPane().setLayout(new BorderLayout());
//         getContentPane().add("Center",jep_editor);       
//	 jep_editor.setContentType("text/html");
//         jep_editor.setBackground(new Color(222,247,253));
//         scr_scroll=new JScrollPane(jep_editor);
//	 getContentPane().add(scr_scroll);
//
//     SetSize(600,400);
//
//	 jep_editor.setText(str);
//     jep_editor.setEditable(false);
//     jep_editor.setCaretPosition(0);
//
//	 setVisible(true);
//	 } catch(Exception CROSSWORD22) { error(CROSSWORD22,"CROSSWORD1022"); }
//    }	// end of CWHelp constructor
//
//  public void SetSize(int w , int h)
//  {
//      try{
//	  setSize(w,h);
//      Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//      int i = (d.width-w)/2;
//      int j = (d.height-h)/2;
//      setLocation(i,j);
// 	  } catch(Exception CROSSWORD23) { error(CROSSWORD23,"CROSSWORD1023"); }
//  }	// end of SetSize method
//
//  private void error(Exception exec,String str)
//  {
//  		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//  }
//}	// end of CWHelp class