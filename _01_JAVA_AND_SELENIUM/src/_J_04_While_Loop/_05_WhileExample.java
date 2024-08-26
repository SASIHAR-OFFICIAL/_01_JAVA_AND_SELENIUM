package _J_04_While_Loop;

public class _05_WhileExample {


 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=720;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    

	}

}
