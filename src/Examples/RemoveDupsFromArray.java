package Examples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupsFromArray {
	
	public static void removeDuplicatesFromArray(int[] nums) {
		
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		
		for (Integer num : nums) {
			
			if(!set.contains(num))
			{
				set.add(num);
			}
	
		}
		System.out.println(set);
	}
	
	public static void duplicateValuesInArray(int[] nums) {
		
	HashSet<Integer> set= new HashSet<Integer>();
	
	for (Integer num : nums) {
		if(!set.contains(num))
		{
			System.out.println("duplicate Elements are" + num);
			
		}
		System.out.println("Unique elements are"+ num);
		//System.out.println(set);
		
	}
	//System.out.println(set);

	}

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,4,5,6,6,7};
		removeDuplicatesFromArray(nums);
		duplicateValuesInArray(nums);

		
		
	}

}