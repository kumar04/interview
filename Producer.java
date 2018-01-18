package com.producer.consumer;

import java.util.ArrayList;

public class Producer extends Thread {

	ArrayList<Integer> sharedQueue;

	Producer() {
		sharedQueue = new ArrayList<Integer>();
	}

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) { // Producer will produce 10 products
				sharedQueue.add(i);
				System.out.println("Producer is still Producing, Produced : " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println("Production is over, consumer can consume.");
			this.notify(); // Production is over, notify consumer thread so that
							// consumer can consume.
		}
	}
}
