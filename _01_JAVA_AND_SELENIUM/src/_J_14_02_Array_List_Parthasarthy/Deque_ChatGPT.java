package _J_14_02_Array_List_Parthasarthy;

import java.util.ArrayDeque;
import java.util.Deque;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Deque_ChatGPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        try {
            // Create a Deque to manage URLs
            Deque<String> urlQueue = new ArrayDeque<>();

            // Add some URLs to the Deque
            urlQueue.add("https://www.example.com");
            urlQueue.add("https://www.google.com");
            urlQueue.add("https://www.github.com");

            // Process URLs
            while (!urlQueue.isEmpty()) {
                String url = urlQueue.poll(); // Get and remove the head of the queue

                // Navigate to the URL
                driver.get(url);

                // Example action: Print the title of the page
                System.out.println("Title of the page is: " + driver.getTitle());

                // Example: Find an element (just for demonstration)
                try {
                    WebElement element = driver.findElement(By.tagName("h1"));
                    System.out.println("Header Text: " + element.getText());
                } catch (Exception e) {
                    System.out.println("No h1 tag found on this page.");
                }

                // Pause for demonstration purposes
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

	}


