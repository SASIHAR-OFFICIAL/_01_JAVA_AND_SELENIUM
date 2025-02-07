package _J_14_01_Array_List_IT_ST;
import java.util.ArrayList;
import java.util.Iterator;
public class ABC2_IT_ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Ravi");//Adding object in arraylist  
			list.add("Vijay");  
			list.add("Ravi");  
			list.add("Ajay");  
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			}

	void disp() {
		// TODO Auto-generated method stub
		
	}

	void disp1() {
		// TODO Auto-generated method stub
		
	}  
			}  