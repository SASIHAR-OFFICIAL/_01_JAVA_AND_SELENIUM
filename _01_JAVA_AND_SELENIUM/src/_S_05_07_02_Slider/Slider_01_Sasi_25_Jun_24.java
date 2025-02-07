package _S_05_07_02_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_01_Sasi_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://emicalculator.net/");
		WebElement Amount = d.findElement(By.xpath("//*[@id=\"loanamount\"]"));
		Amount.clear();
		Amount.sendKeys("700000");

		WebElement Interest = d.findElement(By.xpath("/html/body/div/div/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[5]/span"));
		Actions Per = new Actions(d);
		Per.dragAndDropBy(Interest, 130, 0).build().perform();

		WebElement Select_Month = d.findElement(By.xpath("/html/body/div/div/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[7]/div/div/div/div/div/label[2]"));
		Select_Month.click();
		
//		WebElement Enter_Month = d.findElement(By.xpath("//*[@id=\"loanterm\"]"));
//		Enter_Month.clear();

		WebElement Tenure = d.findElement(By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[1]/div[1]/div[2]/form/div/div[8]/span"));
		Thread.sleep(1000);
		int width = Tenure.getSize().getWidth();
		System.out.println("width ="+width);
		Actions Month = new Actions(d);
		Month.dragAndDropBy(Tenure, -360, 0).build().perform();
		}}
