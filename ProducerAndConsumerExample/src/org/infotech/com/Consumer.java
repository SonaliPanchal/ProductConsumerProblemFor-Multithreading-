package org.infotech.com;

import java.util.Queue;
import java.util.Random;

public class Consumer implements Runnable {
	private Queue<Integer> sharedQueue;
	
	
	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		while(true)
		{
			synchronized (sharedQueue) {
				while(sharedQueue.isEmpty())
				{
					try {
						System.out.println("Consumer is waiting to produce object by producer");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				int data = sharedQueue.poll();
				sharedQueue.add(data);
				System.out.println("Produced : :"+data);
				sharedQueue.notify();
				
			}
		}

	}

}
