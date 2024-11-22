package Examples;

public class PolindromNumber {
	
	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;
		while (num != 0) {
		int digit = num % 10;
		reversedNumber = reversedNumber * 10 + digit;
		num = num/10;
		}
		return originalNumber == reversedNumber;
		}
		

	public static void main(String[] args) {

		int number= 123454321;
		System.out.println(isPalindrome(number));
	}
	

}
