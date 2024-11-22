package LeetCode;

public class Polindrom {

	
	public static boolean isPalindrom(int number) {
		
		int copy=number; 
		int reverse=0; 
		
		if(number<0) return false;
		
		while (copy>number) {
			int digit= copy%10; 
			reverse= reverse*10+digit;
			copy= copy/10;
		}
		return reverse==number;
		
	}
	public static void main(String[] args) {

int number= 1234321;
System.out.println(isPalindrom(number));
	}

}
