package _J_14_01_Array_List_IT_ST;
import java.util.ArrayList;
import java.util.Iterator;
class TestCollection1{
 public static void main(String args[]){
 
  ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
