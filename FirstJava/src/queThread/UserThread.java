package queThread;

public class UserThread extends Thread {
	QueInfoClass info;
	int iterCount;
	
	public void setIterCount(int i) {
		iterCount = i;
	}
	public void setInfo(QueInfoClass info) {
		this.info = info;
	}
	@Override
	public void run() {
		for(int i=0;i<iterCount;++i) {
			//info.addNum();
		}
	}
}
