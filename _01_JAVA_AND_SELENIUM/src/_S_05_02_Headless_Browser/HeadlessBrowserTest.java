package _S_05_02_Headless_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserTest {

    public static void main(String[] args) {

        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Chrome Options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // headless mode
        options.addArguments("--disable-gpu");  // optional, for compatibility
        options.addArguments("--window-size=1920,1080"); // simulate screen size

        // Launch browser
        WebDriver driver = new ChromeDriver(options);

        // Navigate to site
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}