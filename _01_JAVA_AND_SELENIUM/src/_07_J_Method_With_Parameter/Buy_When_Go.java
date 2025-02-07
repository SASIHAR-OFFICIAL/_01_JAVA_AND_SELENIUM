package _07_J_Method_With_Parameter;

public class Buy_When_Go {

	void Sasi(String Candy,int Count)
	{
		System.out.print(Candy);
		System.out.println(" "+Count);
	}

void Dady (String oil,int liter)
{
	{
		System.out.print(oil);
		System.out.print(" "+liter+" Liters");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buy_When_Go Sasi_Buy = new Buy_When_Go();
		Sasi_Buy.Sasi("Ginger Candy", 6);
		
		Buy_When_Go Dady_Buy = new Buy_When_Go();
		Dady_Buy.Dady("Groundnut Oil", 02);

	}

}
