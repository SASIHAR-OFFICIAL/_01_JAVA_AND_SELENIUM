package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Raido_Button_03_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.get("https://demoqa.com/radio-button");
		Thread.sleep(10000);

		WebElement Radio_Button1 = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
		WebElement Radio_Button2 = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		WebElement Radio_Button3 = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/label"));
		boolean B1 =Radio_Button1.isSelected();
		boolean B2 =Radio_Button2.isSelected();
		boolean B3 =Radio_Button3.isSelected();
		System.out.println("Radio_Button1 = "+B1+'\n'+"Radio_Button2 = "+B2+'\n'+"Radio_Button3 = "+B3);

		Radio_Button2.click();


	}

}
