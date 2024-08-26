package _S_05_12_Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_06_Sasi_Basic_Home {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
		
		F.switchTo().frame(6);
		Thread.sleep(1500);
		/*WebElement Left_frame = F.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		String Left_Frame_Text =Left_frame.getText();
		System.out.println("Left_Frame_Text = "+Left_Frame_Text);
		
		/*List<WebElement> Total_Frame = F.findElements(By.xpath("frame"));
		int Total_Frame_size =Total_Frame.size();
		System.out.println("Total_Frame_size = "+Total_Frame_size);*/
		
	}

}
