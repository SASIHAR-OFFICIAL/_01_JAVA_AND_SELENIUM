package _00_Java_EMC_01;

import java.io.FileWriter;
import java.io.IOException;

public class _04_File_Write2 {

	public static void main(String[] args) throws IOException {

			FileWriter FileWriter_obj = new FileWriter("D:\\sele\\JavaFileWrite.xls");
			FileWriter_obj.write("File Write");
			FileWriter_obj.close();
			System.out.println("Sucess");
			}
}
