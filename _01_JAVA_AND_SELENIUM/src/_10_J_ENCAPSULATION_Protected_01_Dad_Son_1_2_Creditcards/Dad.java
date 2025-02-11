package _10_J_ENCAPSULATION_Protected_01_Dad_Son_1_2_Creditcards;

public class Dad {

	// For son
	protected void Credit_Card() {
		System.out.println("Credit_Card used by dad and his son");
	}
	
	// For son 2
	protected void Credit_Card_for_Son2() {
		System.out.println("Credit_Card cannot used by son 2, Directly ");
		System.out.println("but it can be used by his dad with him");
		System.out.println("because, son 2 not extends his dad");
		System.out.println("---------------------------------------------------------");
		System.out.println("It can be achieved by creating dad object in son 2"); 
		System.out.println("Beacause Credit_Card_for_Son2 is Protected");
	}
	// For son 3
	protected void Credit_Card_for_Son3() {
		System.out.println("Credit_Card cannot used by son 3, Directly ");
		System.out.println("but it can be used by his dad with him");
		System.out.println("because, son 3 was in OTHER PACKAGE so it was to extends his dad " );
		System.out.println("---------------------------------------------------------");
		System.out.println("It can be achieved by creating Son 3 EXTENDS dad and creating OBJECT for son 3"); 
		System.out.println("Beacause Credit_Card_for_Son3 is Protected");
}}
