package Weekend;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {

		final int MaxSize = 10;
		WeekendList wList = new WeekendList();

		wList.insert(5);
		wList.insert(10);
		wList.insert(15);
		
		wList.delete(5);
		wList.delete(10);
		wList.delete(15);

		wList.print();
	}
}
