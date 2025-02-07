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
		WebElement google = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		google.sendKeys("c");
		Thread.sleep(3000);
		List<WebElement> optionsList=d.findElements(By.xpath("//*[@id=\"APjFqb\"]"));
		for (WebElement otionsInList : optionsList) {
			if(otionsInList.getText().equals("cricket")) {
				Thread.sleep(3000);
				otionsInList.click();
			}
	
}
	}
}
