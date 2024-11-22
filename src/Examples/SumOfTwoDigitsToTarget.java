package Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoDigitsToTarget {
	
	public static int[] sumOfTwoDigitsToTarget(int[] nums, int target) {
	 int[] result = new int[2];
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]+ nums[j]==target) {
					result[0]= i;
					result[1]= j;
				}
			 	
		}
	}
	return	result;
	}

	public  static int[] sumOftwoIndicesUsingHashMap(int[] nums, int target) {
		int[] result= new int[2];
		HashMap<Integer, Integer> hashMap= new HashMap<>();
			for(int i=0; i<nums.length; i++)
			{
				if(hashMap.containsKey(nums[i]))
				{
					int index= hashMap.get(nums[i]);
					result[0]= index;
					result[1]= i;
					break;
				}
					else {
				hashMap.put(target-nums[i]	, i);
					}
			}
			
			
return result;
		
		
	}
	

	public static int[] sumOfTwoInDiffWay(int[] nums, int target) {
		
		HashMap<Integer, Integer> hashMap= new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int req_num= target-nums[i];
			if(hashMap.containsKey(req_num))
			{
				int[] arr= {hashMap.get(nums[i]),i};
				return arr;
			}
			hashMap.put(nums[i], i);
		}
		return null;
		
	} 
	
	public static void main(String[] args) {
		int[] numbers= {1,2,6,7,8,3,9,6};
		int targetNum= 7;
		System.out.println(Arrays.toString(sumOfTwoDigitsToTarget(numbers, targetNum)));
		
		int[] secondSetNums= {1,2,3,4,5};
		int tagetTwo= 9;
		System.out.println(Arrays.toString(sumOftwoIndicesUsingHashMap(secondSetNums, tagetTwo)));
		
		//System.out.println(Arrays.toString(sumOfTwoInDiffWay(numbers, targetNum)));

		
	}

}
