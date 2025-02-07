package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_04_Sasi_2023 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();

		//Visiting Website and going to SELECTABLE table page--------------------------------------------------
		F.get("https://demo.automationtesting.in/Selectable.html");
		WebElement Serialize_Box =F.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		Serialize_Box.click();

		//Table Size---------------------------------------------------------------------------------------
		List<WebElement> Testing_Table = F.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/ul/li"));
		int Testing_Table_Size =Testing_Table.size();
		System.out.println("---------------------------------");
		System.out.println("Testing_Table_Size = "+Testing_Table_Size);
		System.out.println("---------------------------------");
		
		//Select Table Items 1 -------------------------------------------------------------------------------
		
//		Actions Testing_Table_Select = new Actions(F);
//		Testing_Table_Select.keyDown(Keys.CONTROL)
//		.click(Testing_Table.get(4))
//		.click(Testing_Table.get(5))
//		.click(Testing_Table.get(6)).build().perform();
//		
//		//Click Release ---------------------------
//		Thread.sleep(1500);
//		Testing_Table_Select.release().build().perform();
//		Thread.sleep(1500);
		
		//Select Table Items 2 -------------------------------------------------------------------------------
		Actions Testing_Table_Select2 = new Actions(F);
		Testing_Table_Select2.clickAndHold(Testing_Table.get(1));
		Testing_Table_Select2.clickAndHold(Testing_Table.get(2));
		Testing_Table_Select2.clickAndHold(Testing_Table.get(3));
		Testing_Table_Select2.build().perform();
	}
}


