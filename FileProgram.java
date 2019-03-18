package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("d:\\Examples\\source.txt");
		FileOutputStream fos = new FileOutputStream("d:\\Examples\\target.txt");
		CopyDataThread c=new CopyDataThread(fis,fos);
		c.start();
	}

}
