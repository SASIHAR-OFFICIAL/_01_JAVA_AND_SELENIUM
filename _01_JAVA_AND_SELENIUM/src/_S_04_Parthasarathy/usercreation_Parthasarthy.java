package _S_04_Parthasarathy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usercreation_Parthasarthy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exee");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/pens-stationery/office-supplies/diaries/pr?affid=dealsbigd&sid=dgv,tkw,mwh&affExtParam1=email_shoot_pan_india&affExtParam2=email_database_7");
		Thread.sleep(40000);
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mi tv");
		d.findElement(By.cssSelector("#container > div > div._3ybBIU > div._1tz-RS > div._3pNZKl > div.Y5-ZPI > form > div > button")).click();
	}
	

}
