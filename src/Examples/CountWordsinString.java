package Examples;

import java.util.HashMap;

public class CountWordsinString {
	
	public static void findCountofWords(String str) {
		
	String[] arr=  str.split(" ");
	
	HashMap<String, Integer> map= new HashMap<String, Integer>();
	
	for(String s: arr) {
		map.put(s, map.getOrDefault(s, 0)+1);
	}
	System.out.println(str +" " + map);
	}

	public static void main(String[] args) {

		
		String string=  "Hello I am am Learning Learning Java java java java progarmas";
		String[] words= string.split(" ");
		int count= 1;
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		 
		for (int i = 0; i < words.length; i++) {
			
		if(!hs.containsKey(words[i]))
		{
			hs.put(words[i], count);
		}
		else {
			hs.put(words[i], hs.get(words[i])+1);
		}
		
		}
		
		for (String x : hs.keySet()) {
			System.out.println("The count of each words in the given string is :"+x +": " + hs.get(x));
		}
		findCountofWords(string);
		
	}
	
	

}
