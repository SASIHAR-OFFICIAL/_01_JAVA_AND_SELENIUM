package _S_05_12_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_07_Sasi_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver F = new FirefoxDriver(); //navigates to the Browser
		F.get("https://testpages.eviltester.com/styled/frames/frames-test.html"); 

		//Left Frame Name-------------------------------
		F.switchTo().frame("left");
		WebElement Left_Heading = F.findElement(By.xpath("/html/body/h1"));
		String Left_Heading_Text = Left_Heading.getText();
		System.out.println("---------------------------------------");
		System.out.println("Left_Heading_Text = "+Left_Heading_Text);

		//Left Frame List-------------------------------
		WebElement Left_Text = F.findElement(By.xpath("/html/body/ul"));
		String  Left_Text_List =Left_Text.getText();
		System.out.println("Left_Text_List = "+Left_Text_List);
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

		//Middle Frame Name-------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame("middle");
		WebElement Middle_Heading = F.findElement(By.xpath("/html/body/h1"));
		String Middle_Heading_Text = Middle_Heading.getText();
		System.out.println("Middle_Heading_Text = "+Middle_Heading_Text);
		System.out.println("---------------------------------------");

		//Middle Frame List-------------------------------
		WebElement Middle_Text = F.findElement(By.xpath("/html/body/ul"));
		String  Middle_Text_List =Middle_Text.getText();
		System.out.println("Middle_Text_List = "+Middle_Text_List);
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

		//Right Frame Name-------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame("right");
		WebElement Right_Heading = F.findElement(By.xpath("/html/body/h1"));
		String Right_Heading_Text = Right_Heading.getText();
		System.out.println("Right_Heading_Text = "+Right_Heading_Text);
		System.out.println("---------------------------------------");

		//Right Frame List-------------------------------
		WebElement Right_Text = F.findElement(By.xpath("/html/body/ul"));
		String  Right_Text_List =Right_Text.getText();
		System.out.println("Right_Text_List = "+Right_Text_List);
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");


	}
}
