package _S_05_17_Download_File;

import java.io.File;

public class Only_check {

	public static void main(String[] args) {
		
		File File_Obj = new File("D:\\sele");
		File[] listFiles = File_Obj.listFiles();
		
		for (File file : listFiles) {
			if(file.getName().equals("JavaFileWrite2.txt")) {
				System.out.println("File is present");
			}
		}
	

	}

}
