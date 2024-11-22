package beforeLeetCodeEgs;

import java.util.Arrays;

public class CopyArrayInReverseInNewArray {
static int k=0;
	public static void main(String[] args) {

		int[] nums= {1,2,3,4,5};
		int[] numsNew= new int[nums.length]; 
		
		for(int i=nums.length-1; i>=0; i--)
		{
			numsNew[i]=nums[k];
			k++;
		}
		System.out.println(Arrays.toString(nums));

		System.out.println(Arrays.toString(numsNew));
	}

}
