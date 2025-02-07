package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Raido_Button_06_Sasi_27_Dec_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();

		d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Radio_1 = d.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input"));
		
		
		//-----------------------------------
		boolean enabled = Radio_1.isEnabled();
		
		if (enabled = true) {
		System.out.println("Radio 1 is Enabled");
	}
	else {
		System.out.println("Radio 1 is Disabled");
	}
	
		//---------------------------------------
		Thread.sleep(3000);
		WebElement Radio_2 = d.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input"));
		boolean selected = Radio_2.isSelected();
		if (selected = false) {
			System.out.println( "Radio 1 not Selected" );
		}
		
		Thread.sleep(3000);
		Radio_1.click();
				boolean selected_After_3_Second = Radio_1.isSelected();
				if (selected_After_3_Second = true) {
					System.out.println( "Radio 1 is Selected After 3 Seconds" );
				}
	}

}
