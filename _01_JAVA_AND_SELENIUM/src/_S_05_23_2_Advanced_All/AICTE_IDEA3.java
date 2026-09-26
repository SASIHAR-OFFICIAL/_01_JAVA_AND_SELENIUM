package _S_05_23_2_Advanced_All;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class AICTE_IDEA3 {

	public static void main(String[] args) throws InterruptedException, IOException {


		 // ==============================
        // 1. OPEN EXCEL FILE
        // ==============================

		 String excelPath = "D:\\KCE\\HOD\\HARIDASS\\ALUMNI 24 AUG 26\\Alumni Details of ECE 2026 Passed Out 189 Students.xlsx";

	        FileInputStream fis = new FileInputStream(excelPath);
	        Workbook workbook = new XSSFWorkbook(fis);

	        Sheet sheet = workbook.getSheetAt(0);


	       //====================================================================================================================
			WebDriver d = new FirefoxDriver();
			d.manage().window().maximize();
			//Thread.sleep(30000);

			d.navigate().to("https://idealnet.aicte.gov.in/login");
			//***************TO LOGIN **********
			d.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("chairmankce@gmail.com");
			d.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Kce@2024");
			Thread.sleep(30000);
			d.findElement(By.xpath("/html/body/app-root/app-login/section/div[2]/div[2]/div/form/div[2]/button/span[2]")).click();

			//***************TO SELECT ALUMNI **********
			Thread.sleep(10000);
			d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer/div/app-sidenav/div/div[2]/app-vertical-menu/div[7]/a/span[2]/span")).click();
			d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer/div/app-sidenav/div/div[2]/app-vertical-menu/div[7]/div/app-vertical-menu/div[2]/a/span[2]/span")).click();
			Thread.sleep(10000);
			//d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer-content/app-user-details/div/mat-card[1]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")).click();
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

			// Click Participant Type drop down
			WebElement participantType = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//mat-select[@id='mat-select-0']")
							)
					);

			participantType.click();

			// Click Alumni option
			WebElement alumni = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//mat-option//span[normalize-space()='Alumni']")
							)
					);

			alumni.click();


			//***************Add Participants **********
			WebElement Add_Participants  = d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer-content/app-user-details/div/mat-card[1]/div[1]/button/span[2]"));
			Thread.sleep(10000);
			Add_Participants.click();
			//===============================================================
	        

	        // ==============================
	        // 3. READ 189 ROWS
	        // ==============================

	        for (int rowNum = 1; rowNum <= 83; rowNum++) {

	            Row row = sheet.getRow(rowNum);

	            // ==============================
	            // READ 8 COLUMNS
	            // ==============================

	            String col1 = getCellValue(row.getCell(0));
	            String col2 = getCellValue(row.getCell(1));
	            String col3 = getCellValue(row.getCell(2));
	            String col4 = getCellValue(row.getCell(3));
	            String col5 = getCellValue(row.getCell(4));
	            String col6 = getCellValue(row.getCell(5));
	            String col7 = getCellValue(row.getCell(6));
	          

	            // ==============================
	            // ENTER DATA INTO WEBSITE
	            // ==============================

	          
	            d.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(col1);
	                                 
	         


	       
	            d.findElement(By.xpath("//input[@placeholder='Enter Name of the Institute']")).sendKeys(col2);
	            
	            // ----------------------------------
	            // SELECT UG
	            // ---------------------------------- 
				Thread.sleep(10000);

	            WebElement Ug_Pg = d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/dialog-content-dialog/div/div[2]/form/div[1]/mat-form-field[3]/div[1]/div/div[1]/div[2]/label/mat-label"));

	            	Ug_Pg.click();
	            	
	            	WebElement ugOption = d.findElement(By.xpath(
	            		    "//mat-option[normalize-space()='UG']"
	            		));

	            		ugOption.click();
	            
	            
	            
	           
	            d.findElement(By.xpath("//input[@placeholder='Enter year_of_passing']")).sendKeys(col3);
	            
	    
	            d.findElement(By.xpath("//input[@placeholder='Enter Email id']")).sendKeys(col4);
	            
	        
	            d.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys(col5);
	            
	      
	            d.findElement(By.xpath("//input[@placeholder='Enter Course']")).sendKeys(col6);
	            
	        
	            d.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys(col7);
	            
	     
	            WebElement Calendar = d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/dialog-content-dialog/div/div[2]/form/div[1]/mat-form-field[9]/div[1]/div/div[4]/mat-datepicker-toggle/button/span[3]"));
	            Calendar.click();
	            Thread.sleep(1000);
	            WebElement Date = d.findElement(By.xpath("/html/body/div[4]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[2]/button/span[1]"));
	            Thread.sleep(5000);
	            Date.click();

	            // ==============================
	            // SUBMIT
	            // ==============================
	            Thread.sleep(1000);
	            WebElement Add_Button = d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/dialog-content-dialog/div/div[2]/form/div[2]/button/span[2]"));
	            Add_Button.click();
	         
	            System.out.println("Row " + rowNum + " entered successfully.");



	            Thread.sleep(2000);
	            d.navigate().to("https://idealnet.aicte.gov.in/institute");
	            Thread.sleep(1000);
	            d.navigate().refresh();
	            Thread.sleep(10000);
	            d.navigate().refresh();
	            Thread.sleep(10000);
				d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer/div/app-sidenav/div/div[2]/app-vertical-menu/div[7]/a/span[2]/span")).click();
				d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer/div/app-sidenav/div/div[2]/app-vertical-menu/div[7]/div/app-vertical-menu/div[2]/a/span[2]/span")).click();
				Thread.sleep(5000);
				//d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer-content/app-user-details/div/mat-card[1]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select/div/div[1]/span/span")).click();
				WebDriverWait wait1 = new WebDriverWait(d, Duration.ofSeconds(10));

				// Click Participant Type drop down
				WebElement participantType1 = wait.until(
						ExpectedConditions.elementToBeClickable(
								By.xpath("//mat-select[@id='mat-select-0']")
								)
						);

				participantType1.click();

				// Click Alumni option
				WebElement alumni1 = wait.until(
						ExpectedConditions.elementToBeClickable(
								By.xpath("//mat-option//span[normalize-space()='Alumni']")
								)
						);

				alumni1.click();


				//***************Add Participants **********
				WebElement Add_Participants2  = d.findElement(By.xpath("/html/body/app-root/app-institute/div/mat-drawer-container/mat-drawer-content/app-user-details/div/mat-card[1]/div[1]/button/span[2]"));
				Thread.sleep(1000);
				Add_Participants2.click();

	           
	        }

	        // ==============================
	        // CLOSE
	        // ==============================

	        workbook.close();
	        fis.close();

	        d.quit();
	    }

	    // =====================================
	    // CONVERT EXCEL CELL TO STRING
	    // =====================================

	    public static String getCellValue(Cell cell) {

	        if (cell == null) {
	            return "";
	        }

	        DataFormatter formatter = new DataFormatter();

	        return formatter.formatCellValue(cell);
	    }
	}