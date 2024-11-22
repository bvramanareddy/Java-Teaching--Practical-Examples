package LeetCode;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] nums= {0,1,1,3,0,6};
	int[] result= 	moveZerosToEnd(nums);
	System.out.println(Arrays.toString(result));


	}
	
	public static int[] moveZerosToEnd(int[] nums) {
		
		int count= 0; 
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]!=0)
			{
				//nums[count++]= nums[i]; (this is also works) just reducing the line length by adding the increment in here
				nums[count]= nums[i];
				count++;
				//count++;
			}
		}
		while(count<nums.length)
		{
			nums[count++]=0; 
		}
		return nums;
	}

}
