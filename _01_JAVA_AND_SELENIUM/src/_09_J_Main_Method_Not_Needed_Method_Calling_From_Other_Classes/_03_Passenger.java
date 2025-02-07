package _09_J_Main_Method_Not_Needed_Method_Calling_From_Other_Classes;
public class _03_Passenger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_03_Cab_booking Passenger1 = new _03_Cab_booking();
		Passenger1.bus();
		Passenger1.CarBooking();
		Passenger1.Wating();
		System.out.println("Booking charges = " +Passenger1.Booking_Charge );
	}

}
