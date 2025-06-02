package myThread;

public class InfoClass {
	volatile int num;
	
	public InfoClass() {
		num = 0;
	}
	
	public void reset() {
		num = 0;
	}
	public void addNum() {
		num+=1;
	}
}
