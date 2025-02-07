package _S_01_IT_ST;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_15_File_Upload_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		String baseUrl = "http://demo.guru99.com/test/upload/";

		d.get(baseUrl);
		WebElement uploadElement = d.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("H:\\SELENIUM\\selenium 4.txt");
		Thread.sleep(2000);
		d.findElement(By.id("terms")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//*[@id=\"closeBtn\"]")).click();
		// check the "I accept the terms of service" check box
		d.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();

		// click the "UploadFile" button

	}

}
