package _S_05_10_04_Print_Stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintStream_1 {

	public static void main(String[] args) throws FileNotFoundException {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.docker.com/");

		JavascriptExecutor JSE_Obj = (JavascriptExecutor) driver;
		JSE_Obj.executeScript("window.scrollBy(0,1000)");

		WebElement Docker_Ad = driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div/div[2]/div[1]/div"));
		String Docker_Text_text = Docker_Ad.getText();
		System.out.println("Docker_Text_text = "+Docker_Text_text);

		try {
			PrintStream PS_Obj = new PrintStream("D:\\Selenium Test\\PrintStream_1.txt"); 
			System.setOut(PS_Obj);
			PS_Obj.print(Docker_Text_text);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.quit();
	}
}
