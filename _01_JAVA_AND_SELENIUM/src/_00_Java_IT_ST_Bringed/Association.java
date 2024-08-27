package _00_Java_IT_ST_Bringed;

//                             CHECK PROGRAM RUNS

public class Association {
	   String carName;
	   int carId;
	   Association(String name, int id)
	   {
		this.carName = name;
		this.carId = id;
	   }
	}
	class Driver extends Association{
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

