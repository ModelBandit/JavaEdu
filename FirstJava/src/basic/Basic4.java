package basic;

import java.util.Scanner;
import java.util.Random;;

public class Basic4 {
	public static void printArr() {
		int[] nums = { 5, 4, 3, 2, 1 };
		for (int i = 0; i < nums.length; ++i) {
			System.out.printf("a[%d] = %d\n", i, nums[i]);
		}
	}

	public static void inputCalcu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("사람 수는 몇명:");
		int arrCount = scanner.nextInt();

		int[] Scores = new int[arrCount];

		System.out.println("점수를 입력하세요.");
		for (int i = 0; i < arrCount; ++i) {
			Scores[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int score : Scores) {
			sum += score;
		}
		System.out.printf("합계는 %d점입니다.\n", sum);
		System.out.printf("평균은 %.1f점입니다.\n", (float) sum / (float) arrCount);

		int max = 0;
		int min = Scores[0];
		for (int i = 0; i < Scores.length; ++i) {
			if (max < Scores[i])
				max = Scores[i];
			if (min > Scores[i])
				min = Scores[i];
		}
		System.out.printf("최고점은 %d입니다.\n", max);
		System.out.printf("최저점은 %d입니다.\n", min);

		scanner.close();
	}

	public static void printRandomNumbers() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("인덱스 수:");
		int arrCount = scanner.nextInt();
		int[] nums = new int[arrCount];
		
		Random rand = new Random();
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = rand.nextInt(10) + 1;
			System.out.printf("a[%d] = %d\n", i, nums[i]);
		}

		scanner.close();
	}

	public static void comeThree() {
		Scanner scanner = new Scanner(System.in);

		int[][] students = new int[3][2];
		System.out.println("3명의 영어, 수학 점수를 입력하세요.");
		for (int i = 0; i < students.length; ++i) {
			System.out.printf("%d번\t",i+1);
			
			System.out.printf("영어:");
			students[i][0] = scanner.nextInt();
			
			System.out.printf("\t수학");
			students[i][1] = scanner.nextInt();
		}

		System.out.printf("No.\t영어\t수학\t평균\n");
		for (int i = 0; i < students.length; ++i) {
			System.out.printf("%d\t", i + 1);
			for (int j = 0; j < students[i].length; ++j) {
				System.out.printf("%d\t", students[i][j]);
			}
			System.out.printf("%.1f\n", (float) (students[i][0] + students[i][1]) / 2f);
		}

		float sumEng = 0;
		float sumMath = 0;
		for (int j = 0; j < students.length; ++j) {
			sumEng += students[j][0];
			sumMath += students[j][1];
		}
		System.out.printf("평균\t%.1f\t%.1f", sumEng / 3f, sumMath / 3f);
		
		scanner.close();
	}
}
