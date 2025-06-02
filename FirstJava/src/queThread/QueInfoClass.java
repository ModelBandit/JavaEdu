package queThread;

import java.util.ArrayList;

public class QueInfoClass {
	ArrayList<UserThread> lThread;
	private int num;
	
	public QueInfoClass(){
		lThread = new ArrayList<UserThread>();
		num = 0;
	}
	
	public void addNum(UserThread t) {
		if(lThread.size() > 0) {
			lThread.add(t);
		}
		else {
			++num;
		}
	}
	
	
	public int getNum() {
		return num;
	}
}
