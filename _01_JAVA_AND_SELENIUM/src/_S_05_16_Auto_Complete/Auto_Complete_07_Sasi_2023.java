package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_07_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/auto-complete");
		
		WebElement Search_Box = driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]"));
		Search_Box.sendKeys("R");
Thread.sleep(20000);
		List<WebElement> Search_Box_Text = driver.findElements(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]/li"));
		//int Size_Count = Search_Box_Text.size();
		//System.out.println(Size_Count);
		for (WebElement List_ot_Elements : Search_Box_Text) {

			if (List_ot_Elements.getText().equals("Purple")) {
				List_ot_Elements.click();
				break;
			}
			driver.close();
						
		}
	}
}
