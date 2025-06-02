package myThread;

public class SyncInfoClass {
	int sNum;

	public SyncInfoClass() {
		sNum = 0;
	}
	public void reset() {
		sNum = 0;
	}
	public synchronized void syncAddNum() {
		sNum+=1;
		notify();
	}
}
