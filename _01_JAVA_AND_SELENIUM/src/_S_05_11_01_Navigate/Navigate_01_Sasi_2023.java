package _S_05_11_01_Navigate;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_01_Sasi_2023{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		Thread.sleep(1500);

		WebElement Tomorrow = driver.findElement(By.linkText("Tomorrow"));
		Tomorrow.click();
		Thread.sleep(1500);

		driver.navigate().refresh();
		Thread.sleep(1500);

		driver.navigate().back();
		Thread.sleep(1500);

		driver.navigate().forward();
		Thread.sleep(1500);

		WebElement box = driver.findElement(By.xpath("/html/body/div/div/div/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td"));
		String Box_color = box.getCssValue("background-color");
		System.out.println("Box_color"+Box_color);

		
		Rectangle Box_size = box.getRect();
		int height = Box_size.getHeight();
		int width = Box_size.getWidth();
				System.out.println("Height ="+height+ "\n"+ "Width = "+width);
				
		Dimension Box_size2 = box.getSize();
		int height2 = Box_size.getHeight();
		int width2 = Box_size.getWidth();
		System.out.println("Height2 ="+height2+ "\n"+ "Width2 = "+width2);
		
		driver.close();

	}

}
