package _S_01_IT_ST;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class IT_ST_22_DesiredCapabilities_BrowserCheck_Sasi_2020 {

	public static void main(String[] args) {
        System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");

        // Point directly to Firefox binary (custom install location)
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(Paths.get("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.google.co.in");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}