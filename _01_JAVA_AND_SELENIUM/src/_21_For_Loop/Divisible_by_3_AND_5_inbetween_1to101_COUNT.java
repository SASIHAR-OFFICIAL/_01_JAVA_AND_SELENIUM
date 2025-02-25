package _21_For_Loop;

public class Divisible_by_3_AND_5_inbetween_1to101_COUNT {

	public static void main(String[] args) {
		int if_Count=0;
		int else_count =0;
		for(int i=1;i<=100;i=i+1) {

			if(i%3 ==0) {
				if_Count=if_Count+1;
				System.out.println(i+" = Divisible by 3");
			}
			else if (i%5 == 0){
				else_count =else_count+1;
				System.out.println(i+" = Divisible by 5");
			}}
		System.out.println("----------------------------------");
		System.out.println("if_Count = "+if_Count);
		System.out.println("else_count = "+else_count);
	}}
