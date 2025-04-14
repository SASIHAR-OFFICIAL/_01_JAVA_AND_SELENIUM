package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.leafground.com/select.xhtml");
		//1.Give input to Box
		WebElement input = d.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
		input.sendKeys("s");
		Thread.sleep(2000); //Explicit wait or implicit wait
		//2.To find "Web Services"in list
		List<WebElement> optionsList=d.findElements(By.xpath("/html/body/span/ul/li"));
		//2a.To Check whether this program run before options showing so that we can put Time Delay
		System.out.println(optionsList.size());
		//3.Checking the options in the list
		for (WebElement otionsInList : optionsList) {
			if(otionsInList.getText().equals("Selenium WebDriver")) {
				otionsInList.click();
				//System.out.println("Selecting "+otionsInList.getText());
				System.out.println("if part");

			}else {
				System.out.println("else part");
				// * If any doubt check the video Selenium Tutorial Series Advanced Concepts Part 16 Auto completion Tamil
			}
//	break;
		}
		
		
	}

}
