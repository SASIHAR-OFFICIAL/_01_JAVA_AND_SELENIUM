package _JC_42_Array_List;
   
import java.util.ArrayList;

import java.util.Iterator;  
    class TestJavaCollection{  
    public static void main(String args[]){  
    	
    ArrayList list=new ArrayList();//Creating arraylist  
    list.add("Ravi");//Adding object in arraylist  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay");  
    
    System.out.println(list);
   // Traversing list through Iterator  
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  }
    