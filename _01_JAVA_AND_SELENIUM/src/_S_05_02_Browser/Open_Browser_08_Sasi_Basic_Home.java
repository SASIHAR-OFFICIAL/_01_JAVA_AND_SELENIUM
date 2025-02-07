package _S_05_02_Browser;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_08_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.google.com");
		d.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Gandhipuram"+Keys.ENTER);

	}

}
