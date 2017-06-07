package org.itstep;

public class FirstThread extends Thread {
	@Override
	public void run() {
		startCount();
	}

	public synchronized void startCount() {
		int count = 0;
		for (int i = 0; i <= 2000; i++) {
			count++;
			if (i % 500 == 0) {
				if(this.isAlive()){
					try {
						this.wait(1500);
						System.out.println("ft" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
