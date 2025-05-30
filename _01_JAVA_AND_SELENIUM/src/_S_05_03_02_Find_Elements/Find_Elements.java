package _S_05_03_02_Find_Elements;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Elements {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://letcode.in/edit");

		List<WebElement> Label_elements = d.findElements(By.tagName("label"));
		// Size of Label
		int size = Label_elements.size();
		System.out.println("Label_elements Size = "+size);
		System.out.println("---------------------------------------");
		
		//Label's 3 Element Print
		WebElement Label_elements_3 = Label_elements.get(3);
		String text = Label_elements_3.getText();
		System.out.println("Label_elements_3 = "+text);
		System.out.println("---------------------------------------");
		
		//Print all elements in label
		for (WebElement webElement : Label_elements) {
			String Label_elements_text = webElement.getText();
			System.out.println("Label_elements_text = "+Label_elements_text);
		}
		
		d.quit();

	}

}
