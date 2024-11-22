package beforeLeetCodeEgs;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicatesFromSortedArray(int[] nums) {
		
		int i=0; 
		
		for(int j=1; j<nums.length; j++)
		{
			if(nums[j]!=nums[i])
			{
			i++;
			nums[i]=nums[j];
			}
			
		}
		
		return i+1;
		
		
	}
	
	
	public  static int[] removeDupsFromSortedArray(int[] nums) {
		
		int i=0; 
		
		for (int j = 1; j < nums.length; j++) {
			if(nums[j]!=nums[i])
			{
				i++;
				nums[i]= nums[j];
				
			}
	
		}
		return new int[nums.length];
		
	}
	public static void main(String[] args) {

		int[] nums= {1,2,4,6,7,8,8};
	
	
	
	int[] results= removeDupsFromSortedArray(nums);

	System.out.println(Arrays.toString(results));
}
}
