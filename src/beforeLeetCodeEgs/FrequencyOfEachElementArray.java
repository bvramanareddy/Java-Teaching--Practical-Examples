package beforeLeetCodeEgs;

import java.util.HashMap;

public class FrequencyOfEachElementArray {

	public static void frequencyOfEachElementInArray(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// [1,2,3,4,5]

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);

		}
		map.forEach((K, V) -> System.out.println("Digits " + K + "is repeated: " + V + "times"));
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 5 };
		frequencyOfEachElementInArray(nums);

	}
}
