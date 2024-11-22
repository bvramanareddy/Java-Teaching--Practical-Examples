package Examples;

import java.util.Arrays;

public class KthSmallestElementArray {

	public static void main(String[] args) {

		int[] nums= {1,34,23,67,88,45,90,4};
		int kthSmallest= 2;
		
		Arrays.sort(nums);
		System.out.println(nums[kthSmallest-1]); 
		
	}

}
