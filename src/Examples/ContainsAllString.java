package Examples;

import java.util.ArrayList;
import java.util.List;

public class ContainsAllString {
	
	public static List<String> containsAllLetter(String[] words, String letters) {
		
		List<String> resultList= new ArrayList<String>();
	
		for(String word: words)
		{
			if(containsAllLetters(word, letters))
			{
				resultList.add(word);
			}
		}
		return resultList;
	}
	
	public static boolean containsAllLetters(String str, String letters) {
        for (char letter : letters.toCharArray()) {
            if (!str.contains(String.valueOf(letter))) {
                return false;  // Return false if any letter is missing
            }
        }
        return true;
    }

	public static void main(String[] args) {
		
		String[] inputStrings= {"ram", "abc", "acb" , "dog",  "ele"};
		String letter= "r";
	List<String> result=	containsAllLetter(inputStrings, letter);
		System.out.println(result);
		

	}

}
