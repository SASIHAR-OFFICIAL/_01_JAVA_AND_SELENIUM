package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_08_Sasi_Basic_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.astrosage.com/tamil/");

		WebElement astroname =F.findElement(By.id("astroname"));
		astroname.sendKeys("Ramu");

		WebElement Gender = F.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/form/div[3]/select"));
		Gender.sendKeys("M");

		//Date Drop down total -----------------------------------------
		WebElement DD_Drop = F.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/form/div[4]/select"));
		DD_Drop.sendKeys("23");
		Thread.sleep(1500);
		Select DD_Select = new Select(DD_Drop);
		DD_Select.selectByIndex(5);
		Thread.sleep(1500);
		DD_Select.selectByVisibleText("15");
		Thread.sleep(1500);
		List<WebElement> DD_Select_Total = DD_Select.getOptions();
		int DD_Total =DD_Select_Total.size();
		System.out.println("Date Drop down total");
		System.out.println("DD_Select_Total = "+DD_Total);
		System.out.println("----------------------------");

		//Get Horoscope Box Color -------------------------------
		WebElement GET_Horo_Box = F.findElement(By.id("widzbtn"));
		String GET_Horo_Box_Color = GET_Horo_Box.getCssValue("background");
		System.out.println("Get Horoscope Box Color");
		System.out.println("GET_Horo_Box_Color = "+GET_Horo_Box_Color);

		//Get Horoscope Box size -------------------------------

		Dimension GET_Horo_Box_Size =GET_Horo_Box.getSize();
		int Hei =GET_Horo_Box_Size.getHeight();
		int Wid =GET_Horo_Box_Size.getWidth();
		System.out.println("Get Horoscope Box size");
		System.out.println("Height = "+Hei +'\n'+"Width = "+Wid);
		System.out.println("----------------------------");

		//Get Horoscope Box Text -------------------------------

		String Text_in_Box = GET_Horo_Box.getText();
		System.out.println("Get Horoscope Box Location");
		System.out.println("Text_in_Box = "+Text_in_Box);
		System.out.println("----------------------------");

		//Get Horoscope Box Location -------------------------------
		Point GET_Horo_Box_Location = GET_Horo_Box.getLocation();
		int X_Location = GET_Horo_Box_Location.getX();
		int Y_Location = GET_Horo_Box_Location.getY();
		System.out.println("Get Horoscope Box Location");
		System.out.println("X_Location = "+X_Location +'\n'+"Y_Location = "+Y_Location);
		astroname.clear();
		System.out.println("----------------------------");
		
		//GET_Horo_Box Enable or Disabled
		boolean Get_horos_Box_Status = GET_Horo_Box.isEnabled();
		if (Get_horos_Box_Status =true) {
			System.out.println("Get_horos_Box_Status is Enabled");
			System.out.println("-------------------------------");
		}

		//Alert ----------------------
		GET_Horo_Box.click();
		Alert Alert_Box =	F.switchTo().alert();
		Thread.sleep(1500);
		String Alert_Title =Alert_Box.getText();
		System.out.println("Alert Text");
		System.out.println("Alert_Title = "+Alert_Title);
		Alert_Box.accept();
	}

}
