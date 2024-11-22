package LeetCode;

public class Factorial {
	
	public static int factorialOfNumber(int num) {
		
		int result=1;
		
		for(int i=1; i<=num; i++)
		{
			result= result*i; 
		}
		 return result;
	}

	public static void main(String[] args) {

		int n=3;
		System.out.println(factorialOfNumber(n));
	}

}
