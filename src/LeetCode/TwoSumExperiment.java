package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumExperiment {
	
	public static  int[] experimentForTwoSumIndices(int[] nums, int target) {
		
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++)
		{
			map.put(nums[i], i);
			if(map.containsKey(target-nums[i]))
			{
				return new int[] {i, map.get(target-nums[i])};
			}
		}
		
		return nums;
		
	}

	public static void main(String[] args) {

		int[] nums= {3,4,5,6,7};
		int target= 11; 
	 int[] result= 	experimentForTwoSumIndices(nums, target);
	 System.out.println(Arrays.toString(result));
	}

}
