package _S_05_10_01_Check_Boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box_01_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.leafground.com/pages/checkbox.html");
		
		//Select the Language
		WebElement jAVA = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		jAVA.click();
		
		WebElement sQL = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[3]/input"));
		sQL.click();
		
		WebElement cPlus = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[5]/input"));
		cPlus.click();
		
		//Confirm Select yes or No
		
		WebElement confirmSelect = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean status = confirmSelect.isEnabled();
		System.out.println(status+" Selenium is checked");
		
		//Deselect
		
		WebElement box1 = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		if (box1.isSelected()) {
			box1.click();
					
		}
		
		WebElement box2 = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		if (box2.isSelected()) {
			box2.click();
		}
				
	}

}
