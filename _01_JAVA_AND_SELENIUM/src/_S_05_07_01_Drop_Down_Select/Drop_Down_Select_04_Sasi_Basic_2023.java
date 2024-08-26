package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_04_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F_Driver = new FirefoxDriver();
F_Driver.get("https://the-internet.herokuapp.com/dropdown");

WebElement Box = F_Driver.findElement(By.id("dropdown"));
Select Select_Box = new Select(Box);
Select_Box.selectByIndex(2);
Thread.sleep(3000);

Select_Box.selectByValue("1");
Thread.sleep(3000);


Select_Box.selectByVisibleText("Option 2");

Thread.sleep(3000);



List<WebElement> List_Size =Select_Box.getOptions();
int SIZE_OF_LIST = List_Size.size();
System.out.println("SIZE_OF_LIST = "+SIZE_OF_LIST);


F_Driver.close();

	}

}
