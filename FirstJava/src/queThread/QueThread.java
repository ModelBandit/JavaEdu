package queThread;

import java.util.ArrayList;

public class QueThread extends Thread{
	
	public QueThread(){
	}
	public void AddList(UserThread t) {
		lThread.add(t);
	}
	
	@Override
	public void run() {
		for(int i = 0;i<lThread.size();++i) {
			lThread.get(i).start();
		}
		
		for(int i = 0;i<lThread.size();++i) {
			try {
				lThread.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
