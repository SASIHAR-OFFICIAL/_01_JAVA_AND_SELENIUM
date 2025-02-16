package _16_J_INTERFACE_Implements;

public class Employee2 extends Father1 implements OFFICE,Traffic_Rules {

	public static void main(String[] args) {
		
		Employee2 Employee1_Obj = new Employee2();
		Employee1_Obj.Do_Work();
		Employee1_Obj.Get_Bonus();
		Employee1_Obj.Get_Salary();
		Employee1_Obj.WearHelmet();
		Employee1_Obj.ControlSpeed();
		Employee1_Obj.Do_Parttime_Job();
		Employee1_Obj.Debit_Card();
	}

	private void Do_Parttime_Job() {
		System.out.println("Do_Parttime_Job");
	}

	@Override
	public void WearHelmet() {
		System.out.println("WearHelmet");
	}

	@Override
	public void ControlSpeed() {
		System.out.println("ControSpeed");
	}

	@Override
	public void Do_Work() {
		System.out.println("Do_Work");	
	}

	@Override
	public void Get_Salary() {
		System.out.println("Get_Salary");	
	}

	@Override
	public void Get_Bonus() {
		System.out.println("Get_Bonus");	
	}

}
