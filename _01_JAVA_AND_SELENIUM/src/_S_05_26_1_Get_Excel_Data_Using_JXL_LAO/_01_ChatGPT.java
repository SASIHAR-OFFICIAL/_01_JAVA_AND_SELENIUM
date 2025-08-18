package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class _01_ChatGPT {
    public static void main(String[] args) {
	try {
        // Load the Excel file
        File file = new File("C:\\WebDriver\\TESTING FILES\\ChatGPT.xls");
        Workbook workbook = Workbook.getWorkbook(file);

        // Get the first sheet
        Sheet sheet = workbook.getSheet(0);

        // Read rows and columns
        for (int row = 1; row < sheet.getRows(); row++) {
            String username = sheet.getCell(0, row).getContents();
            String password = sheet.getCell(1, row).getContents();

            System.out.println("Username: " + username + ", Password: " + password);

            // You can now use this data in Selenium, e.g., driver.findElement...
        }

        workbook.close();
    } catch (Exception e) {
        e.printStackTrace();
    }}}



