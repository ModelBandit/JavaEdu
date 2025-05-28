package myThread;

public class InfoClass {
	volatile int num;
	int sNum;
	
	public InfoClass() {
		num = 0;
	}
	
	public void reset() {
		num = 0;
		sNum = 0;
	}
	public void addNum() {
		num+=1;
	}
	public synchronized void syncAddNum() {
		sNum+=1;
	}
}
