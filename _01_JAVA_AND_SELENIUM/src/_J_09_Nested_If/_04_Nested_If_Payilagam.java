package _J_09_Nested_If;
public class _04_Nested_If_Payilagam {
	public static void main(String[] args) {
		int n1 = 150, n2 = 180, n3 = 200;
		 
        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println("Student with height: 1 " + n1 + " is the tallest.");
            else
                System.out.println("Student with height: 2 " + n3 + " is the tallest.");
        } 
        //
        else {
            if (n2 >= n3)
                System.out.println("Student with height:  3 " + n2 + " is the tallest.");
            else
                System.out.println("Student with height:  4 " + n3 + " is the tallest.");
        }
        System.out.println("\n");
    }
}