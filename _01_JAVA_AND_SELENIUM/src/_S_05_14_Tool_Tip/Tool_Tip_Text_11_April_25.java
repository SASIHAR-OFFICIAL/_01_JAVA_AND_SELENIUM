package _S_05_14_Tool_Tip;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tool_Tip_Text_11_April_25 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		//d.manage().window().maximize();
		d.navigate().to("https://practice.expandtesting.com/tooltips");

		WebElement element = d.findElement(By.xpath("//*[@id=\"btn1\"]"));

		

        Actions actions = new Actions(d);
        actions.moveToElement(element).perform();

        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(50));

        // This depends on how the tooltip is structured
        WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".tooltip-class-or-other-selector")
        ));

        String tooltipText = tooltip.getText();
        System.out.println("Tooltip text: " + tooltipText);
    }
}