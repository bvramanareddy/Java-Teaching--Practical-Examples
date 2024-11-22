package beforeLeetCodeEgs;

import java.util.Arrays;

public class MoveZerosToLast {

	public static int[] moveZerosToLast(int[] nums) {
		int[] newArray = new int[nums.length];

		if (nums.length == 1) {
			return nums;
		}

		int count = 0;

		for (int i : nums) {
			if (i != 0) {

				newArray[count] = i;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 2, 0, 3, 4, 0, 6 };
		System.out.println("Given Arrat is " + Arrays.toString(nums));
		System.out.println("After Moving the zeros to end " + Arrays.toString(moveZerosToLast(nums)));

	}

}
