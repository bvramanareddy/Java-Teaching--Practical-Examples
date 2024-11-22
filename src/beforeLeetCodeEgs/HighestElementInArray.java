package beforeLeetCodeEgs;

import java.util.Arrays;

public class HighestElementInArray {

	public static void main(String[] args) {

		int[] nums= {1,2,3,5,99,3,66,34};
		Arrays.sort(nums);
		int largest= nums[nums.length-1];
		System.out.println(largest);
		int smaller= nums[0];
		System.out.println(smaller);
	}

}
