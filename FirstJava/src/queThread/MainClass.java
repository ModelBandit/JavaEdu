package queThread;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=2; i<9;i*=2) {
			System.out.println(i + " thread---------------------------");
			UserThread[] t = new UserThread[i];
			QueInfoClass info = new QueInfoClass();
			
			for(int j = 0; j < i; ++j) {
				t[j] = new UserThread();
				t[j].setInfo(info);	
				t[j].setIterCount(100000000/i);
			}

			long start = System.currentTimeMillis();
			for(int j = 0; j<i;++j) {
				t[j].start();
			}

			for(int j = 0; j<i;++j) {
				t[j].join();
			}

			System.out.println("num: "+ info.getNum());
			long end = System.currentTimeMillis() - start;
			System.out.println(end + "ms");
			System.out.println("------------------------------------");
		}
	}

}
