package Examples;

import java.util.HashMap;

public class RemoveDupsString {
	
	
	public static String removeDuplicateCharacterFromString(char[] s, int n) {
		
		HashMap<Character, Integer> hashMap=  new HashMap<>();
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<n; i++)
		{
		if(!hashMap.containsKey(s[i]))
		{
			sb.append(s[i]);
			hashMap.put(s[i], 1);
		}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String nameString= "Ramanas reddy BBBBBOOOOODDDDAAA";
		char[] array= nameString.toCharArray();
		int n= nameString.length();
String result=		removeDuplicateCharacterFromString(array, n);
System.out.println(result);
		
				}

}
