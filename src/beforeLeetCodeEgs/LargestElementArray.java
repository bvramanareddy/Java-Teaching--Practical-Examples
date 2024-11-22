package beforeLeetCodeEgs;

import java.util.Arrays;

public class LargestElementArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 5, 6, 4, 9 };
		Arrays.sort(nums);
		int largestElement = nums[nums.length-1]; 
		System.out.println(largestElement);
		int smallestElement= nums[2-1];  //Second Smallest
		System.out.println(smallestElement);
	}

}
