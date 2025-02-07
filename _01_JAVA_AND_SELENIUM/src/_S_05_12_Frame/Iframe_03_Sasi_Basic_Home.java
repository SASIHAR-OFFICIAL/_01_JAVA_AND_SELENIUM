package _S_05_12_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_03_Sasi_Basic_Home {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://testpages.eviltester.com/styled/iframes-test.html");
		
		F.switchTo().frame(0);
		WebElement Frame_0_Text = F.findElement(By.xpath("/html"));
		String Frame_Text = Frame_0_Text.getText();
		System.out.println("Frame_Text = "+Frame_Text);
		
		F.switchTo().defaultContent();
		F.switchTo().frame(1);
		WebElement Frame_2_Text = F.findElement(By.xpath("/html/body/div/h1"));
		String Frame2_Text =Frame_2_Text.getText();
		System.out.println("-------------------------------");
		System.out.println("Frame2_Text = "+Frame2_Text);
	}

}
