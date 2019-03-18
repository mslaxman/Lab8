package com;

import java.util.Date;

public class TimeRefresher implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			Date d=new Date();
			System.out.println(d);
			try {
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		TimeRefresher tr=new TimeRefresher();
		Thread t=new Thread(tr);
		t.start();
	}

}
