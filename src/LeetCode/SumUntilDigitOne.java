package LeetCode;

public class SumUntilDigitOne {
	
	public  static int sumOfDigitsUntilOneDigit(int num) {
		
		if(num==0||num<=9) 
		{
			return num;
		}
		return (num%9==0)?9:num%9;
		
	}

	public static void main(String[] args) {

		int num= 38;
		System.out.println(sumOfDigitsUntilOneDigit(num));
	}

}
