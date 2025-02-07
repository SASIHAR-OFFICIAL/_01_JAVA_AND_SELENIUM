package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_07_Sasi_Basic_Home {
	public static void main(String[] args) throws InterruptedException {
		
		//-ONLY ALERT----ONLY ALERT----ONLY ALERT-ONLY ALERT----ONLY ALERT----ONLY ALERT----ONLY ALERT
				
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.leafground.com/alert.xhtml");	

		//Alert_Simple_Dialog-------------------------------------------------
		WebElement  Alert_Simple_Dialog = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		Alert_Simple_Dialog.click();
		Alert Alert1 =F.switchTo().alert();
		Thread.sleep(1500);
		String Alert1_text =Alert1.getText();
		System.out.println("----------------------------");
		System.out.println("Alert1_text = "+Alert1_text);
		System.out.println("----------------------------");
		Alert1.accept();

		//Alert (Confirm Dialog)-------------------------------------------------
		WebElement  Alert_Confirm_Dialog = F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		Alert_Confirm_Dialog.click();
		Alert Alert2 =F.switchTo().alert();
		Thread.sleep(1500);
		String Alert2_text =Alert1.getText();
		System.out.println("Alert1_text = "+Alert2_text);
		System.out.println("----------------------------");
		Alert2.dismiss();

		//Sweet Alert (Simple Dialog)-------------------------------------------------
		WebElement  Sweet_Alert_Simple_Dialog = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
		Sweet_Alert_Simple_Dialog.click();
		String Dialog1=F.getWindowHandle();
		F.switchTo().window(Dialog1);
		Thread.sleep(1500);
		String Dialog1_Text = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div[2]/p")).getText();
		System.out.println("Dialog1_Text = "+Dialog1_Text);
		F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div[1]/a/span")).click();
		Thread.sleep(1500);


		// Alert (Prompt Dialog)---------------------------------------------------------
		WebElement  alert4 = F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
		alert4.click();
		Alert Alert4 =F.switchTo().alert();
		Thread.sleep(1500);
		Alert4.sendKeys("Dialog_Text 123456789");
		String Alert4_text =Alert1.getText();
		System.out.println("----------------------------");
		System.out.println("Alert4_text = "+Alert4_text);
		Alert4.accept();
		Thread.sleep(1500);


		//Sweet Alert (Confirmation)-------------------------------------------------
		WebElement Alert5 = F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]"));
		Alert5.click();
		F.getWindowHandle();
		Thread.sleep(1500);
		String Sweet_Text =F.findElement(By.xpath("/html/body/div[7]/div[2]/span[2]")).getText();
		System.out.println("-----------------------------------------------------");
		System.out.println("Sweet_Text = "+Sweet_Text);
		F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt108\"]")).click();
		Thread.sleep(1500);


		//Minimize and Maximize------------------------------------------------------
		WebElement Alert6 = F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]"));
		Alert6.click();
		F.getWindowHandle();
		Thread.sleep(1500);
		String Min_Max_Text = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/div[2]/p")).getText();
		Thread.sleep(1500);
		System.out.println("----------------------------------------------------------");
		System.out.println("Min_Max_Text = "+Min_Max_Text);
		F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/div[1]/a[2]/span")).click();
		Thread.sleep(1500);
		System.out.println("----------------------------------------------------------");
		System.out.println("The Website https://www.leafground.com/alert.xhtml"+'\n'+"Open all ALERT BOXES and closed");
		F.quit();
	
	}
}
