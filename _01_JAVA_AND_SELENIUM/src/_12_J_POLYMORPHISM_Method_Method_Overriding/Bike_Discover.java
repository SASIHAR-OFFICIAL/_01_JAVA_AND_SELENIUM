package _12_J_POLYMORPHISM_Method_Method_Overriding;

public class Bike_Discover extends Vehicle {

	public static void main(String[] args) {
		Bike_Discover Bike_Discover_obj = new Bike_Discover();
		Bike_Discover_obj.run();
	}
	void run() {
		System.out.println("Vehicle is running 80");
		super.run();
		}
	
}
