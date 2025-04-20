package _S_05_21_Dynamic_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Tables_19_APRIL_25 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://practice.expandtesting.com/dynamic-table");

		List<WebElement> Columns = d.findElements(By.tagName("th"));
		int Columns_Size = Columns.size();
		System.out.println("Columns_Size ="+Columns_Size);

		List<WebElement> Rows = d.findElements(By.tagName("tr"));
		int Row_Size = Rows.size();
		System.out.println("Columns_Size ="+Row_Size);

		WebElement Row4_coloumn3 = d.findElement(By.xpath("//*[normalize-space() = 'System']/following::td[3]"));
		String Row4_coloumn3_text = Row4_coloumn3.getText().replace(" MB", ""); //Getting Text and removing text mb
		Thread.sleep(3000);
		float Row4_coloumn3_Number = Float.parseFloat(Row4_coloumn3_text);      // Converting text to float
		System.out.println("Row4_coloumn3_Number = "+Row4_coloumn3_Number);
		
//		List<WebElement> td_elements = d.findElements(By.tagName("td[]"));
//		System.out.println(td_elements);
	}
}
