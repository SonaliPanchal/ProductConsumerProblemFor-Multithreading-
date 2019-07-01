package com.infotech.client;

public class MyThread2 extends Thread{

	Table t;
	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t =t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
