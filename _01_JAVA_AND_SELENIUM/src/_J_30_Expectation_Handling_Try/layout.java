//package _J_30_Expectation_Handling_Try;
//
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.event.*;
//
//public class layout extends JPanel
//{
//	GridBagLayout gbl;	
//	GridBagConstraints gbc;
//	int ROWS;
//	int COLS;
//        Grid grid[];
//
//     public layout(CrossWord obj,int rows,int col)
//     {
//		try{
//		ROWS=rows;
//		COLS=col;
//        int size=rows*col;
//        grid=new Grid[size];
//
//		boolean check=true;
//		int x=0;
//
//                for(int p=0;p<size;p++)
//                 {
//                      grid[p]=new Grid();
//                      grid[p].bigSetForeground(Color.black);
//                      grid[p].bigSetBackground(Color.white);
//                      grid[p].smallSetBackground(Color.white);
//                      grid[p].smallSetForeground(Color.white);
//                      //grid[p].addMouseListener(obj);
//                      //grid[p].ls.addMouseListener(obj);
//                      //grid[p].lb.addMouseListener(obj);
//    
//                  }	 // end of for loop
//
//        gbl=new GridBagLayout();
//		gbc=new GridBagConstraints();
//		setLayout(gbl);
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
//                                
//                for (int i=0;i<rows;i++ )
//                {
//                     for (int j=0;j<col;j++ )
//                     {
//                        addToCanvas(grid[x],j);
//                        x++;
//                     }
//                     check=false;
//				}	// end of for loop
//	     } catch(Exception LAYOUT1) { error(LAYOUT1,"LAYOUT1001"); }
//        }	// end of layout constructor
//
//        public void addToCanvas(Grid grid,int check)
//        {
//		try{
//		gbc.gridheight=1;
//		gbc.insets=new Insets(1,1,1,1);
//		gbc.fill=GridBagConstraints.BOTH;
//		if(check==COLS-1)
//                {
//                        gbc.gridwidth=GridBagConstraints.REMAINDER;
//                        gbl.setConstraints(grid,gbc);
//                        add(grid);
//		}
//		else if(check==COLS-2)
//                {
//			gbc.gridwidth=GridBagConstraints.RELATIVE;
//                        gbl.setConstraints(grid,gbc);
//                        add(grid);
//		}
//		else
//                {
//			gbc.gridwidth=1;
//                        gbl.setConstraints(grid,gbc);
//                        add(grid);
//		}
//	    } catch(Exception LAYOUT2) { error(LAYOUT2,"LAYOUT1002"); }
//	}	// end of addToCanvas method
//
// public void  editdisable()
//	{
////     setEditable(false);
//     setEnabled(false);  
//	}  
//
///*    public void  smalleditdisable()
//	{
//  //     ls.setEditable(false);
//       ls.setEnabled(false);  
//	}   */
//
//
//	private void error(Exception exec,String str)
//	{
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of layout class
