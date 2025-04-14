package _S_05_17_Download_File;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class File_Open {

	public static void main(String[] args) throws IOException {
		File File_Obj = new File("D:\\sele\\JavaFileWrite2.txt");

		 Desktop desktop_obj = Desktop.getDesktop();  
		 desktop_obj.open(File_Obj);  
	}

}
