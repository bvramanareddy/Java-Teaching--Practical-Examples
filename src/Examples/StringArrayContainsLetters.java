package Examples;

import java.util.ArrayList;
import java.util.List;

public class StringArrayContainsLetters {

	public static List<String> findTheLettersHavingString(String[] words, String letters) {
		
		List<String> list= new ArrayList<String>();
		
		for (String string : words) {
			if(containsAllChar(string, letters))
			{
				list.add(string);
			}
			
			
		}
		return list;
	
		
		
	}
	
	public static boolean containsAllChar(String str, String letter)
	{
	char[] array= 	letter.toCharArray();
		for(Character ch: array)
		{
			if(!str.contains(String.valueOf(ch)))
			
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {

		String[] nameStrings= {"raman", "arun", "ram", "ajay", "sanju"};
		String letter= "aj";
	List<String> result= 	findTheLettersHavingString(nameStrings, letter);
		System.out.println(result);
	}

}
