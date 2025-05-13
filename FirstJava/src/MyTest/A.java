package MyTest;

public class A {
	
	public static void qsort(int[] nums, int left, int right) {
		if(left >= right){
			return;
		}
		
		int pivot = partition(nums, left, right);
		qsort(nums, left, pivot-1);
		qsort(nums, pivot+1, right);
	}
	static int partition(int[] nums, int left, int right) {
		
		int l = left;
		
		int pivot = nums[right];
		
		for(int i = left;i<right;++i) {
			if(nums[i] <= pivot) {
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				++left;
			}
		}

		int temp = nums[right];
		nums[right] = nums[left];
		nums[left] = temp;

		for(int i = l;i<right;++i) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		return left;
	}
	
	public static int[] sorted = null; 
	public static void mergeSort(int[] nums, int left, int right) {	
		if(left == right) {
			return;
		}
		int mid = (left + right)/2; 
		
		mergeSort(nums, left, mid);
		mergeSort(nums, mid+1, right);
		merge(nums, left, mid, right);
		for(int i = left;i<=right;++i) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	private static void merge(int[] nums, int left, int mid, int right) {
		int i = left; // 시작점
		int j = mid+1; // 중간시작점
		
		int k = left; // 이동할 배열 시작점
		while(i <= mid && j <= right) {
			if(nums[j] > nums[i]) {
				sorted[k++] = nums[i++];
			}
			else {
				sorted[k++] = nums[j++];
			}
		}
		
		int l = 0;
		if(i > mid) {
			for(l = j;l<=right;++l, ++k) {
				sorted[k] = nums[l];
			}
		}
		
		else if( j > right) {
			for(l = i; l <= mid;++l, ++k) {
				sorted[k] = nums[l];
			}
		}
		
		for(l = left;l<=right;++l) {
			nums[l] = sorted[l];
		}
	}
}
