package Examples;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintIndividuals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string= "ABC123#$#$@232Avc#@";
		System.out.println(string.replaceAll("\\d", "")); 
		//System.out.println((string.replaceAll("[^A-Za-z]", string)));
		
		Pattern p = Pattern.compile("[a-z]+|\\d+");
		Matcher m = p.matcher("123abc345def");
		ArrayList<String> allMatches = new ArrayList<>();
		while (m.find()) {
		    allMatches.add(m.group());
		    
		}

	}

}
