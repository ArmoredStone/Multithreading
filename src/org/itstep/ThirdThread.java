package org.itstep;

import java.io.Serializable;
import java.util.logging.Logger;

public class ThirdThread extends Thread {
	
	@Override
	public void run() {
		startCount();
	}

	public synchronized void startCount() {
		Logger log = Logger.getLogger(MainThread.class.getName());
		int count = 0;
		for (int i = 0; i <= 2000; i++) {
			count++;
			if (i % 500 == 0) {
				if (this.isAlive()) {
					try {
						this.wait(1500);
						System.out.println("tt" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("tt" + count);
		log.info("Done");

	}
}
