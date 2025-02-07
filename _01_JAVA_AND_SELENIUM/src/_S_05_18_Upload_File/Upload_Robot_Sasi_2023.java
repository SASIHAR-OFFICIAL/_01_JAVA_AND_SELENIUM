package _S_05_18_Upload_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Robot_Sasi_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.get("https://testpages.eviltester.com/styled/file-upload-test.html");
		
		D.findElement(By.xpath("//*[@id=\"fileinput\"]")).sendKeys("C:\\Users\\ADMIN\\Downloads\\sampleFile.jpeg");
		
	}

}
