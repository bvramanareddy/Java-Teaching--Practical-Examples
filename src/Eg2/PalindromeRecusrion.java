package Eg2;


public class PalindromeRecusrion {

	public static void main(String[] args) {
		String string = "nitin";
		boolean result = isPalindrome(string);
		System.out.println(string+ " is palidrome? " + result);
	}
	
	public static boolean isPalindrome(String str)
	{
		if(str==null)
		{
			return false;
		}
		if(str.length()<=1)
		{
			return true;
		}
		String firstString=  str.substring(0,1);
		String lastString=  str.substring(str.length()-1, str.length());
		if(!firstString.equals(lastString))
		{
			return false;
		}
		else {
			return isPalindrome(str.substring(1, str.length()-1));
		}
	}

}
