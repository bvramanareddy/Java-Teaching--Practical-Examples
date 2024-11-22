package Examples;

public class RemoveCharfromAccntNumber {

	public static void main(String[] args) {
		String accNumberString= "1356f4-";
		
		String cleanedAccountNumberString=  cleanAccountNumber(accNumberString);
		System.out.println(cleanedAccountNumberString);
		

	}
	
	public static String cleanAccountNumber(String str)
	{
		String cleanedString= str.replaceAll("[^\\d]", "");
		if(cleanedString.length()<=9)
		{
			return cleanedString;
		}
		else {
			return "Error: Account number is more than 9 digits";
		}
	}

}
