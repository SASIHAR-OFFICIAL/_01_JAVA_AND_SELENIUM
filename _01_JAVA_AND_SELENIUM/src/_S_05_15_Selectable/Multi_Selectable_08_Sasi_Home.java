package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_08_Sasi_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

						// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
				WebDriver F =new FirefoxDriver();
				F.manage().window().maximize();
				F.get("https://letcode.in/selectable");
				
				List<WebElement> SelectableTable = F.findElements(By.xpath("//*[@id=\"container\"]/li"));
				Thread.sleep(3000);
				Actions ItemSelect = new Actions(F);
//				ItemSelect.keyDown(Keys.CONTROL).click(SelectableTable.get(6)).click(SelectableTable.get(7)).build().perform();
				ItemSelect.clickAndHold(SelectableTable.get(3));
				ItemSelect.clickAndHold(SelectableTable.get(5));
				ItemSelect.clickAndHold(SelectableTable.get(7));
				ItemSelect.build().perform();
				
			}

		}