package _S_01_IT_ST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IT_ST_22_Fill_Form_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("https://admission.upes.ac.in/applicationformstep1.aspx");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//Step 1: Basic Details
			d.findElement(By.xpath("/html/body/main/section/div/div[2]/div[2]/div[1]/input")).sendKeys("Rajkumar");
			Thread.sleep(2000);
			d.findElement(By.name("lname")).sendKeys("hariram");
			Thread.sleep(2000);
			WebElement r=d.findElement(By.id("rbtnlevel_1"));
			r.click();
			Select drp=new Select(d.findElement(By.name("courseid")));
			drp.selectByVisibleText("MBA");
			Select dr=new Select(d.findElement(By.name("program1")));
			dr.selectByVisibleText("Aviation Management");
			Thread.sleep(2000);
			d.findElement(By.name("dob")).sendKeys("01/11/1991");
			Thread.sleep(2000);
			d.findElement(By.name("email")).sendKeys("rajkumarhariram22@gmail.com");
			Thread.sleep(2000);
			d.findElement(By.name("txtconfirmEmail")).sendKeys("rajkumarhariram22@gmail.com");
			Thread.sleep(2000);
			Select drp1=new Select(d.findElement(By.name("Country_Code")));
			Thread.sleep(2000);
			drp1.selectByVisibleText("+91");
			Thread.sleep(2000);
			d.findElement(By.name("mobile")).sendKeys("9842290039");
			Thread.sleep(2000);
			WebElement r1=d.findElement(By.id("nationality_0"));
			r1.click();
			Thread.sleep(2000);
			Select drp2=new Select(d.findElement(By.name("stateid")));
			drp2.selectByVisibleText("Tamil Nadu");
			Thread.sleep(2000);
			Select drp3=new Select(d.findElement(By.name("cityid")));
			drp3.selectByVisibleText("Chennai");
			Thread.sleep(2000);
			Select drp4=new Select(d.findElement(By.name("enquirysourse")));
			drp4.selectByVisibleText("Book Seller");
			Thread.sleep(2000);
			WebElement ch=d.findElement(By.name("chkacknowledge"));
			ch.click();
			d.findElement(By.name("btnsub")).click();
			//if(!d.findElement(By.id("lblnotice"]/a")).isSelected())
			//{
			//d.findElement(By.xpath("*[@id="lblnotice"]/a")).sendKeys("hrajkumar22@gmail.com");
			//}
			//else if(!d.findElement(By.id("username")).isSelected())
			//{
			//d.findElement(By.id("username")).sendKeys("hrajkumar22@gmail.com");
			//}
			//Doubt how to open a new tab by using script
			//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
			//d.findElement(By.linkText("www.gmail.co.in")).sendKeys(selectLinkOpeninNewTab);
			//d.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			//d.manage().window().maximize();
			//d.findElement(By.className(".aCsJod.oJeWuf")).sendKeys("rajkumarhariram@gmail.com");
			//d.findElement(By.className(".whsOnd.zHQkBf")).sendKeys("rajkumarhariram");
	
}
}
