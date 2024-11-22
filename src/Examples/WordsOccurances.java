package Examples;

import java.util.HashMap;

public class WordsOccurances {

	 
	public static void wordOccurances(String s) {
		
		HashMap<String, Integer> map=  new HashMap<String, Integer>();
		
		String[] words= s.split(" ");
		
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		map.forEach((k, v)-> System.out.println(k+ " "+ v));
	}
	public static void main(String[] args) {
		
		String nameString= "Hello My name is Ramana Ramana Ramana Reddy Reddy";
		wordOccurances(nameString);

	}

}
