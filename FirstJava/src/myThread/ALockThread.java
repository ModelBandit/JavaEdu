package myThread;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic으로 int값만 동기화 시킨 함수
public class ALockThread {
	public static void lockThread(int num) {
		System.out.println(num + " - 쓰레드 작업");
		Thread[] threads = new Thread[num];
		AtomicInteger info = new AtomicInteger(0);

		for (int i = 0; i < threads.length; ++i) {
			threads[i] = new Thread() {
				public void run() {
					for (int i = 0; i < 100000000 / num; ++i)
						info.incrementAndGet();
				}
			};
		}

		long start = System.currentTimeMillis();
		for (Thread t : threads) {
			t.start();
		}

		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis() - start;
		System.out.println(end + "ms");
		System.out.println(info.get());
		System.out.println(num + " - 쓰레드 작업 종료");
	}
}
