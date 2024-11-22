package Examples;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String nameString= "HellloMy name is ramana11222212";
	char[] aray= 	nameString.toCharArray();
	int n= aray.length;
	removeDuplicateCharactersFromString(aray, n);

	}
	
	public static char[] removeDuplicateCharactersFromString(char []s, int n) {
		String string= ""; 
		
		HashMap<Character, Integer> hsHashMap= new HashMap<Character, Integer>();
		for (int i = 0; i < s.length; i++) {
			if(!hsHashMap.containsKey(s[i])) {
				string+=s[i];
				hsHashMap.put(s[i], 1);
			}
		}
		return string.toCharArray();
	}

}
