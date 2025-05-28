package myThread;

public class MainClass {
/*boolean으로 스핀락을 걸어봤지만 잘 걸리지 않음. 확인후 다시 걸어볼 것*/
	public static void main(String[] args) {
		ALockThread.lockThread(1);
		ALockThread.lockThread(2);
		ALockThread.lockThread(4);
		ALockThread.lockThread(8);
		OnlyThreadClass.threadAdd(1);
		OnlyThreadClass.threadAdd(2);
		OnlyThreadClass.threadAdd(4);
		OnlyThreadClass.threadAdd(8);
		OnlyThreadClass.threadSlideAdd(1);
		OnlyThreadClass.threadSlideAdd(2);
		OnlyThreadClass.threadSlideAdd(4);
		OnlyThreadClass.threadSlideAdd(8);
	}

}
