package _S_05_02_Headless_Browser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser2 {

	public static void main(String[] args) {
		
HtmlUnitDriver driver = new HtmlUnitDriver();

driver.get("http://google.co.in");
String Title = driver.getTitle();
System.out.println("Title ="+Title);

	}

}
