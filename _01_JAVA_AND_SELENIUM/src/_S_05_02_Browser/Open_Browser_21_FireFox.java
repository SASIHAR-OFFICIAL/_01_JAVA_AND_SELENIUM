package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_21_FireFox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.youtube.com");
		WebElement Search_Box = d.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/form/input"));
		Search_Box.sendKeys("Savukku Shankar"+Keys.ENTER);
		Thread.sleep(1500);
		
		d.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div[1]/ytd-search-header-renderer/div[3]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div[2]")).click();
		Thread.sleep(1500);
		d.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/ytd-search-filter-options-dialog-renderer/div[2]/ytd-search-filter-group-renderer[5]/ytd-search-filter-renderer[2]/a/div/yt-formatted-string")).click();
	}

}
