package _S_05_27_DataDriven_JXL_TestNG_EXCEL;

import jxl.Workbook;
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class _02_ChatGPT {

	public static String[][] getExcelData(String filePath, String sheetName) {
        String[][] data = null;

        try {
            // Load workbook
            Workbook workbook = Workbook.getWorkbook(new File("C:\\WebDriver\\TESTING FILES\\HRM Login.xls"));

            // Get sheet by name
            Sheet sheet = workbook.getSheet(sheetName);

            int rows = sheet.getRows();
            int cols = sheet.getColumns();

            // Initialize data array (excluding header if needed)
            data = new String[rows - 1][cols];

            for (int i = 1; i < rows; i++) { // start from 1 if skipping headers
                for (int j = 0; j < cols; j++) {
                    Cell cell = sheet.getCell(j, i);
                    data[i - 1][j] = cell.getContents();
                }
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static void main(String[] args) {
        String filePath = "C:\\WebDriver\\TESTING FILES\\HRM Login.xls";
        String sheetName = "Sheet1";

        String[][] testData = getExcelData(filePath, sheetName);

        // Print data to verify
        for (String[] row : testData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}