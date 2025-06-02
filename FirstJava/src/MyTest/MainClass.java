package MyTest;

public class MainClass {

	public static void main(String[] args) {
		int[] arrNum = new int[20];
		for (int i = 0; i < arrNum.length; ++i) {
			arrNum[i] = i;
		}

		ArrClassNum[] arrClass = new ArrClassNum[10];
		for (int i = 0; i < arrClass.length; ++i) {
			arrClass[i] = new ArrClassNum();
			arrClass[i].num = 0;
		}
	}
}
