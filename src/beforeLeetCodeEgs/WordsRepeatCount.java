package beforeLeetCodeEgs;

import java.util.HashMap;import java.util.Map;

public class WordsRepeatCount {
	
	public static HashMap<String, Integer> testToFindRepeatedWordsCount(String s) {
		
		
		HashMap<String, Integer> map=  new HashMap<String, Integer>();
		
		String[] words= s.split(" ");
		for(String word: words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		return map;
		
	}
	
	public static void printOnlyRepeatedWords(String s) {
		
		String[] wordStrings= s.split(" ");
		
		HashMap<String, Integer> hashMap= new HashMap<String, Integer>();
		
		for(String word:wordStrings)
		{
			hashMap.put(word, hashMap.getOrDefault(word, 0)+1);
		}
		
		System.out.println("Repeated Words Printing ");
		for(Map.Entry<String, Integer> entry: hashMap.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ": " + entry.getValue());
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String s= "this is a test, test to find the repeated words in this sentence test is test";
		System.out.println(testToFindRepeatedWordsCount(s));
		printOnlyRepeatedWords(s);
	}

}
