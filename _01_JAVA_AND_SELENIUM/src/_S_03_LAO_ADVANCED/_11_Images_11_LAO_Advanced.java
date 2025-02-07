package _S_03_LAO_ADVANCED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _11_Images_11_LAO_Advanced {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.get("https://the-internet.herokuapp.com/broken_images");
		WebElement Image_1 = D.findElement(By.xpath("/html/body/div[2]/div/div/img[1]"));
		if (Image_1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image_1 is BROKEN");
		}
		else {
			System.out.println("The image_1 is NOT BROKEN");
		}
		WebElement Image_2 = D.findElement(By.xpath("/html/body/div[2]/div/div/img[2]"));
		if (Image_2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image_2 is BROKEN");
		}
		else {
			System.out.println("The Image_2 is NOT BROKEN");
		}
		WebElement Image_3 = D.findElement(By.xpath("/html/body/div[2]/div/div/img[3]"));
		if (Image_3.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image_3 is BROKEN");
		}
		else {
			System.out.println("The Image_3 is NOT BROKEN");
		}
		Thread.sleep(3000);
//		String URL_1 ="https://www.lambdatest.com/blog/find-broken-images-using-selenium-webdriver/";
//		D.switchTo().newWindow(null);
		D.get("https://www.seleniumeasy.com/selenium-tutorials/find-broken-images-in-a-webpage-using-webdriver-java");
		WebElement Image_4 = D.findElement(By.xpath("/html/body/div[3]/div/section/article/div[1]/div/div/p[3]/img"));
		if (Image_4.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image_4 is BROKEN");
		}
		else {
			System.out.println("The Image_4 is NOT BROKEN");
		}
	}}

