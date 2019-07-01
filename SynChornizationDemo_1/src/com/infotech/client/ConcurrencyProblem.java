package com.infotech.client;

public class ConcurrencyProblem implements Runnable {
	public static void main(String[] args) {

		int [] array = {0};
		final ConcurrencyProblem cp = new ConcurrencyProblem();
		Thread a = new Thread("A")
		{
			public void run()
			{
				for (int i = 0; i<5; i++) {
					System.out.println("i-->"+i);
					ConcurrencyProblem.increase();

				}
			}
		};

		Thread b = new Thread("B");
		{/*
			public void run()
			{
				for (int i = 0; i <10; i++) 
				{
					ConcurrencyProblem.decrease();
				}
			}
		*/}

	}

	private static void decrease() {
		// TODO Auto-generated method stub
		
	}

	protected static void increase() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
