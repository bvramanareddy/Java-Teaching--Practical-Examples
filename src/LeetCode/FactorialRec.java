package LeetCode;

public class FactorialRec {
	
	private static int factorial(int num) {
		
		if(num>=1)
		return num*factorial(num-1);
		else return 1;
		
	}

	public static void main(String[] args) {

		int num=3;
		System.out.println(factorial(num));
		
	}

}
