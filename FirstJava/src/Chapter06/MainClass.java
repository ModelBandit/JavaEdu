package Chapter06;

import List.MyList;
import java.util.Random;

public class MainClass {

	static final int maxSize = 10;

	public static void main(String[] args) {
		//첫 번째
		// MyList를 생성
		MyList list = new MyList();
	

		// 모든 내용물 출력
		list.printAll();
		
		Random rand = new Random();
		for(int asd = 0;asd< 5;++asd) {
			//두 번째
			for(int i = 0; i < maxSize; ++i) {
				list.append(rand.nextInt(maxSize));
			}
			for(int i = 0; i < maxSize; ++i) {
				list.delete(rand.nextInt(maxSize));
			}

		}
		list.printAll();
		
		
	}
}
