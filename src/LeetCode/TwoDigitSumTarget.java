package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoDigitSumTarget {

	public static int[] twoDigitSumTarget(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i])) {	
			return new int[] { i, map.get(target - nums[i]) };
			}
			map.put(nums[i], i);
		}
		return nums; // or We can also write return new int[0]; both works

	}

	public static void main(String[] args) {

		int[] array = { 9, 2, 1, 4 };
		int taget = 5;

		int[] result = twoDigitSumTarget(array, taget);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	}

}
