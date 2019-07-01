package com.runnable.sonali;

public class MyThread implements Runnable {//This is the better option for creating Thread becaue here we ca extend multiple class

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName()+"   i---->"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


