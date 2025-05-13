package MyTest;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		final int MAXSIZE = 10;
		Random rand = new Random();
		
		int[] nums = new int[MAXSIZE];
		for(int i=0;i<nums.length;++i)
			nums[i] = rand.nextInt(MAXSIZE);

		System.out.print("Before: ");
		for(int i = 0;i<nums.length;++i) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		qsort(nums, 0, MAXSIZE-1);
		
		System.out.print("After: ");
		for(int num: nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	static void qsort(int[] nums, int left, int right) {
		A.qsort(nums, left, right);
	}
	
	static void mergeSort(int[] nums, int left, int right) {
		A.mergeSort(nums, left, right);
	}
}
