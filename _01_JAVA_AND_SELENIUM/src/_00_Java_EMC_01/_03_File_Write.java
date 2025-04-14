package _00_Java_EMC_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _03_File_Write {

	public static void main(String[] args) throws IOException {

		try {
			FileWriter FileWriter_object = new FileWriter("FeD.txt",true);
			FileWriter_object.write("abcd");
			FileWriter_object.append("HI");
			FileWriter_object.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}}
