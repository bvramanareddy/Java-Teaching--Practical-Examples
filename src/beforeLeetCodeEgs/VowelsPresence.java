package beforeLeetCodeEgs;

public class VowelsPresence {

	
	public static boolean containsVowels(String str) {
		
		return 	 str.matches(".*[AEIOUaeiou].*");
		
	}
	
	public static boolean containsVowelsusingChars(String str) {
		
	if(str.contains('a'||'e'||'i'||'o'||'u'))
		return true;
	
	else {
		return false;
	}
	}
	public static void main(String[] args) {
		
		String nameString= "tyt";
		
		System.out.println(containsVowels(nameString));

	}

}
