package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Position_Size_Color_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/Button.html");

		//1. Finding X & Y points

		WebElement button= d.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint=button.getLocation();
		int xPoint=xypoint.getX();
		int yPoint=xypoint.getY();
		System.out.println("X Value is "+xPoint+"Y Value is"+xypoint);

		//2. Finding BoxColor

		WebElement boxColor = d.findElement(By.id("color"));
		String color=boxColor.getCssValue("background-color");
		System.out.println("Butoon Color is: "+color);		

		//3. Finding BoxSize
		WebElement BoxSize= d.findElement(By.id("size"));
		int Hegiht=BoxSize.getSize().getHeight();
		int Width=BoxSize.getSize().getWidth();
		System.out.println("Height is "+Hegiht+ "Width is"+Width);

		//4. Go to Home page
		WebElement homeButton=d.findElement(By.id("home"));
		homeButton.click();


	}

}
