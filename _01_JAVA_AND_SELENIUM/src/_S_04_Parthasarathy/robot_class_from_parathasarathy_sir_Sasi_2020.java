package _S_04_Parthasarathy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot_class_from_parathasarathy_sir_Sasi_2020 {

	public static void main(String[] args) throws AWTException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.edureka.co/");
		d.findElement(By.linkText("Courses")).click();
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("a");
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("b");
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("c");
		
		r.mouseMove(30, 100);
		System.out.println("d");
		
	}

}
