package com.corejava.sonali;

public class Test 
{
	public static void main(String[] args) {


		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		//if Thread start a Thread twice it will give us illegalThreadState Exception.
	}
}
