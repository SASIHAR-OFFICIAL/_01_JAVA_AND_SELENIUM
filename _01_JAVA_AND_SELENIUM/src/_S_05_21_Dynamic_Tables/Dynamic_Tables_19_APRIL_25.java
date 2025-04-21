package _S_05_21_Dynamic_Tables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

		

		// Finding Column Heading and table data
		
		
		WebElement th_Name1 = d.findElement(By.xpath("//*[text()='CPU']"));
		String th_Name1_text1 = th_Name1.getText();
		System.out.println("th_Name1_text1 ="+th_Name1_text1);
		if(th_Name1_text1.equals("CPU")) {
				
		List<WebElement> All_CPU_usage = d.findElements(By.xpath("//tr/td[2]"));   // Getting all td[2] values (All Column values).

		List<Integer> CPU_usage_list = new ArrayList<>();

		for (WebElement webElement : All_CPU_usage) {
			String All_CPU_usage_in_Text = webElement.getText().replace("%", "");
			CPU_usage_list.add((Float.parseFloat(All_CPU_usage_in_Text)));
		
			}
		System.out.println("All CPU_usage_list2 = "+CPU_usage_list);

		float CPU_usage_Maximum = Collections.max(CPU_usage_list);
		System.out.println("CPU_usage_Maximum = "+CPU_usage_Maximum);
	}
	}}
