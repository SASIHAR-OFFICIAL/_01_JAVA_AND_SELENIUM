package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button_01_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.leafground.com/pages/radio.html");
		
		WebElement yesNo =d.findElement(By.xpath("//*[@id=\"no\"]"));
		yesNo.click();
		
		WebElement unchecked =d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]"));
		WebElement checked = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement selectAge = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		selectAge.click();
	}

}
