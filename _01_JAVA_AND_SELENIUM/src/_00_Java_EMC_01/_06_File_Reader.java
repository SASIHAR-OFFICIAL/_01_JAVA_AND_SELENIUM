package _00_Java_EMC_01;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;

public class _06_File_Reader {

	public static void main(String[] args) {
		try {
			FileReader FileReader_obj = new FileReader("D:\\sele\\JavaFileWrite2.txt");
			int FileReader_obj_int = FileReader_obj.read();
			System.out.print((char)FileReader_obj_int);
			int FileReader_obj_int1 = FileReader_obj.read();
			System.out.print((char)FileReader_obj_int1);
			System.out.println("-----------------------------");
			BufferedReader BufferedReader_Obj = new BufferedReader(FileReader_obj);
			String line = BufferedReader_Obj.readLine();
			System.out.println(line);
			String line2 = BufferedReader_Obj.readLine();
			System.out.println(line2);
			
	
			

		} catch (Exception e) {
			// TODO: handle exception
		}	}}
