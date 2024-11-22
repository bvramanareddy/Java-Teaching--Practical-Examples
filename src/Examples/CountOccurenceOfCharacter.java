package Examples;

public class CountOccurenceOfCharacter {

	public static void main(String[] args) {

		String string= "my name is ramana reddy";
		int lengthOfCharacter=  string.length() - string.replaceAll("a", "").length(); 
		System.out.println(lengthOfCharacter);
		
	}

}
