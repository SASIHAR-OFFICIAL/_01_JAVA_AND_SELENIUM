package _S_05_05_Text_Box_Edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edit_Text_Box_05_Sasi_24_June_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://letcode.in/edit");

		WebElement Name = d.findElement(By.xpath("//*[@id=\"fullName\"]"));
		Name.sendKeys("Pandi");
		Thread.sleep(500);
		WebElement Append = d.findElement(By.xpath("//*[@id=\"join\"]"));
		Append.sendKeys(" Chella Pandi");
		Thread.sleep(500);

		WebElement Find_Text = d.findElement(By.xpath("//*[@id=\"getMe\"]"));
		String Finded_Text = Find_Text.getAttribute("value");
		System.out.println("Finded_Text = "+Finded_Text);
		Thread.sleep(500);

		WebElement Box_Clear = d.findElement(By.xpath("//*[@id=\"clearMe\"]"));
		Box_Clear.clear();
		Thread.sleep(500);

		WebElement Find_Disable = d.findElement(By.xpath("//*[@id=\"noEdit\"]"));
		boolean enabled = Find_Disable.isEnabled();
		if (enabled=false) {
			System.out.println("Enabled or Disabled = Disabled");
		} else {
			System.out.println("Enabled or Disabled = Enabled ");
		}
		Thread.sleep(500);

		WebElement Read_Only_or_Not = d.findElement(By.xpath("//*[@id=\"dontwrite\"]"));
		String Attribute = Read_Only_or_Not.getAttribute("readonly");
		if (true) {
			System.out.println("Read_Only_or_Not = Read_Only");
		} else {
			System.out.println("Read_Only_or_Not = Writeable");
		}
				Thread.sleep(500);
	}}
