package _14_J_01_this_KEYWORD_Varibale;

public class THIS_TEST {

	int bus = 44;
	
	
	public static void main(String[] args) {
		
		THIS_TEST THIS_TEST_Obj = new THIS_TEST();
		THIS_TEST_Obj.Bus_No(98);
		System.out.println("Bus No. "+THIS_TEST_Obj.bus);
		}


	private void Bus_No(int bus) {
		this.bus = bus;
		
	}


}
