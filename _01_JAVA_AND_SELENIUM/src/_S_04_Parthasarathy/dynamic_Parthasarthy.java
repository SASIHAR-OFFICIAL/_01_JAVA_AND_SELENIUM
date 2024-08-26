package _S_04_Parthasarathy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamic_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\WebDriver\chromedriver\chromedriver.exee");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input' and @id='hp-widget__sfrom']"))).click();
		List<WebElement> myList = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item'][starts-with(@id,'ui-id-')]//span[@class='autoCompleteItem__label']")));
		for (WebElement element:myList)
		    if(element.getText().contains("Mumbai"));
		        element.click();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get("https://www.makemytrip.com/");
        //WebElement from =  wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
      WebElement from =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/label")));
        from.click();
       //from.clear();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-11\"]/div/div[1]/p[1]"))).click();
       driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-11\"]/div/div[1]/p[1]")).click();
       
     WebElement to =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")));
        to.click();
            // to.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]/div/div[1]/p[1]"))).click();
        
       
        
        
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#react-autowhatever-1-section-0-item-5 > div > div.calc60 > p.font16.appendBottom8")));
      //  wait.until(ExpectedConditions.elementToBeClickable(
      //*[@id="root"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
	}

}
