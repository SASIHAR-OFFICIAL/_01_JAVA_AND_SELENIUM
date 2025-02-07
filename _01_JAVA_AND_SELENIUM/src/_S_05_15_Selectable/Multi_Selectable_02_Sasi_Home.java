package _S_05_15_Selectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_02_Sasi_Home {

	public static void main(String[] args) throws InterruptedException {		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver FDriver = new FirefoxDriver();
		FDriver.manage().window().maximize();
		FDriver.get("https://www.leafground.com/checkbox.xhtml");
		Thread.sleep(1500);
		
		WebElement Basic_Checkbox = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/div/div[2]"));
		Basic_Checkbox.click();
		Thread.sleep(1500);
		
		WebElement Notification = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]"));
		Notification.click();
		Thread.sleep(1500);
		
		WebElement languages1 = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]"));languages1.click();Thread.sleep(1500);WebElement languages2 = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[2]/div/div[2]"));languages2.click();Thread.sleep(1500);WebElement languages3 = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[5]/div/div[2]"));
		languages3.click();
		Thread.sleep(1500);
		
		WebElement Toogle = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div[2]"));
		Toogle.click();
		WebElement verify =FDriver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		boolean verify_Status = verify.isEnabled();
		System.out.println("Verify if check box is Enabled or disabled = "+verify_Status);
		
		WebElement Multi_Select = FDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/ul"));
		
		Select Select_Multiple = new Select(Multi_Select);
		Select_Multiple.selectByIndex(0);
		Select_Multiple.selectByIndex(1);
		Select_Multiple.selectByIndex(2);
		Select_Multiple.selectByIndex(3);

		


		/*FDriver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[7]/div/div[2]")).click();
		 * Thread.sleep(1500);
		 * FDriver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[5]/div/div[2]")).click();
		 * Thread.sleep(1500);
		 * FDriver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[3]/div/div[2]")).click();
		 * Thread.sleep(1500);
		 * FDriver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[9]/div/div[2]")).click();
		 * Thread.sleep(1500);*/
			}
		}