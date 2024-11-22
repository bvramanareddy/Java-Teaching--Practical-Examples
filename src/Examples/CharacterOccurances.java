package Examples;

import java.util.HashMap;

public class CharacterOccurances {

	
	public  static void characterOccurances(String string) {
		
	char[] array= 	string.toCharArray();
	
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	
	for (char c : array) {
		map.put(c, map.getOrDefault(c, 0)+1);
		
	}
 map.forEach((k, v)-> System.out.println(k+ " " + v));
	
	}
	public static void main(String[] args) {

		String name="AbcAbcAbCCD";
		characterOccurances(name);
	}

}
