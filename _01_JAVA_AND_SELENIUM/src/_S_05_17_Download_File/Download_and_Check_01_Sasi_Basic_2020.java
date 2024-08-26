package _S_05_17_Download_File;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_and_Check_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/download.html");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/download.html");
		
		
		WebElement linkText =d.findElement(By.linkText("Download Excel"));
		linkText.click();
		Thread.sleep(3000);
		
		File fileLocation =new File("E:\\DOWNLOADS");
		File[] listOfFiles = fileLocation.listFiles();
		for (File file : listOfFiles) {
			if(file.getName().equals("testleaf.xls")) {
				System.out.println("File is Downloaded");
				break;
				
			}
		}
		
	}

}
