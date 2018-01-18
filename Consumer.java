package com.producer.consumer;

class Consumer extends Thread {
	Producer prod;

	Consumer(Producer obj) {
		prod = obj;
	}

	public void run() {
		/*
		 * consumer will wait till producer is producing.
		 */
		synchronized (this.prod) {

			System.out.println("Consumer waiting for production to get over.");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		/* production is over, consumer will start consuming. */
		int productSize = this.prod.sharedQueue.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("Consumed : " + this.prod.sharedQueue.remove(0) + " ");

	}

}