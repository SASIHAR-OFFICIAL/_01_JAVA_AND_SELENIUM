package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HOME_04_Own_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.get("https://rettaikili.in/product/rettaikili-rajabogam-ponni/");
		Thread.sleep(10000);

		WebElement Select_Number1 = D.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div[2]/div[1]/div[2]/form/div/table/tbody/tr/td/ul/li[3]"));
		Select_Number1.click();
		Select_Number1.getText();
		System.out.println("Select_Number = "+Select_Number1);
		
		WebElement Select_Number2 = D.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div[2]/div[1]/div[2]/form/div/table/tbody/tr/td/ul/li[3]/div"));
		Select_Number2.click();
		Select_Number2.getText();
		System.out.println("Select_Number = "+Select_Number2);
		
		WebElement Select_Number3 = D.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div[2]/div[1]/div[2]/form/div/table/tbody/tr/td/ul/li[3]/div/span"));
		Select_Number3.click();
		Select_Number3.getText();
		System.out.println("Select_Number = "+Select_Number3);
		
	}

}
