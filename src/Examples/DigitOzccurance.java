package Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitOzccurance {

	public static void main(String[] args) {

		int[] nums= {1,2,3,4,5,6,1,2,3};
	  HashMap<Integer, Integer> result=  digitsOccurance(nums);
	  System.out.println(result);
		
	}

	
	public static HashMap<Integer, Integer> digitsOccurance(int[] nums) {
		
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		//int count=1;
		for (int i = 0; i < nums.length; i++) {
			
				map.put(nums[i], map.getOrDefault(nums[i],0)+1);
			}			
		return map;
	}
}
	

