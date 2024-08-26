package _J_09_Nested_If;
public class _07_Nested_If_Payilagam {
	public static void main(String[] args) {
	int a=1, b=1, c=100;
		if(a>b){
			if(a>c){
			System.out.println("A IS LARGEST");
			}
			else if(c>a){
			System.out.println("C IS LARGEST");
			}
			else{
			System.out.println("A & C IS EQUAL");
			}
			}
		else if(b>a)
			{
			if(b>c)
			{
			System.out.println("B IS LARGEST");
			}
			else if(c>b){
			System.out.println("C IS LARGEST");
			}
			else{
			System.out.println("B & C are EQUAL");
			}
			}
		else if (a==b){
			System.out.println("A & B are EQUAL");
			}
			else if(a==b){
			System.out.println("C IS LARGEST");
			}
		else{
			System.out.println("A, B & C are EQUAL");
			}

	}

}
