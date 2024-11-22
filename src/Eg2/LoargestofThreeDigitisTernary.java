package Eg2;



public class LoargestofThreeDigitisTernary {

	public static void main(String[] args) {

		int a=5;
		int b=2;
		int c=9;
		
		int max= (a>b&&a>c)? a: (b>c?b:c);
		System.out.println(max);
			}

}
