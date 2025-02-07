package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_03_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.globalsqa.com/demo-site/auto-complete/#Categories");
		WebElement Frame_X_Path = F.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));
		F.switchTo().frame(Frame_X_Path);
		//WebElement Frame_X_Path_1 = F.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/div[1]/p/iframe"));
		//F.switchTo().frame(5);		
		Thread.sleep(3000);
	WebElement Box = F.findElement(By.xpath("//*[@id=\"search\"]"));
	Box.sendKeys("a");

List<WebElement> Search_Box = F.findElements(By.xpath("//*[@id=\"search\"]/li"));
											
int Search_Box_size = Search_Box.size();
System.out.println("Search_Box_size = "+Search_Box_size);


	}
}
