///************************************************************************************************
//* Copyright (c) 2001 GLOBARENA WEBTECHNOLOGIES PVT Ltd . All rights reserved.                   *
//* Copying or reproduction without prior written approval is prohibited                          *
//************************************************************************************************/
//
///*..............................................................................................
//. This class having getJumbleWords method which takes words as input and returns jumbled words .
//. vector as output.																			   .
//. @author  SATISH REDDY                                                                        .
//. @Date    8.11.2001										 						           .
//. @Version  1.0 						                                                       .
//..............................................................................................*/
//
//package _J_30_Expectation_Handling_Try;
//
//import java.util.*;
//import rijndael.*;
//import wordmine.learn.*;
//
//public class JumbledWord
//{
//	private Rand rand;
//	private EncryptString dec;
//
//	public JumbledWord()
//	{
//	    try{
//		dec = new EncryptString();
//		rand = new Rand();		// creating obj of Rand class
//	    } catch(Exception JUMBWD1) { error(JUMBWD1,"JUMBWD1001"); }
//
//	}	// end of JumbledWord Constructor
//
//	public Vector getJumbleWords(Vector vjin)
//	{
//
//		/**********************************************************************************
//		* getJumbleWords method will take the jumbled answers as input and shuffles the   *
//		* each word positions by using random class and stored it into vector. Finally it *
//		* returns jumbled words vector.													  *
//		**********************************************************************************/
//		Vector vjout = new Vector();
//		try{
//				int j;
//				for(int i=0;i<vjin.size();i++)
//				{
//					String st = dec.decryptString((String)vjin.elementAt(i));	// setting each element value to string variable
//					int len = st.length();
//					boolean[] cb = new boolean[len];
//					char[] c = st.toCharArray();			// converting string into char array
//					for(j=0;j<len;j++)
//					  cb[j] = false;						// default setting all char array positions to false
//					Vector vr = rand.getRandNos(len,len);	// storing non repeated random nos in vector by using getRandNos method
//					for(int k=0;k<vr.size();k++)
//					{
//					   int rind = Integer.parseInt((String)vr.elementAt(k));
//					   if(cb[k] == false)
//					   {
//						 c[k] = st.charAt(rind);
//						 cb[k] = true;
//				       }
//					}
//					vjout.addElement(new String(c));	
//				}
//	    } catch(Exception JUMBWD2) { error(JUMBWD2,"JUMBWD1002"); }//JUMBWD2.printStackTrace(); }
//
//		return vjout;		// returns jumbled words vector
//
//	}	// end of getJumbleWords method
//
//	private void error(Exception exec,String str)
//	{ 
//		try
//		{
//			java.io.PrintStream ps=new java.io.PrintStream(new java.io.FileOutputStream("c:\\wmerr.tmp",true));
//			exec.printStackTrace(ps);
//		}catch(Exception ep){}
//	}
//}	// end of JumbledWord class
package _JD_53_CHECK_GLOBARENA_WEBTECHNOLOGIES;


