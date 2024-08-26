package _S_04_Parthasarathy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertion2_Parthasarthy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String expected []= {"Arun","Kavi"};
		String actual []= {"Arun","Kavi"};

		Assert.assertEquals(expected,actual);
		System.out.println("Both expected and Actual are same");*/
				WebDriver d;
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.softwaretestingmaterial.com");
		d.manage().window().maximize();
	
		 //Actual title is "Software Testing Material - A site for Software Testers" 
		 //We took title as "Software Testing Material" to make the test fail
		 String Title = "software Testing Material";
		 String GetTitle = d.getTitle();
		 System.out.println("Assertion starts here...");
		 Assert.assertEquals(Title, GetTitle);
		 System.out.println("As Per Expected");
		 

	}

}
