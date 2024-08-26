package _J_32_Expectation_Handling_Throw;
	import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	public class count{
		public static void main(String[] args)throws IOException,FileNotFoundException{
			Scanner input=new Scanner(System.in);
			 System.out.println("Enter the filename");
			String fileName=input.next();
			 FileReader f=new FileReader(fileName);
			  int count=0;
			  int ch=0;
			  System.out.println("Enter the character to be  counted");
			  char c=input.next().charAt(0);
			  while((ch=f.read())!=-1)
			  {
				  if((ch==c)||(ch==c+32)||(ch==c-32))
					  count++;
			  }
			  System.out.println(count);
		}
	}

