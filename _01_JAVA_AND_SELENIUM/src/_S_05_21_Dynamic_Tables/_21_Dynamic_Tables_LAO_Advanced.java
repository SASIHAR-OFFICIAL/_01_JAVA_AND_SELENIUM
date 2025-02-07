package _S_05_21_Dynamic_Tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_Dynamic_Tables_LAO_Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/table.html");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/table.html");
		// To find Number of COLOUMNS
		List<WebElement> coloumns =d.findElements(By.tagName("th"));
		int coloumnsCount =coloumns.size();
		System.out.println("Total No. of Coloumns : " + coloumnsCount);

		// To find Number of ROWS
		List<WebElement> rows =d.findElements(By.tagName("tr"));
		int rowsCount =rows.size();
		System.out.println("Total No. of Rows : " + rowsCount);

		// To find Percentage after "Learn to interact with Elements"
		WebElement getPercentage = d.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String Percentage=getPercentage.getText();
		System.out.println("Percentage : " + Percentage);

		// to find MINIMUM PERCENTAGE
		List<WebElement> allPercentage = d.findElements(By.xpath("//td[2]"));

		List <Integer> listOfPercentage= new ArrayList<Integer>();
		for (WebElement inputTakenFromtd2 : allPercentage) {
			String individualValue = inputTakenFromtd2.getText().replace("%", "");
			listOfPercentage.add(Integer.parseInt(individualValue));
		} 
		System.out.println("List of Percentages : "+listOfPercentage);

		int leastValue = Collections.min(listOfPercentage);
		System.out.println("Least Value  : " +leastValue);

		String leastValueString = Integer.toString(leastValue)+"%";
		String pathForTick="//td[normalize-space()="+"\""+ leastValueString + "%\""+"]"+"//following::td[1]";
		System.out.println(pathForTick);
		//td[normalize-space()="30%"]//following::td[1]
		
		WebElement checkMark = d.findElement(By.xpath("//td[normalize-space()=\"30%\"]//following::td[1]"));
		Thread.sleep(2000);
		checkMark.click();
		
		//d.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div[1]/table/tbody/tr[4]/td[3]/input")).click();
		
	}


}
