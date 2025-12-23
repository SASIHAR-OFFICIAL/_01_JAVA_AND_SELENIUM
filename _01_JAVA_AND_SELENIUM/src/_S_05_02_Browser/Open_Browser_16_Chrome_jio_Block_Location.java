package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Open_Browser_16_Chrome_jio_Block_Location {

    public static void main(String[] args) {

        // Chrome preferences
        Map<String, Object> prefs = new HashMap<>();

        // 1 = Allow, 2 = Block
        prefs.put("profile.default_content_setting_values.geolocation", 2);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Optional: disable notifications
        options.addArguments("--disable-notifications");

        // Launch Chrome
        
        WebDriver driver = new ChromeDriver(options);

        // Visit Jio website
        driver.get("https://www.jio.com/");
        driver.manage().window().maximize();

        // Wait for observation (optional)
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Close browser
//        driver.quit();
    }
}