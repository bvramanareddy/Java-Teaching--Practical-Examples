package Examples;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSumofTwoIndices {

	public static int[] sumofTwoIndicesTarget(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] ans = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				ans[0] = map.get(target - numbers[i]);
				ans[1] = i;
				return ans;
			}
			map.put(numbers[i], i);

		}
		return ans;

	}

	public static void main(String[] args) {

		int[] numbers = { 4, 1, 3 };
		int target = 5;
 //	sumofTwoIndicesTarget(numbers, target);
  System.out.println(Arrays.toString(sumofTwoIndicesTarget(numbers, target)));
  //Arrays.toString(sumofTwoIndicesTarget(numbers, target));
	}

}
