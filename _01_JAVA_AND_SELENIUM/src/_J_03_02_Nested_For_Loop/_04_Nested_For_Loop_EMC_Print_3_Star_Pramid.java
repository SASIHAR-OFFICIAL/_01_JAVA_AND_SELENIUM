package _J_03_02_Nested_For_Loop;

public class _04_Nested_For_Loop_EMC_Print_3_Star_Pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=3; i=i+1) {

			for (int j = 1; j<=i; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 }