package _00_Java_EMC_01;

import java.io.FileWriter;

public class File_Write {

	public static void main(String[] args) {
	
		try {
FileWriter FileWriter_object = new FileWriter("FeD.txt",true);
FileWriter_object.write("abcd");
FileWriter_object.append("HI");
FileWriter_object.close();
	}catch (Exception e) {
		// TODO: handle exception
	}

}}
