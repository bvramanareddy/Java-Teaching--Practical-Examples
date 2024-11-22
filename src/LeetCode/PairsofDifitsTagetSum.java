package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class PairsofDifitsTagetSum {
	
public static int[] pairOfdigitstoTagetSum(int[] nums, int target) {
	
	int[] result= new int[2];
		for (int i = 0; i < nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target)
				{
				result[0]=nums[i];
				result[1]=nums[j];
				return result;
				}
				}
				
			}
	return 	new int[] {-1,-1};
		
		}

public static int[] usingHashMap(int[] nums, int target) {
	
	int[] result= new int[2];
	HashMap<Integer, Integer> map= new HashMap<>();
	

	
	for (int i = 0; i < nums.length; i++) {
		
		// Here we already have one element at index 1, we clevery iterate for target-nums[i]= result;
		
		int expected= target-nums[i];
		
		if(map.containsKey(expected))
		{
			result[0]= nums[i];
			result[1]= expected;
			return result;
		}
		
		map.put(nums[i], i);
		
	} return new int[] {-1,-1};
			
}

	
	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,5,10};
		int target= 11;
		int[] result=  pairOfdigitstoTagetSum(nums, target);
		System.out.println(Arrays.toString(result));
	int[]	result2= usingHashMap(nums, target);
		System.out.println(Arrays.toString(result));

	}
}
