package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _10_Position_Size_Sasi_24_JUNE_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://letcode.in/buttons");

		WebElement Goto_Home = d.findElement(By.id("home"));
		Goto_Home.click();
		//Thread.sleep(1000);
		d.navigate().back();

		WebElement XY_coordinates = d.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[2]/div"));
		Point location = XY_coordinates.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X_coordinates = "+x);
		System.out.println("X_coordinates = "+y);

		WebElement Button = d.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[3]/div"));
		String Button_cssValue = Button.getCssValue("background-color");
		System.out.println("Button_cssValue = "+Button_cssValue);
		
		WebElement height_width = d.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[4]/div"));
		Dimension height_width_size = height_width.getSize();
		int height = height_width_size.height;
		int width = height_width_size.width;
		System.out.println("height__size = "+height);
		System.out.println("width__size = "+width);
		
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,3250)", "");
		
		WebElement is_Disabled = d.findElement(By.id("isDisabled"));
		boolean Enabled_r_Disabled = is_Disabled.isEnabled();
		System.out.println("Enabled_r_Disabled = "+Enabled_r_Disabled);
		if (Enabled_r_Disabled=true) {
			System.out.println("Confirm button is Disabled");
		} 
		else {
			System.out.println("Confirm button is Enabled");
		}
		Thread.sleep(1000);
		
		WebElement long_pressed = d.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
		Actions mouse_Actions = new Actions(d);
		mouse_Actions.moveToElement(long_pressed).clickAndHold(long_pressed).build().perform();
		Thread.sleep(1000);
		d.close();
			}}

