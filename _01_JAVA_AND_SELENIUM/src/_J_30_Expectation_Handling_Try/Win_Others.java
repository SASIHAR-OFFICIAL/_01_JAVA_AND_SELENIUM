package _J_30_Expectation_Handling_Try;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Win extends Dialog implements ActionListener,Runnable
{

    String name="Congratulations";
    char nam[];
    Thread dt;
    int nlen;
    boolean dflag=true;

    Button Bok;

     Win(Frame lls)
     {
		//try{
          super(lls,"Congratulations",true);
          try{          
          setLayout(null);

          Bok=new Button("Ok");
          Bok.setBounds(180,110,60,30);
          Bok.setFont(new Font("TimesRoman", Font.BOLD, 20));
          Bok.setBackground(Color.black);
          Bok.setForeground(Color.green);
          add(Bok);
                           
          
     nlen=name.length();
     nam = new char[nlen];
     name.getChars(0,name.length(),nam,0);

     setFont(new Font("TimesRoman", Font.BOLD, 40));
     setBounds(170,170,450,150);
     setForeground(Color.green);
     setBackground(Color.black);
     setResizable(false);
     Bok.addActionListener(this); 

     this.requestFocus();

     dflag=true;
     dt=new Thread(this);
     dt.start();
	 } catch(Exception WIN1) { error(WIN1,"WIN1001"); }

    }	// end of Win constructor

      public void run()
      {

        try
        {
          while(dflag)
          { 

           dt.sleep(100);
           repaint();
          }

		} catch(Exception WIN2) { error(WIN2,"WIN1002"); }

      }	 // end of run method

      public void paint(Graphics g)
      {
		try{
        for(int i=0, length = name.length(); i<length; i++)
        {

         int x = (int) (10*Math.random() + 30*i);
         int y = (int) (10*Math.random() + 60);
         g.drawChars(nam, i, 1, x, y);

        }	// end of for loop
	    } catch(Exception WIN3) { error(WIN3,"WIN1003"); }

      }	 // end of paint method
            
      public void actionPerformed(ActionEvent ae)
      {  
		 try{
         dflag=false;
         dispose();
		 } catch(Exception WIN4) { error(WIN4,"WIN1004"); }
      }	 // end of actionPerformed method

	private void error(Exception exec,String str)
	{ 
		try
		{
			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
			exec.printStackTrace(ps);
		}catch(Exception ep){}
	}
} // end of win class