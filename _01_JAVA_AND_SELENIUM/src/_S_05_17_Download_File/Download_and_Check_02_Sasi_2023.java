package _S_05_17_Download_File;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Download_and_Check_02_Sasi_2023 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
		Button.click();
		
		File File_Location = new File("C:\\Users\\ADMIN\\Downloads");
		File[] listFiles = File_Location.listFiles();
		for (File All_File_Check : listFiles) {
			if (All_File_Check.getName().equals("sampleFile.jpeg")) {
				System.out.println("The File SAMPLE FILE download");
			}
			
		}
	}

}
