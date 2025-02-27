package _22_J_1_For_Loop;

public class Divisible_by_3_AND_5_inbetween_1to100 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i=i+1) {

			if(i%3 ==0) {
			
				System.out.println(i+" = Divisible by 3");
			}
			else if (i%5 == 0){
				
				System.out.println(i+" = Divisible by 5");
			}}
		
	}}
