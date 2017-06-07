package org.itstep;


public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		FirstThread ft = new FirstThread();
		SecondThread st = new SecondThread();
		ThirdThread tt = new ThirdThread();
//		tt.setDaemon(true);
		ft.start();
		st.start();
		tt.start();
		
	}

}
