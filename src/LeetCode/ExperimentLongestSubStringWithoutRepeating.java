package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ExperimentLongestSubStringWithoutRepeating {

	
	public static int expLongestSubStringWithoutRepeatingChars(String s) {
		int maxLength= 0; 
		int start= 0;
		int end=0; 
		
		List<Character> list= new ArrayList<Character>();
		
	
		
		while(end<s.length())
		{
			if(!list.contains(s.charAt(end)))
			{
				list.add(s.charAt(end));
				end++;
				maxLength= Math.max(maxLength, list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
			
		
		return maxLength;
		
	}
	public static void main(String[] args) {

		String nameString= "ramnana";
		System.out.println(expLongestSubStringWithoutRepeatingChars(nameString));
	}

}
