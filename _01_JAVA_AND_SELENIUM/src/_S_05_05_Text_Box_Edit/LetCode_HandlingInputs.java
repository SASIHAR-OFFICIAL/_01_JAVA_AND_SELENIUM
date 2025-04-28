package _S_05_05_Text_Box_Edit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LetCode_HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		//WebDriver d = new FirefoxDriver();
		ChromeDriver d = new ChromeDriver();
		d.get("https://letcode.in/edit");
		// Enter your full Name
		WebElement fullNameelement = d.findElement(By.id("fullName"));
		fullNameelement.sendKeys("Koushik Chatterjee");
	

		// Append a text and press keyboard tab
		WebElement Key_send =d.findElement(By.id("join"));
		Key_send.sendKeys(" person", Keys.TAB);
		
		// What is inside the text box
		String myValue = d.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);

		// Clear the text
		d.findElement(By.id("clearMe")).clear();

		// Confirm edit field is disabled
		boolean isEdit = d.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);

		// Confirm text is readonly
		WebElement isReadOnly = d.findElement(By.id("dontwrite"));
		
		String attribute = isReadOnly.getAttribute("readonly");
		System.out.println(attribute);
		

	}

}
