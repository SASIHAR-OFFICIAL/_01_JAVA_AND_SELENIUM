package _S_05_12_Frame;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_16_Sasi_09_April_25 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		//		List<WebElement> Total_Frames = d.findElements(By.tagName("frame"));
		//		int size = Total_Frames.size();
		//		System.out.println("Total_Frames ="+size);

		WebElement FrameTop = d.findElement(By.xpath("/html/frameset/frame[1]"));
		d.switchTo().frame(FrameTop);
		// Left
		//WebElement Frame_Left = d.findElement(By.xpath("/html/frameset/frame[1]"));
		d.switchTo().frame(0);
		WebElement Text_element_left = d.findElement(By.xpath("/html/body"));
		String Text_Left = Text_element_left.getText();
		System.out.println("Frame Left Text = "+Text_Left);
		d.switchTo().parentFrame();

		// Middle
		WebElement Frame_Mid = d.findElement(By.xpath("//frame[@src='/frame_middle']"));	
		d.switchTo().frame(Frame_Mid);
		WebElement Text_element_Middle = d.findElement(By.xpath("/html/body"));
		String Text_Middle = Text_element_Middle.getText();
		System.out.println("Frame Middle Text = "+Text_Middle);
		d.switchTo().parentFrame();



		//Right
		WebElement Frame_Right =d.findElement(By.xpath("//frame[@src='/frame_right']"));	
		d.switchTo().frame(Frame_Right);
		WebElement Text_element_Right = d.findElement(By.xpath("/html/body"));
		String Text_Right = Text_element_Right.getText();
		System.out.println("Frame Right Text = "+Text_Right);
		d.switchTo().defaultContent();
		
		//Bottom
		d.switchTo().frame(1);
		WebElement Bottom = d.findElement(By.xpath("/html/body"));
		String Text_Bottom = Bottom.getText();
		System.out.println("Frame Bottom Text = "+Text_Bottom);
		
d.switchTo().defaultContent();
	}
}
