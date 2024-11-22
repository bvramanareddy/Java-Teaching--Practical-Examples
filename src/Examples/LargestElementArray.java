package Examples;

import java.util.Arrays;

public class LargestElementArray {

	public static void main(String[] args) {

		int[] nums= {99,3,4,23,67,2,40};
		int nthLargest= 5;
		
		Arrays.sort(nums);
		System.out.println(nums.length);
	int largest= 	nums[nums.length-nthLargest];
	System.out.println(largest);
	}

}
