package _S_05_20_Links_Advanced;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/Link.html");*/

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.leafground.com/link.xhtml");



		WebElement GotoHomePage =d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/a"));
		GotoHomePage.click();
		Thread.sleep(1000);
		d.navigate().back();
		Thread.sleep(1000);

		WebElement Find_my_destination = d.findElement(By.partialLinkText("Find the URL without clicking me"));
		String where=Find_my_destination.getAttribute("href");
		System.out.println("This link is going to "+where);
		Thread.sleep(1000);

		WebElement Verifybroken=d.findElement(By.linkText("Broken?"));
		Verifybroken.click();
		String title =d.getTitle();
		if (title.contains("404")) {
			System.out.println("Yes the link is broken");

		}
		d.navigate().back();
		Thread.sleep(1000);

		WebElement GotoHomePage2 =d.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[1]/div/div/a"));
		GotoHomePage2.click();
		Thread.sleep(1000);
		d.navigate().back();

		List<WebElement> linkCount= d.findElements(By.tagName("a"));
		int totalCount= linkCount.size();
		System.out.println("Total Count in this page " +totalCount);



		List<WebElement> Layout = d.findElements(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]"));
		int Links_in_this_Layout = Layout.size();
		System.out.println("Links_in_this_Layout = "+Links_in_this_Layout);

	}

}
