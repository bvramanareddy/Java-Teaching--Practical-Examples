package LeetCode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		String a="ram";
		String b="amr";
		
		char[] aArr= a.toLowerCase().toCharArray();
		char[] bArr= b.toLowerCase().toCharArray();
	Arrays.sort(aArr);
		Arrays.sort(bArr);
		
		if(Arrays.equals(aArr, bArr))
		{
			System.out.println("Anagrams"); 
		}
		else {
			System.out.println("Not Anagrams");
		}
	 
	
	
	}

}
