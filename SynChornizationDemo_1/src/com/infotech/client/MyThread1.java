package com.infotech.client;

public class MyThread1 extends Thread {
	Table t;
	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(5);
	}

}
