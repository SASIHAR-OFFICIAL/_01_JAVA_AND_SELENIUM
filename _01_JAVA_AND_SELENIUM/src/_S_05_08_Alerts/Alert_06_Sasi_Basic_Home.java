package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_06_Sasi_Basic_Home {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.leafground.com/alert.xhtml");
		
		
		F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]")).click();
		Alert Alert_Box = F.switchTo().alert();
		String Alert_Box_Text = Alert_Box.getText();
		System.out.println("Alert_Box_Text = "+Alert_Box_Text);
		//Alert_Box.dismiss();
		//F.close();
	}

}
