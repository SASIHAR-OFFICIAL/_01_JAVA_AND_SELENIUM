package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_03_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://www.leafground.com/select.xhtml");
		
WebElement Box1 = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
	Select Box1select = new Select(Box1);
	Box1select.selectByIndex(1)	;
	Thread.sleep(3000);
	Box1select.selectByVisibleText("Playwright");
	Thread.sleep(3000);
	Box1.sendKeys("Cypress");
	
	List<WebElement> Total_Options = Box1select.getOptions();
	int sizeofBox = Total_Options.size();
	System.out.println("Total_Options is = "+sizeofBox);
	
	// Not Working 
	/*WebElement Box2 = F.findElement(By.xpath("/html/body/span/ul/li[7]"));
Select Box2Select = new Select(Box2);
Box2Select.selectByVisibleText("JMeter");
//Box2Select.selectByIndex(3);
//Box2Select.selectByValue("3");*/
	
	/*WebElement Box_Right_Side = F.findElement(By.id("j_idt87:auto-complete_input"));
	Select Box_Right_Side_options = new Select(Box_Right_Side);
	
	List<WebElement> Total_Options = Box_Right_Side_options.getOptions();
	int sizeofBox = Total_Options.size();
	System.out.println("Total_Options is = "+sizeofBox);*/
	
	}

}
