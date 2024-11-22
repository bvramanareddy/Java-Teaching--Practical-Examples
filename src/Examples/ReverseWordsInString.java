package Examples;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String nameString = "Ramana Reddy BODA is my name";
		String[] splitString = nameString.split(" ");
		String revString = "";

		for (int i = 0; i < splitString.length; i++) {
			revString = " " + splitString[i] + revString;
		}

		System.out.println(revString);
	}
}
