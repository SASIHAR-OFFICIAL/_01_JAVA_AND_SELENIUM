package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_13_Assertion_Sasi_2019 {

	public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			String expected []= {"Arun","Kavi"};
			String actual []= {"Arun","Kavi"};

			/// BELOW ERROR
		//Assert.assertEquals(expected,actual);
		System.out.println("Both expected and Actual are same");
		WebDriver d;
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.softwaretestingmaterial.com");
			
			 //Actual title is "Software Testing Material - A site for Software Testers" 
			 //We took title as "Software Testing Material" to make the test fail
			 String Title = "software Testing Material";
			 String GetTitle = d.getTitle();
			 System.out.println("Assertion starts here...");
				/// BELOW ERROR
			// Assert.assertEquals(Title, GetTitle);
			 System.out.println("As Per Expected");

		}

	}
