package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_02_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		Thread.sleep(3000);
//		WebElement Stay_signed_out = d.findElement(By.xpath("//button[text()='Stay signed out']"));
//		Stay_signed_out.click();
		
		WebElement google = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		google.click();
		google.sendKeys("cri");
		Thread.sleep(3000);
		List<WebElement> optionsList=d.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("located");
		for (WebElement webElement : optionsList) {
			Thread.sleep(3000);
			if(webElement.getText().equals("cricket")) {
				webElement.click();
		}
		
//		for (WebElement otionsInList : optionsList) {
//			if(otionsInList.getText().equals("cricket")) {
//				System.out.println("waiting");
//				Thread.sleep(3000);
//				otionsInList.click();
//				System.out.println("clicked");
//				break;
//			}
			Thread.sleep(3000);
			//d.quit();
			}}}
