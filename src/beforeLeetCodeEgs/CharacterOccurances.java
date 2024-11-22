package beforeLeetCodeEgs;

import java.util.HashMap;

public class CharacterOccurances {
	
	
	public static void characterOccurances(String str) {
		
		HashMap<Character, Integer> charMap= new HashMap<>();
		
	char[]	strChar = str.toCharArray();
		
	for(char c:strChar)
	{
	
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
	
	}
	charMap.forEach((K,V)->System.out.println(K+ " Key repeated " + V + " times"));
	System.out.println(str+ " : " + charMap);
		
	}

	public static void main(String[] args) {

		String name= "ramanaReddy";
		characterOccurances(name);
	}

}
