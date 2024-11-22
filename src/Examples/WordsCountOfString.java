package Examples;

public class WordsCountOfString {

	public static void main(String[] args) {
		
		String string="Hello My Name is Ramana Reddy";
		String  string3="";
		
		String[] arrayString= string.split(" ");
		int lenght= arrayString.length;
		System.out.println("Words count is :" +lenght);
		int chLength= string.length();
		System.out.println("Characters Lenght is :" +chLength);
}

}