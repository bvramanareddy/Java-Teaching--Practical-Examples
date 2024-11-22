package Examples;

import java.util.regex.Pattern;

public class EmailValidator {
	
	public static boolean emailValidator(String email) {

		String emailRegEx= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,}$";
		Pattern pattern = Pattern.compile(emailRegEx);
		return pattern.matcher(email).matches();
		
		
	}

	public static void main(String[] args) {
		System.out.println(emailValidator("343242ad..sf.com"));

		
	
	}

}
