package myThread;

public class OnlyThreadClass {

	// 꼼수로 num만큼 추가 메모리를 할당해서 마지막에 합산하는 함수
	public static void threadSlideAdd(int num) {
		System.out.println(num + " - 쓰레드 작업");
		Thread[] threads = new Thread[num];
		InfoClass[] infos = new InfoClass[num];

		for (int i = 0; i < num; ++i) {
			final int index = i;
			infos[index] = new InfoClass();
			threads[index] = new Thread() {
				public void run() {
					for (int j = 0; j < 100000000 / num; ++j)
						infos[index].addNum();
				}
			};
		}
		
		long start = System.currentTimeMillis();
		for (Thread t : threads) {
			t.start();
		}

		int sum = 0;
		for (int i = 0; i < num; ++i) {
			try {
				threads[i].join();
				sum += infos[i].num;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis() - start;
		System.out.println(end + "ms");
		System.out.println(sum);
		System.out.println(num + " - 쓰레드 작업 종료");
	}

	// synchronized 키워드로 동기화한 함수를 사용
	public static void threadAdd(int num) {
		System.out.println(num + " - 쓰레드 작업");
		Thread[] threads = new Thread[num];
		SyncInfoClass info = new SyncInfoClass();

		for (int i = 0; i < threads.length; ++i) {
			threads[i] = new Thread() {
				public void run() {
					for (int i = 0; i < 100000000 / num; ++i)
						info.syncAddNum();
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
		System.out.println(info.sNum);
		System.out.println(num + " - 쓰레드 작업 종료");
	}

}
