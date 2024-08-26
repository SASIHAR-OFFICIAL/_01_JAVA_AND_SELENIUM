package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_06_Sasi_2023 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();

		//Visiting Website -------------------------------------------------------------
		F.get("https://demoqa.com/selectable");

		List<WebElement> List_Row = F.findElements(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
		int List_Row_size =List_Row.size();
		System.out.println("--------------------------------------------");
		System.out.println("List_Row_size = "+List_Row_size);
		System.out.println("--------------------------------------------");

//		// Selecting Item 1 ---------------------------------------------------------------
//		Actions Click_Action = new Actions(F);
//		Click_Action.keyDown(Keys.CONTROL).click(List_Row.get(3)).click(List_Row.get(4)).build().perform();
//		
		// Selecting Item 2 ---------------------------------------------------------------
		Actions Click_Action2 = new Actions(F);
		Click_Action2.clickAndHold(List_Row.get(1));
		Click_Action2.clickAndHold(List_Row.get(2));
		Click_Action2.build().perform();
	}

}
