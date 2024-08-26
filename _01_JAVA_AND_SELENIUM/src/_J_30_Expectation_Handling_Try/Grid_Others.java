package _J_30_Expectation_Handling_Try;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Grid extends JPanel 
{
    JLabel ls,lb;

    Grid()
    {

	  try{
	  setLayout(null);
      setSize(25,25);

      ls=new JLabel("0",JLabel.LEFT);
      ls.setOpaque(true);
      ls.setFont(new Font("Courier",Font.BOLD,9));
      lb=new JLabel("",JLabel.CENTER);//RIGHT);
      lb.setOpaque(true);
      lb.setFont(new Font("Courier",Font.BOLD,16));
     
      lb.setBounds(0,0,30,30);
      ls.setBounds(0,0,16,10);
                           
      add(ls);
      add(lb);
      setBackground(Color.white);
      setVisible(true);
      } catch(Exception GRID1) { error(GRID1,"GRID1001"); }
    }	// end of Grid constructor


    public void smallSetText(String text)
    {
      ls.setText(text);
    }	// end of smallSetText method

    public String smallGetText()
    {
      return ls.getText();
    }	// end of smallGetText method

    public void smallSetForeground(Color col)
    {
      ls.setForeground(col);
    }	// end of smallSetForeground method

    public Color smallGetForeground()
    {
      return ls.getForeground();
    }	// end of smallGetForeground method

    public void smallSetBackground(Color col)
    {
      ls.setBackground(col);
    }	// end of smallSetBackground method

    public Color smallGetBackground()
    {
      return ls.getBackground();
    }	// end of smallGetBackground method

    public void smallSetFont(Font font)
    {
      ls.setFont(font);
    }	// end of smallSetFont method

   
	public Font smallGetFont()
    {
      return ls.getFont();
    }	// end of smallGetFont method

    public void smallRequestFocus()
    {
       ls.requestFocus();
    }	// end of smallRequestFocus method

    public void smallRepaint()
    {
       ls.repaint();
    }	// end of smallRepaint method

    public void smallValidate()
    {
       ls.validate();
    }	// end of smallValidate method
                 
    public void bigSetText(String text)
    {
     lb.setText(text);
    }	// end of bigSetText method

    public String bigGetText()
    {
      return lb.getText();
    }	// end of bigGetText method

    public void bigSetForeground(Color col)
    {
      lb.setForeground(col);
    }	// end of bigSetForeground method

    public Color bigGetForeground()
    {
      return lb.getForeground();
    }	// end of bigGetForeground method

    public void bigSetBackground(Color col)
    {
      lb.setBackground(col);
    }	// end of bigSetBackground method

    public Color bigGetBackground()
    {
      return lb.getBackground();
    }	// end of  bigGetBackground method

    public void bigSetFont(Font font)
    {
      lb.setFont(font);
    }	// end of bigSetFont method

    public Font bigGetFont()
    {
      return lb.getFont();
    }	// end of bigGetFont method
    public void bigRequestFocus()
    {
       lb.requestFocus();
    }	// end of bigRequestFocus method

    public void bigRepaint()
    {
       lb.repaint();
    }	// end of bigRepaint method

    public void bigSetImage(ImageIcon ico)
    {
      lb.setIcon(ico);
    }	// end of bigSetImage method

	private void error(Exception exec,String str)
	{ 
		try
		{
			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
			exec.printStackTrace(ps);
		}catch(Exception ep){}
	}
}	// end of Grid class