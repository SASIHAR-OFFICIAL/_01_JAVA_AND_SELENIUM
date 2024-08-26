package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_03_Edit_Text_Box_02_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://testleaf.herokuapp.com/pages/Edit.html");
		d.findElement(By.id("email")).sendKeys("testingfor@gmail.com");
		d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys(" typed word");
		String value= d.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);
		d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
		
			}

}
