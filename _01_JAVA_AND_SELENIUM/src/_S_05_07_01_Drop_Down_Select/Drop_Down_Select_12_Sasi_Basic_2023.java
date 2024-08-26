package _S_05_07_01_Drop_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_12_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.manage().window().maximize();
d.get("https://stores.reliancesmartbazaar.com");
WebElement Advanced_Search=d.findElement(By.xpath("//*[text()='Advanced Search']"));
Advanced_Search.click();
WebElement State = d.findElement(By.xpath("//*[@id=\"OutletState\"]"));
State.click();

Select State_select= new Select(State);
State_select.selectByValue("tamil-nadu");

WebElement City =d.findElement(By.xpath("//*[@id=\"OutletCity\"]"));
City.click();

Select City_select = new Select(City);
City_select.selectByIndex(4);


WebElement Locality =d.findElement(By.xpath("//*[@id=\"OutletLocality\"]"));
Locality.click();

Select Locality_Select = new Select(Locality);
Locality_Select.selectByVisibleText("Ram Nagar");

//Thread.sleep(3000);

WebElement Search = d.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/div/div[2]/div[2]/form/ul/li[4]/button"));
Search.click();


WebElement Search_Result = d.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/div/div/ul"));
String Result_Text = Search_Result.getText();
System.out.println("Result_Text = "+Result_Text);

	}

}
