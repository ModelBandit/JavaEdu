package myThread;

import java.util.concurrent.Semaphore;

public class SemaphoreInfo extends InfoClass {
	private Semaphore s;
	public void setSema(Semaphore s) {
		this.s = s;
	}
	
	@Override
	public void addNum() {
		try {
			s.acquire();
			++num;
			s.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
