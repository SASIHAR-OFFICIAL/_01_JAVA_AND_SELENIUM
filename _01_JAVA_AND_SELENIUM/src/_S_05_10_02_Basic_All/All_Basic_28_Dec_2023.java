package _S_05_10_02_Basic_All;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Basic_28_Dec_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
//		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
//		WebDriver d = new ChromeDriver();
		d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//Color 1-------------------------------------
		WebElement Home_Box = d.findElement(By.xpath("/html/body/header/div/a/button"));
		String Home_Box_Color = Home_Box.getCssValue("background-color");
		System.out.println("Home_Box = "+Home_Box_Color);
		
		//Radio Button------------------------------------------------------------------
		WebElement Radi_Button_1 = d.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input"));
		Radi_Button_1.click();
		Thread.sleep(1000);
		WebElement Radi_Button_2 = d.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[2]/input"));
		Radi_Button_2.click();
		Thread.sleep(1000);;
		WebElement Radi_Button_3 = d.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[3]/input"));
		Radi_Button_3.click();
		Thread.sleep(1000);
		
		//Drop Down------------------------------------------------------------------
				WebElement DropDown = d.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
				Select DropDown_select = new Select(DropDown);
				Thread.sleep(1000);
				DropDown_select.selectByIndex(0);
				Thread.sleep(1000);
				DropDown_select.selectByValue("option2");
				Thread.sleep(1000);
				DropDown_select.selectByVisibleText("Option3");
				Thread.sleep(1000);
				
		//Alert--------------------------------------------------------------------------
		WebElement Alert_1_Button = d.findElement(By.xpath("//*[@id=\"alertbtn\"]"));
		Alert_1_Button.click();
		Alert Alert_1_window = d.switchTo().alert();
		Thread.sleep(1000);
		String Alert_1_Text = Alert_1_window.getText();
		System.out.println("Alert_1_Text = "+Alert_1_Text);
		Thread.sleep(1000);
		Alert_1_window.accept();
		Thread.sleep(1000);
		
		WebElement Alert_Fill = d.findElement(By.xpath("//*[@id=\"name\"]"));
		Alert_Fill.sendKeys("Testing");
		Thread.sleep(1000);
		WebElement Confirm_button = d.findElement(By.xpath("//*[@id=\"confirmbtn\"]"));
		Confirm_button.click();
		Alert Alert_2_Window = d.switchTo().alert();
		String Alert_2_Window_Text = Alert_2_Window.getText();
		Alert_2_Window.accept();
		System.out.println("Alert_2_Window_Text = "+Alert_2_Window_Text);
		Thread.sleep(1000);
		
		//Color 2-------------------------------------
		WebElement Open_Window_Box = d.findElement(By.xpath("//*[@id=\"openwindow\"]"));
		String Open_Window_Box_Color = Open_Window_Box.getCssValue("background-color");
		System.out.println("Open_Window_Box = "+Open_Window_Box_Color);
		
		//size--------------------------------------------
		
		d.close();
		
	}

}
