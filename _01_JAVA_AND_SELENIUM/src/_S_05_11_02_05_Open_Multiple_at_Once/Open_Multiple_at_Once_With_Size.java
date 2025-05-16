package _S_05_11_02_05_Open_Multiple_at_Once;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Multiple_at_Once_With_Size {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.tamilnadutourism.tn.gov.in/");
		List<WebElement> Total_Web_Page = driver.findElements(By.tagName("a"));
		int Total_Web_Page_size = Total_Web_Page.size();
		System.out.println(Total_Web_Page_size);
		System.out.println("Total_Web_Page = "+driver.findElements(By.tagName("a")).size());

		WebElement Attractions = driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-sm-block d-none']"));
		List<WebElement> Attractions_elements = Attractions.findElements(By.tagName("a"));
		int Attractions_elements_size = Attractions_elements.size();
		System.out.println("Attractions_elements_size = "+Attractions_elements_size);

		for (int i = 0;i <Attractions_elements_size; i++) {
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);	
			Attractions_elements.get(i).sendKeys(chord);
		}

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator_Obj = windowHandles.iterator();
		while (iterator_Obj.hasNext()) {
			Thread.sleep(1500);

			driver.switchTo().window(iterator_Obj.next());
			String currentUrl = driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(currentUrl +"=" +title);

		}
		driver.quit();
		}}
