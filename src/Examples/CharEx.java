package Examples;



public class CharEx {

	public static void main(String[] args) {
		
		String string= "12@34$67#$3243$ ";
		
		System.out.println(string.replaceAll("\\d", ""));
		String string2= string.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(string2);
		
		if ((string2.length()>=9)) {
		System.out.println("The Entered chacters are more than 9 length");
		}
		else {
			System.out.println(string2);
		}
		
	}

}
