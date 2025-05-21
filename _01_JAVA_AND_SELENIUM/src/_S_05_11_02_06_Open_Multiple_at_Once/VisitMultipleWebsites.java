package _S_05_11_02_06_Open_Multiple_at_Once;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisitMultipleWebsites {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
  

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        // List of websites to visit
        String[] websites = {
            "https://www.google.com",
            "https://www.wikipedia.org",
            "https://www.github.com",
            "https://www.stackoverflow.com"
        };

        // Loop through websites
        for (String site : websites) {
            driver.get(site);
            try {
                // Wait 3 seconds on each site for demonstration
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
      //  driver.quit();
    }
}
