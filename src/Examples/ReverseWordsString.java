package Examples;



public class ReverseWordsString {

	public static void main(String[] args) {

		String string=  "My name is Ramana";
		String[] wordStrings=  string.split(" ");
		String reversedWords= "";
		
		// We simply reversed the array and appending space to show space after extracted reversed words
		//if space is not concatenated then without spacing all words appear
		
		for (int i =wordStrings.length-1; i>=0 ; i--) {
			reversedWords= reversedWords+ wordStrings[i]+ " ";
			
		}
		System.out.println(reversedWords);
		}
	}

