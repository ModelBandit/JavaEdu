package myThread;

import java.util.concurrent.Semaphore;

public class MainClass {
/*boolean으로 스핀락을 걸어봤지만 잘 걸리지 않음. 확인후 다시 걸어볼 것*/
	public static void main(String[] args) {
		sThread(1);
		sThread(2);
		sThread(4);
		sThread(8);
		
		
//		ALockThread.lockThread(1);
//		ALockThread.lockThread(2);
//		ALockThread.lockThread(4);
//		ALockThread.lockThread(8);
//		OnlyThreadClass.threadAdd(1);
//		OnlyThreadClass.threadAdd(2);
//		OnlyThreadClass.threadAdd(4);
//		OnlyThreadClass.threadAdd(8);
//		OnlyThreadClass.threadSlideAdd(1);
//		OnlyThreadClass.threadSlideAdd(2);
//		OnlyThreadClass.threadSlideAdd(4);
//		OnlyThreadClass.threadSlideAdd(8);
	}

	public static void sThread(int count) {
		SemaphoreInfo info = new SemaphoreInfo();
		Semaphore s = new Semaphore(1, true);
		info.setSema(s);
				
		System.out.println(count + " 쓰레드 작업");
		Thread[] t = new Thread[count];
		for(int i = 0;i<count;++i) {
			t[i] = new Thread() {
				@Override
				public void run() {
					for(int i=0;i<1000000/count;++i) {
						info.addNum();	
					}
				}
			};
			
		}

		long start = System.currentTimeMillis();		
		for(int i = 0;i<count;++i) {
			t[i].start();
		}
		
		for(int i=0;i<count;++i) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis() - start;
		System.out.println(end + "ms");
		System.out.println(count + " - 쓰레드 작업 종료");
		System.out.println(info.num);
	}
}
