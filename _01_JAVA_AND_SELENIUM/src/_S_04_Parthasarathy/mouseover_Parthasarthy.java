package _S_04_Parthasarathy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseover_Parthasarthy {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		/*d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
				 Thread.sleep(2000);
				// d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				 
				 		d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys("sylix");
				 		 	
				 			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys("admin");
				 			
				 			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
				 			Thread.sleep(6000);
				 			//d.switchTo().alert().accept();
				 						 			
				 		//	Alert aa = d.switchTo().alert();
				 			//System.out.println("Alert Text\n" +aa.getText());
				 			//d.switchTo().alert().accept();
				 			//d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
				 			d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
				 			Thread.sleep(6000);
				 			d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys("infotest");
				 			Thread.sleep(4000);
				 			Select state=new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
				 			state.selectByIndex(16);
				 		//state.selectByVisibleText("Manipur");
				 			
				 			
				 			
				 			
				 			
				 			//Thread.sleep(60000);
				 			//d.switchTo().alert().getText();
				 			//d.switchTo().alert().accept();	 			
				 
				 			Thread.sleep(65000);
				
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=colbuddy9&Login=Login");	
	//d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
		d.manage().window().maximize();
		//Thread.sleep(30000);
	
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Actions a=new Actions(d);
		WebElement moveonmenu = d.findElement(By.xpath(".//*[@id='Automation Tools']"));
		
		a.moveToElement(moveonmenu).build().perform();
		
		Thread.sleep(3000);
		WebElement elem2 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a"));
		a.moveToElement(elem2).build().perform();
		
		Thread.sleep(3000);
		
		WebElement elem3 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		
		a.moveToElement(elem3).click().build().perform();
		
		Thread.sleep(30000);
		 
		d.get("https://www.amazon.in");
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,3250)", "");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-3250)", "");  

		Thread.sleep(80000);	 
	d.get("http://www.facebook.com");
		
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/sss.jpg"));
		
		
	d.get("http://www.india.com");
        File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:/hhh.png"));
		
		
		
     d.navigate().back();
	    d.navigate().refresh();
    d.navigate().forward();   */
		
	  d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login"); 
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		  d.navigate().refresh();     
	  //Code to open a new link from current page to new page
	    ((JavascriptExecutor)d).executeScript("window.open()");
	    ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
	    d.switchTo().window(tab2.get(1));
	    d.get("http://google.com");
		Thread.sleep(3000);
	    d.navigate().refresh();
	    //To stay and move to the current second window
	    ((JavascriptExecutor)d).executeScript("window.open()");
	    ArrayList<String> tabs3 = new ArrayList<String>(d.getWindowHandles());
	    d.switchTo().window(tabs3.get(2));
	    d.get("http://google.com");
		Thread.sleep(3000);
	   //To move back to the parent window
	    ArrayList<String> tab1 = new ArrayList<String>(d.getWindowHandles());
	    d.switchTo().window(tab1.get(0));
	   d.get("https://www.amazon.in");
	    d.navigate().refresh();
	    Thread.sleep(3000); 
	    ArrayList<String> tab2r = new ArrayList<String>(d.getWindowHandles());
	    d.switchTo().window(tab2r.get(2));
		Thread.sleep(3000);
	    d.get("https://www.amazon.in/gp/product/B07DWP6GWB/ref=s9_acss_bw_cg_Sneakpee_2b1_w?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-5&pf_rd_r=J62K17T4SV2WKCT4C7VC&pf_rd_t=101&pf_rd_p=89ca6c5f-3ec5-4fb9-ba0f-268b8c8b0ffc&pf_rd_i=1389396031");
	    d.navigate().back();
	    d.navigate().refresh();
	    d.navigate().forward();
	}

}
