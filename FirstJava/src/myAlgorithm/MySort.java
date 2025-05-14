package myAlgorithm;

import java.util.Scanner;

public class MySort {
	
	public static void bubbleSort(int[] arr) {
		System.out.print("\nInput Data: ");
		for(int i = 0;i<arr.length;++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0;i<arr.length;++i) {
			for(int j = i; j < arr.length;++j) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(i+1 + "차 정렬: ");
			for(int j = 0 ; j<arr.length;++j) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void selectionSort() {
		Scanner scanner = new Scanner(System.in);

		int[] nums = new int[1];

		System.out.println();
		System.out.print("Input Data: ");
		String s = scanner.nextLine();
		System.out.println();

		String copyS = new String();
		int inputCount = 0;
		for (int i = 0; i < s.length(); ++i) {
			char c = s.toCharArray()[i];
			if (c == ' ') {
				int[] other = new int[inputCount + 1];
				for (int k = 0; k < nums.length; ++k) {
					other[k] = nums[k];
				}
				nums = other;
				nums[inputCount++] = Integer.parseInt(copyS);
				copyS = new String();
			} else
				copyS += c;
		}

		for (int i = 0; i < nums.length; ++i) {
			int minIndex = i;
			for (int j = i; j < nums.length; ++j) {
				if (nums[minIndex] > nums[j])
					minIndex = j;
			}

			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;

			System.out.printf("Sorted Data %d 단계: ", i + 1);
			for (int j = 0; j < nums.length; ++j) {
				System.out.printf("%d ", nums[j]);
			}
			System.out.println();
		}

		scanner.close();
	}
}
