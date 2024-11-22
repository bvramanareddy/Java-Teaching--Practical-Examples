package LeetCode;

public class FactorialRecursive {
	
	public static int factorial(int n) {
		if(n<=1)
		{
			return 1; 
		}
		else {
			return n*factorial(n-1);
		}
		
	}

	public static void main(String[] args) {

		int num=3;
		System.out.println(factorial(num));
	}

}
