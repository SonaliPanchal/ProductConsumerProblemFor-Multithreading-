package com.runnable.sonali;

public class test {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		Thread t1 = new Thread(m1, "T1");
		Thread t2 = new Thread(m2,"T2");
		t1.start();
		t2.start();
		
	}

}
