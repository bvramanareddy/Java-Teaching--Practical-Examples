package beforeLeetCodeEgs;

import java.util.Arrays;

public class CopyArrayToOtherArray {
	
	public static void copyArrays(int[] nums1) {
		
		int[] nums2= new int[nums1.length];
		
		for (int i = 0; i < nums1.length; i++) {
			nums2[i]=nums1[i];
		}
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
	}

	public static void main(String[] args) {
		
		int[] nums1= {1,2,4,5,6};
		int[] nums2= new int[nums1.length];
		
copyArrays(nums1);
		
	}

}
