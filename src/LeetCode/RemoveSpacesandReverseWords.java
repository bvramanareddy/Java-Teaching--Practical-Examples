package LeetCode;

public class RemoveSpacesandReverseWords {

	
	public static String reverseWords(String string) {
		
		
	String[] words=	string.split(" +");
		StringBuilder sBuilder= new StringBuilder(string);
		
		for(int i=words.length-1; i>=0; i--){
			sBuilder.append(words[i]);
			sBuilder.append(" ");
		}
		return sBuilder.toString().trim();
		
		
	}
	public static void main(String[] args) {
		
	String str	="   hi my name is ram    reddy";
			System.out.println(reverseWords(str));

	}

}
