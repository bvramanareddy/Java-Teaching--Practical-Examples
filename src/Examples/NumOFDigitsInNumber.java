package Examples;

import java.util.Scanner;

public class NumOFDigitsInNumber {
	
	public static int countNumberOfDigitsinGivenNumber(int number) {
		
		//99int count=0;
		if(number<0) {
			number= Math.abs(number);
	}
		if(number==0)
		{
			return 1;
			
		}
		int count=0;
		while (number>0) {
			number= number/10;   //Removes Last digits 
			count++;			// Counter increments until number >0 condition failes
			
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number= scanner.nextInt();
		
		System.out.println(countNumberOfDigitsinGivenNumber(number));
		
	}

}
