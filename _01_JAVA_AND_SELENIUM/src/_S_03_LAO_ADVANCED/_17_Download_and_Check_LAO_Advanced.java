package _S_03_LAO_ADVANCED;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _17_Download_and_Check_LAO_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/file.xhtml");

		WebElement Download_button = driver.findElement(By.id("j_idt93:j_idt95"));
		Download_button.click();

		File File_Location = new File("C:\\Users\\ADMIN\\Downloads");

		File[] list_of_Files = File_Location.listFiles();	
		
		for (File All_File_Check_object : list_of_Files) {
			if (All_File_Check_object.getName().equals("TestLeaf Logo.png")) {
				System.out.println("The File is Downloaded");
			}
		}
	}
}
