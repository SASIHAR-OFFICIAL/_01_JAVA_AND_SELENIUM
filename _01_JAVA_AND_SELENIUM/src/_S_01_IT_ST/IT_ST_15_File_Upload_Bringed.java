package _S_01_IT_ST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_15_File_Upload_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*String baseUrl = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", "C:\WebDriver\chromedriver\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\JSP SARATHI\\Desktop\\zymr_robot_framework_7.png");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();*/
       
		
		// Horizontal Scroll
		/*System.setProperty("webdriver.chrome.driver", "C:\WebDriver\chromedriver\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
        Thread.sleep(3000);

        WebElement Element = driver.findElement(By.linkText("VBScript"));

        //This will scroll the page Horizontally till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Thread.sleep(3000);*/
		
		System.setProperty("webdriver.chrome.driver", "CC:\\WebDriver\\chromedriver\\chromedriver.exee");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/railways/");
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Kolkata']")).click();
        Thread.sleep(1000);
        /*driver.findElement(By.xpath("//input[@id='toCity']")).click();
        Thread.sleep(1000);*/
        driver.findElement(By.xpath("//span[text()='Chennai']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("travelDate")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Thu Jun 20 2019']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Class']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Sleeper Class']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        

	}

}
