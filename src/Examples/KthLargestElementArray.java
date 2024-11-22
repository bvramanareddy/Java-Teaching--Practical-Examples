package Examples;

import java.util.Arrays;

public class KthLargestElementArray {
	
	public static int findKthLargest(int[] nums, int k)
	{
		Arrays.sort(nums);
		return nums[nums.length-k];
	}

	public static void main(String[] args) {
		int[] array= {1,3,2,6,9,7};
		int k=1;
	System.out.println(findKthLargest(array, k));
		

		
	}

}
