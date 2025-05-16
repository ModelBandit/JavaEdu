package basic;

import java.util.Scanner;
import java.util.Random;

public class Basic2 {
	public static void FBasic1(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값:");
		
		int num = scanner.nextInt();
		
		if(num < 0)
			num = -num;
		
		System.out.printf("절대값은: %d입니다", num);
		
		scanner.close();
	}
	
	public static void FBasic2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("변수 A:");
		int numA = scanner.nextInt();
		
		System.out.println("변수 B:");
		int numB = scanner.nextInt();
		
		if(numA % numB == 0)
			System.out.println("B는 A의 약수입니다.");
		else
			System.out.println("B는 A의 약수가 아닙니다.");
		
		scanner.close();
	}
	
	public static void FBasic3() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값:");
		int num = scanner.nextInt();
		
		if(num < 0){
			System.out.println("이 값은 양수가 아닌 값을 입력했네요.");
			scanner.close();
			return;
		}

		System.out.println("이 값은 3으로 나누어집이다.");
		int div = num%3;
		
		if(div == 1)
			System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
		else
			System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		
		scanner.close();
		
	}
	
	public static void FBasic4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 a");
		int numA = scanner.nextInt();
		
		System.out.println("정수 b");
		int numB = scanner.nextInt();
		
		String s = (numA - numB > 10) ? "두 값의 차이는 10이상입니다" : "두 값의 차이는 9이하 입니다.";
		System.out.println(s);
		
		scanner.close();
	}
	
	public static void FBasic5() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수a:");
		int numA = scanner.nextInt();
		
		System.out.println("정수b:");
		int numB = scanner.nextInt();
		
		if(numA < numB) {
			int temp = numB;
			numB = numA;
			numA = temp;
			System.out.println("a >= b 가 되도록 정렬했습니다");
		}
		
		System.out.printf("변수 a는 %d입니다.\n", numA);
		System.out.printf("변수 b는 %d입니다.\n", numB);
		
		scanner.close();
	}
	
	public static void FBasic6() {
		Random rand = new Random();
		int test = rand.nextInt(3);
		
		System.out.println("컴퓨터가 낸 것은:");
		switch(test) {
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
		}
	}
	
	public static void FBasic7() {
		
	}
}
