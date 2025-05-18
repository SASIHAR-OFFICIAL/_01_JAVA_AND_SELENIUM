package _S_01_IT_ST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_04_01_Win_Handle_Navigate_Bringed {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
				
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
