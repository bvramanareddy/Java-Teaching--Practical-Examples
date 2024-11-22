package beforeLeetCodeEgs;

import java.util.Arrays;

public class PrintElementsInReverseArray {
	static int k = 0;

	public static int[] reverseTheArray(int[] nums) {

		for (int i = nums.length - 1; i >= 0; i--) {

			System.out.print(nums[i] + " ");

		}

		return nums;

	}

	public static int[] reverseArrayAndStoreInAnotherArray(int[] nums) {
		int[] nums2 = new int[nums.length];

		for (int i = nums.length - 1; i >= 0; i--) {
			nums2[i] = nums[k];
			k++;
		}
		return nums2;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		reverseTheArray(nums);

		System.out.println("\n");
		System.out.println(Arrays.toString(reverseArrayAndStoreInAnotherArray(nums)));

	}

}
