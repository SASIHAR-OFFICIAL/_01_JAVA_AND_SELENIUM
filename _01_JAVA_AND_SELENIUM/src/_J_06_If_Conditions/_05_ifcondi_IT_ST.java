package _J_06_If_Conditions;

public class _05_ifcondi_IT_ST {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=70;
		if(m>=50)
		{
			System.out.println("Pass Mark");
		}
		else
		{
			System.out.println("Fail Mark");
		}
	int mark=70;
			
		if(mark>=90)
		{
			System.out.println("outstanding mark");
		}
		
		else if(mark>=80)
		{
			System.out.println("distinction mark");
			}
		else if(mark>=60)
		{
			System.out.println("fistclass mark");
			}
		else
		{
			System.out.println("not elegible to join ");
			}
	
		int days = 9;
		switch (days) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		   break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		   break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    default:
		    	 System.out.println("Enter the value between 1 to 7");
				    break;
		    	
		}
		
		}

}
