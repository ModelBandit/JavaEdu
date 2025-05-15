package basic;

public class Calculator {

	public static final float pi = 3.141592f;

	public static void main(String[] args) {

		int numA = Integer.parseInt(args[0]);
		int numB = Integer.parseInt(args[1]);
		float radis = Float.parseFloat(args[2]);

		add(numA, numB);
		dis(numA, numB);
		mul(numA, numB);
		div(numA, numB);

		System.out.println("원의 둘레: " + circleRound(radis));
	}

	public static void add(int numA, int numB) {
		System.out.printf("A + B = %d\n", numA + numB);
	}

	public static void dis(int numA, int numB) {
		System.out.printf("A - B = %d\n", numA - numB);
	}

	public static void mul(int numA, int numB) {
		System.out.printf("A * B = %d\n", numA * numB);
	}

	public static void div(int numA, int numB) {
		System.out.printf("A / B = %d\n", numA / numB);
	}

	public static float circleRound(float radis) {
		return (radis * pi) * 2;
	}
}
