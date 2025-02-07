package _00_Java_IT_ST_Bringed_Association;

//                             CHECK PROGRAM RUNS

public class CarClass {
	   String carName;
	   int carId;
	   CarClass(String name, int id)
	   {
		this.carName = name;
		this.carId = id;
	   }
	}
	class Driver extends CarClass{
	   String driverName;
	   Driver(String name, String cname, int cid){
		super(cname, cid);
		this.driverName=name;
	   }
	}
	class assoclass{
	   public static void main(String args[])
	   {
		Driver obj = new Driver("Andy", "Ford", 9988);
		System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
	   }
	

}

