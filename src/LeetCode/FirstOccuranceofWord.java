package LeetCode;

public class FirstOccuranceofWord {

	public static void main(String[] args) {

		String haystack= "sadbutsad";
		String needle= "sad";
		System.out.println(stringFirstOccurance(haystack, needle));
	}
	
	public static int stringFirstOccurance(String haystack, String needle) {
		
		return haystack.indexOf(needle);
	}

}
