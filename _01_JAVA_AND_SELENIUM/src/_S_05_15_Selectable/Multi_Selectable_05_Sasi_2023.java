package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_05_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://letcode.in/selectable");
		
		List<WebElement> SelectableTable = F.findElements(By.xpath("//*[@id=\"selectable\"]"));
		int SelectableTable_Size = SelectableTable.size();
		System.out.println("SelectableTable_Size = "+SelectableTable_Size);
		
//		Actions ItemToSelect = new Actions(F);
//		ItemToSelect.keyDown(Keys.CONTROL)
//		.click(SelectableTable.get(3))
//		.click(SelectableTable.get(5))
//		.click(SelectableTable.get(7))
//		.build().perform();
//		
//		Thread.sleep(1500);
		
		Actions ItemToSelect1 = new Actions(F);
		ItemToSelect1.clickAndHold(SelectableTable.get(2));
		ItemToSelect1.clickAndHold(SelectableTable.get(4));
		ItemToSelect1.clickAndHold(SelectableTable.get(6));
		ItemToSelect1.build().perform();
		
	}

}
