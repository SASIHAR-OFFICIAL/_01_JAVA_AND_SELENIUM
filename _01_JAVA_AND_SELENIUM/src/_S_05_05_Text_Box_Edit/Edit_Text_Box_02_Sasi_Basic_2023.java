package _S_05_05_Text_Box_Edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edit_Text_Box_02_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.manage().window().maximize();
		Thread.sleep(2500);

		F.get("https://www.leafground.com/input.xhtml");
		Thread.sleep(2500);

		F.findElement(By.name("j_idt88:name")).sendKeys("Coimbatore Smart City");
		Thread.sleep(2500);

		F.findElement(By.name("j_idt88:j_idt91")).clear();
		boolean STATUS = F.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		System.out.println(STATUS);
		Thread.sleep(2500);

		F.findElement(By.name("j_idt88:j_idt91")).sendKeys(" Silk People Gandhipuram");
		Thread.sleep(2500);

		F.findElement(By.name("j_idt88:j_idt95")).clear();
		Thread.sleep(2500);

		String data = F.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(data);
		}

}
