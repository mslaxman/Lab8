package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDataThread extends Thread {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	
	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		super();
		this.fis = fis;
		this.fos = fos;
	}
	@Override
	public void run() {
		int a=0;
		int count=0;
		try {
			while((a=fis.read())!=-1) {
				char cur=(char)a;
				//System.out.println(cur);
				fos.write((byte)cur);
				fos.flush();
				count++;
				if(count==10) {
					System.out.println("10 characters are copied");
					count=0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	

