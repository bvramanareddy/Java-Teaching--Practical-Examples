package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitOzccurance {

	public static void main(String[] args) {

		int[] nums= {1,2,3,4,5,6,1,2,3};
		digitsOccurance(nums);
	}

	
	public static void digitsOccurance(int[] nums) {
		
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		//int count=1;
		for (int i = 0; i < nums.length; i++) {
			
				map.put(nums[i], map.getOrDefault(nums[i],0)+1);
			}			
	map.forEach((k,v)-> System.out.println("The digit :"+ k + "Was appeared in times of:" + v));
	}
}
	

