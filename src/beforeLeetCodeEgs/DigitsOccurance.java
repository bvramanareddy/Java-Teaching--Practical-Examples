package beforeLeetCodeEgs;

import java.util.Arrays;
import java.util.HashMap;

public class DigitsOccurance {
	
	
	public static void digitOccurances(int[] arr) {
		
	
	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	
	for(int i: arr)
	{
		map.put(i, map.getOrDefault(i, 0)+1);
	
	}
	System.out.println(Arrays.toString(arr)+ " : " + map);
	
	}

	public static void main(String[] args) {
		
		int[] nums= {1,1,2,2,2,3,4,5,5,5,5,6,6,6};
		digitOccurances(nums);

	}

}
