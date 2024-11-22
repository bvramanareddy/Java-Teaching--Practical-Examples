package LeetCode;

import java.util.Arrays;
import java.util.HashMap;


public class TowDigitSumTarget {
	
	public static int[] sumOfTargetIndices(int[] nums, int target) {
		
	 HashMap<Integer, Integer> map= new HashMap<>();
	 
	 for (int i = 0; i < nums.length; i++) {
		
		 if(map.containsKey(target-nums[i]))
		 {
			 return new int[] {i, (target-nums[i]) };
 		 }
		 map.put(nums[i],i);
	}
		
		return nums; 
	}

	public static void main(String[] args) {
		
		int[] nums= {1,2,5,7,9};
		int target= 10;
	int[] result= sumOfTargetIndices(nums, target);
	Arrays.sort(result);
	System.out.println(Arrays.toString(result));

	}

}
