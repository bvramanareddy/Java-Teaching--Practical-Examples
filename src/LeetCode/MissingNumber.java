package LeetCode;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,5};
		System.out.println(missingNumber(nums));
		
	}
	
	public static int missingNumber(int[] nums) {
		
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		int n= nums.length+1; // Total count of numbers including the missing one
		int actualSum= (n*(n+1))/2;   // ((method we learned in school)
	int missingDigit= actualSum-sum;	
	return missingDigit;
	}


}
