package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Selectable_07_Sasi_2023 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();

		//Visiting Website and Select Grid-------------------------------------------------------------
		F.get("https://demoqa.com/selectable");
		WebElement Grid =F.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]"));
		Grid.click();

		
		List<WebElement> Grid_Table = F.findElements(By.xpath("//*[@id=\"demo-tabpane-grid\"]/li"));
		int Grid_Table_size = Grid_Table.size();
		System.out.println("-------------------------------------");
		System.out.println("Grid_Table_size = "+Grid_Table_size);
		System.out.println("-------------------------------------");
	
		
		
		
	}


}
