package Examples;

public class isPalindromRecursion {

	public static void main(String[] args) {
		
			String string= "ramar";
			boolean result = isPalindrome(string);
			System.out.println(string+ " is a palindrome :" +result);

	}
	
	public static  boolean isPalindrome(String str)
	{
		if(str.length()<=1) 
		{
			return true;
		}
		String firString= str.substring(0,1);
		String lastString = str.substring(str.length()-1, str.length());
		if(!firString.equals(lastString))
		{
			return false;
		}
		else {
			return isPalindrome(str.substring(1, str.length()-1));
		}
	}

}
