package Eg2;

import java.util.Scanner;

public class Largest3Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);

System.out.println("Enter the First Digit:");
int digit1= scanner.nextInt();

System.out.println("Enter the First Digit:");
int digit2= scanner.nextInt();

System.out.println("Enter the First Digit:");
int digit3= scanner.nextInt();

int largest= digit1; 
if (digit2>largest) {
	largest= digit2;
	
}if (digit3>largest) {
	largest= digit3;
} 
System.out.println("Largest number is: " +largest);
}
}

