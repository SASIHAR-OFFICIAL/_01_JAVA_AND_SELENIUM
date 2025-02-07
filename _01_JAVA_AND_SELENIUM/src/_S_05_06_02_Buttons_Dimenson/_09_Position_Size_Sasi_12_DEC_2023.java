package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _09_Position_Size_Sasi_12_DEC_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://testproject.io/");

		//Learn More ---------------------------------------------------------------------------------------------
		WebElement Learn_More = d.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/a"));
		Point Learn_more_location = Learn_More.getLocation();
		int Learn_more_location_X = Learn_more_location.getX();
		int Learn_more_location_Y = Learn_more_location.getY();
		String Learn_More_Innner_Text = Learn_More.getText();
		Dimension Learn_More_size = Learn_More.getSize();
		int Learn_More_Height = Learn_More_size.getHeight();
		int Learn_More_Width = Learn_More_size.getWidth();

				System.out.println("-------------LEARN MORE ---------------------");
		System.out.println("-----------------------------------------------");
		System.out.println(" LEARN MORE LOCATION");
		System.out.println("-----------------------------------------------");
		System.out.println("Learn_more_Location_X = "+Learn_more_location_X);
		System.out.println("Learn_more_Location_Y = "+Learn_more_location_Y);
		System.out.println("Learn_More_Innner_Text = "+Learn_More_Innner_Text);
		System.out.println("----------------------------------------------");
		System.out.println("LEARN MORE SIZE");
		System.out.println("-----------------------------------------------");
		System.out.println("Learn_More_Height = "+Learn_More_Height);
		System.out.println("Learn_More_Width = "+Learn_More_Width);

		System.out.println("---------------------------------------------------");

		///I_Agree --------------------------------------------------------------------------------------------------
		WebElement I_Agree = d.findElement(By.xpath("//*[@id=\"cc-button\"]"));
		Point I_Agree_Location = I_Agree.getLocation();
		int I_Agree_X = I_Agree_Location.getX();
		int I_Agree_Y = I_Agree_Location.getY();
		String I_Agree_Location_Text = I_Agree.getText();

		Dimension I_Agree_size = I_Agree.getSize();
		int I_Agree_Height = I_Agree_size.getHeight();
		int I_Agree_Width = I_Agree_size.getWidth();

		
		System.out.println("-------------I AGREE---------------------");
		System.out.println("-----------------------------------------------");
		System.out.println("I AGREE LOCATION");
		System.out.println("-----------------------------------------------");
		System.out.println("I_Agree_X = "+I_Agree_X);
		System.out.println("I_Agree_Y = "+I_Agree_Y);
		System.out.println("I_Agree_Location_Text = "+I_Agree_Location_Text);
		System.out.println("---------------------------------------------------");
		System.out.println("I AGREE SIZE");
		System.out.println("-----------------------------------------------");
		System.out.println("I_Agree_Height = "+I_Agree_Height);
		System.out.println("I_Agree_Width = "+I_Agree_Width);
	}
}
