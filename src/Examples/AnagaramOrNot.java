package Examples;

import java.util.Arrays;

public class AnagaramOrNot {

	public static void main(String[] args) {

		String a = "stop";
		String b = "tops4";

		char[] arrA = a.toCharArray();
		char[] arrB = b.toCharArray();
		Arrays.sort(arrA);
		Arrays.sort(arrB);

		if (Arrays.equals(arrA, arrB)) {
			System.out.println("Given String are Anagaram");
		} else {
			System.out.println("givem String are not Anagram");
		}
	}


}
