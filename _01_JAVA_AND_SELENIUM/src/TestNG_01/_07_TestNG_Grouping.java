package TestNG_01;

import org.testng.annotations.Test;

public class _07_TestNG_Grouping {
@Test(groups = {"Apple"})
	void apple1(){
		System.out.println("Apple");
	}
@Test(groups = {"Apple"})
	void apple2(){
		System.out.println("Apple2");
	}
@Test(groups = {"vivo"})
	void Vivo1(){
		System.out.println("Vivo1");
	}
@Test(groups = {"vivo"})
	void Vivo2(){
		System.out.println("Vivo2");
	}
@Test(groups = {"Redmi"})
	void Redmi_1(){
		System.out.println("Redmi1");
	}
@Test(groups = {"Redmi"})
	void Redmi2(){
		System.out.println("Redmi2");
	}
@Test(groups = {"itel"})
	void itel1(){
		System.out.println("itel1");
	}
@Test(groups = {"itel"})
	void itel2(){
		System.out.println("itel2");
	}
}


