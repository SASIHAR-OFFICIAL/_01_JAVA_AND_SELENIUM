package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_11_Gmail_login_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver FBrow = new FirefoxDriver();
FBrow.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7WBNMEadBDGtTZvAQvnaVv_pksopc9Y6tceJC5eW1YUpQdo4715xj2llbCW2S6BwAjzf-4UQg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S199853%3A1692614365313172");

FBrow.findElement(By.id("identifierId")).sendKeys("S.sasihar"+Keys.ENTER);

	}

}
