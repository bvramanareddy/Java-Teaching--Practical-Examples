package beforeLeetCodeEgs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateElementsOfArray {

	public static void findDuplicatesOfArray(int[] nums) {

		
		HashSet<Integer> set= new HashSet<Integer>();
		
		for (int i : nums) {
			if(! set.add(i))
			{
				System.out.println("Duplicate elements is "+ i);
				//System.out.println("Unique elements is "+ i);

			}
			
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 4, 5, 5 };
		findDuplicatesOfArray(nums);

	}

}
