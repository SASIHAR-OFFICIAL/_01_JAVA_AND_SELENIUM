package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Position_Size_Color_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.gecko.driver","C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver Firefox = new FirefoxDriver();
		Firefox.get("https://www.maalaimalar.com/movie-review");
		Firefox.manage().window().maximize();
		
		WebElement Box_Pos = Firefox.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div[1]/div/div[2]"));
		Point Posi_of_Box = Box_Pos.getLocation();
		int X_pos = Posi_of_Box.getX();
		int Y_pos = Posi_of_Box.getY();
		System.out.println("X location is "+X_pos +'\n'+"Y location is "+Y_pos);
		System.out.println("----------------------------------------------------");
		
		WebElement size_of_box = Firefox.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div[1]/div/div[2]"));
		Dimension Box_Size = size_of_box.getSize();
		int heg = Box_Size.getHeight();
		int Wid =Box_Size.getWidth();
		System.out.println("Height is "+heg +'\n' +"Width is "+Wid);
		System.out.println("----------------------------------------------------");

		
		WebElement color_of_box = Firefox.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div[1]/div/div[2]"));
		String Box_Color =color_of_box.getCssValue("background-color");
		System.out.println("Box_Color is "+Box_Color);
	}

}
