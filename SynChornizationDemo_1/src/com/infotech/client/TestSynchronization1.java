package com.infotech.client;

public class TestSynchronization1 
{
public static void main(String[] args) {
	Table obj = new Table();
	MyThread1 m1 = new MyThread1(obj);
	MyThread2 m2 = new MyThread2(obj);
	m1.start();
	m2.start();
}
}
