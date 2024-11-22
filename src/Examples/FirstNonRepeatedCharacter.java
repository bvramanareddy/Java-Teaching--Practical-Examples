package Examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {			
	String str= "zabcaabcwerty";
	
	LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		int count=1; 
		
		for (int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), count);
			}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		} 
			for (Entry<Character, Integer> key: map.entrySet()) {
				if(key.getValue()==1)
				{
					System.out.println("The first Non repeated character is: " + key.getKey());
					break;
				}
			}
		}
		
	}
