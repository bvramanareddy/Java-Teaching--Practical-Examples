package beforeLeetCodeEgs;

import java.util.Arrays;

public class CheckDigitPresentInArray {
	public static boolean checKnumPresence(int[] numbers, int target) {
		
		for(int num: numbers)
		{
			if(num==target)
			return true;
		}
		return false;
	}
	
	static int check_number= 15;

	public static void main(String[] args) {
int[] nums= {1,15,2,3,5};

for (int i = 0; i < nums.length; i++) {
	if (check_number==nums[i]) {
		System.out.println("Number is present at index:" + i);
		System.out.println(checKnumPresence(nums, 2));
		
	}
}
System.out.println(Arrays.toString(nums));
		 
	}

}
