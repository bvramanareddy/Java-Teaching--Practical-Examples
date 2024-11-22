package LeetCode;

import java.util.Arrays;

public class SecondLargestArray {
	
	public static int secondLargestElement(int[] nums, int nLargest) {
		
		Arrays.sort(nums);
		return nums[nums.length-nLargest];

	}
	
	public static int secondSmallest(int[] nums, int nSmallest) {
		
		Arrays.sort(nums);
		return nums[nSmallest-1];
		
	}

	public static void main(String[] args) {
int[]  nums= {1,2,6,7,8,33};
int nLargest= 1;
int nSmallest=1;
int result=  secondLargestElement(nums, nLargest);
int smallestResult= secondSmallest(nums, nSmallest);

System.out.println("The Present Array is :"+ Arrays.toString(nums));
System.out.println("The nthLARGEST element from the array is :"+ result);
System.out.println("The nthSMALLEST element from the array is :"+ smallestResult);


	}

}
