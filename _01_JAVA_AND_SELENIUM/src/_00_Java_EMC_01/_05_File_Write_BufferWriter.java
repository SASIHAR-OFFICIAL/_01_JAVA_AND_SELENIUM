package _00_Java_EMC_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _05_File_Write_BufferWriter {

	public static void main(String[] args) throws IOException {
		FileWriter FileWriter_Obj = new FileWriter("D:\\sele\\JavaFileWrite2.txt");
		BufferedWriter BufferedWriter_obj = new BufferedWriter(FileWriter_Obj);
		
		BufferedWriter_obj.write("BufferedWriter_obj");
		BufferedWriter_obj.append(" BufferedWriter_obj2");
		BufferedWriter_obj.newLine();
		BufferedWriter_obj.write("BufferedWriter_ob3");
		BufferedWriter_obj.close();

	}

}
