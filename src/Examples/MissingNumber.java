package Examples;

public class MissingNumber {

	public static void main(String[] args) {

		int[] array= {1,3,4,5,6,7,8,9,10};
		int sum=0; 
		int sumofTenDigits= 0;
		
		for (int i = 0; i < array.length; i++) {
			sum =sum+  array[i];
			
		}
		
		for(int j=1; j<=10; j++)
		{
			sumofTenDigits= sumofTenDigits + j;
		}
		System.out.println(sumofTenDigits-sum);
		System.out.println("The missing number is: "+ (sumofTenDigits-sum));
	}

}
