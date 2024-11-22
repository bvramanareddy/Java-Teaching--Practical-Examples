package Eg2;

import java.util.Arrays;
import java.util.HashMap;

public class SumofTargetDigits {

	public static int[] findTheDigitsOfTagetSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { i, (target - nums[i]) };
			}
			map.put(nums[i], i);
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 1,3,4,5,6,8,9};
		int target = 9;

		int[] result= findTheDigitsOfTagetSum(nums, target);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	

	}

}
