package Examples;

public class ExperimentRevString {

	public static void main(String[] args) {

		String nameString= "Boda";
		String reverseString= "";
		char ch = 0;
		
		for (int i = 0; i < nameString.length(); i++) {
			ch= nameString.charAt(i);
			// this below is for reverse storing so we added ch first then revString
			reverseString= ch+reverseString;
			// This below is for straight storing 
			//reverseString= reverseString+ch;
		}
	//	reverseString= ch +reverseString;
		System.out.println(reverseString);
	}

}
