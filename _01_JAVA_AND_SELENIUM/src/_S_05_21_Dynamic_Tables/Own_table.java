package _S_05_21_Dynamic_Tables;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Own_table {

	public static void main(String[] args) throws IOException {
WebDriver d = new FirefoxDriver();
//			
//		File File_table = new File("D:\\SELENIUM FILE CREATED BY SASI\\table.htm");
//		Desktop Desktop_Obj = Desktop.getDesktop();
//		Desktop_Obj.open(File_table);
		d.navigate().to("D:\\SELENIUM FILE CREATED BY SASI\\table.htm");
		
		List<WebElement> th = d.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total Coloumn = "+th.size());
		
		List<WebElement> tr = d.findElements(By.tagName("tr"));
		System.out.println("Total Row = "+tr.size());
	
		List<WebElement> td = d.findElements(By.tagName("td"));
		System.out.println("Total data = "+td.size());
		}
}
