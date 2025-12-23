package _S_05_02_Browser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Open_Browser_15_Firefox_jio_Block_Location {

	public static void main(String[] args) {
        // Create Firefox profile
        FirefoxProfile profile = new FirefoxProfile();

        // 2 = Block / Dismiss location access
        profile.setPreference("permissions.default.geo", 2);
//        0	Ask every time
//        1	Allow
//        2	Block (Dismiss)
        

        // Optional: disable notifications
        profile.setPreference("dom.webnotifications.enabled", false);

        // Apply profile to Firefox
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);

        // Launch Firefox
        WebDriver driver = new FirefoxDriver(options);

        // Visit Jio website
        driver.get("https://www.jio.com/");
        driver.manage().window().maximize();

        // Wait to observe (optional)
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Close browser
//        driver.quit();
    }
}
