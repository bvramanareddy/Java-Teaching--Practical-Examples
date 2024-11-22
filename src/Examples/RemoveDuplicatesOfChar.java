package Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Gatherer.Integrator;

public class RemoveDuplicatesOfChar {



	 private static char[] removeDuplicates(char []s, int n)
	{
		 Map<Character, Integer> hsMap = new HashMap<>();
	
	String str= "";
	
	for(int i=0; i<n; i++)
	{
	if(hsMap.containsKey(s[i]))
	{
		str+= s[i];
		hsMap.put(s[i], 1);
	}
	}
	return str.toCharArray();
}
	 
		public static void main(String[] args) {
			
			char s[]= "geeksforgeekssssredy".toCharArray();
			int n= s.length;
			// TODO Auto-generated method stub
			System.out.println(removeDuplicates(s, n));

		}
}
