package _S_05_05_Text_Box_Edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_Text_Box_04_Sasi_11_Dec_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		//-------------------------
		WebElement First_Name = d.findElement(By.id("RESULT_TextField-1"));
		First_Name.sendKeys("Somu");
		WebElement Last_Name = d.findElement(By.id("RESULT_TextField-2"));
		Last_Name.sendKeys("Ramu");
		WebElement Phone = d.findElement(By.id("RESULT_TextField-3"));
		Phone.sendKeys("ewfsdgdfgfdhg");
		WebElement Country = d.findElement(By.id("RESULT_TextField-4"));
		Country.sendKeys("India");
		WebElement City = d.findElement(By.id("RESULT_TextField-5"));
		City.sendKeys("Erode");
		WebElement Email = d.findElement(By.id("RESULT_TextField-6"));
		Email.sendKeys("Samuerode@gmail.com");
		//-----------------------
		WebElement Gender = d.findElement(By.xpath("//*[text()='Male']"));
		Gender.click();
		//----------------
		WebElement What_days = d.findElement(By.xpath("//*[text()='Friday']"));
		What_days.click();
		//-------------------
		WebElement Time_to_Contact = d.findElement(By.id("RESULT_RadioButton-9"));
		Time_to_Contact.click();
		
		Select Timing = new Select(Time_to_Contact);
		Timing.selectByIndex(1);
		Thread.sleep(3000);
		Timing.selectByValue("Radio-1");
		Thread.sleep(3000);
		Timing.selectByVisibleText("Evening");
		
	}

}
