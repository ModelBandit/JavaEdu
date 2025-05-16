package basic;

import java.util.Scanner;

public class Basic1 {

	public void Basic_1() {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.printf("%s이 입력되었습니다.", s);

		scanner.close();
	}

	public void Basic_2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수값:");

		int originNum = 100;
		int num = scanner.nextInt();

		System.out.printf("%d을 더한 값은 %d입니다.\n", originNum, num + originNum);
		System.out.printf("%d을 뺀 값은 %d입니다.", originNum, num - originNum);

		scanner.close();
	}

	public void Basic_3() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수값:");

		int num = scanner.nextInt();

		System.out.printf("마지막 자릿수를 제외한 값은 %d입니다\n", num / 10);
		System.out.printf("마지막 자리수는 %d입니다", num % 10);

		scanner.close();
	}

	public void Basic_4() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값:");

		float x = scanner.nextFloat();

		System.out.println("y값:");

		float y = scanner.nextFloat();

		System.out.printf("합계는 %.2f입니다.\n", x + y);
		System.out.printf("평균은 %.2f입니다.", (x + y) * 0.5);
		
		scanner.close();
	}
	
	public void Basic_5() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		String name = scanner.nextLine();
		
		System.out.println("나이를 입력하세요:");
		int age = scanner.nextInt();
		
		System.out.printf("%s의 나이는 %d입니다.\n", name, age);
		scanner.close();
	}
}
