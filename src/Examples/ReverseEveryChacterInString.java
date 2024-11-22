package Examples;

public class ReverseEveryChacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String string=  "My name is Ramana";
		String[] words= string.split(" "); 
		String result= "";
		
		for (String word : words) {
			String revString= "";
			
		int j= word.length()-1;
		while (j>=0) {
			char ch= word.charAt(j);
			
			revString= revString+ch;
			j--;
			
		}
		result = result +revString+ " ";


		}
				System.out.println(result);
	}

}
