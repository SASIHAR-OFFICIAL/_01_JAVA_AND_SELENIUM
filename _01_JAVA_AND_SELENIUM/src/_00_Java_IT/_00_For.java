package _00_Java_IT;

public class _00_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int a[] = {40,50,60,88,30,40};
		char d[] = {'g','m','l'};

		String c[] = {"The","Most","Beatiful"};

		for(int i=0;i<=5;i++)
		{
			System.out.println(a[i]);
		}
		j=0;
		while (j<=5) {
			System.out.println("The value is "+j);
			j++;
		}
		int k = 6;
		do {
			System.out.println("K value is ="+k);
			k++;
		}
		while(k<=5);
	}

}
