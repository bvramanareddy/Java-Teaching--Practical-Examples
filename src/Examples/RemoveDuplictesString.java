package Examples;



public class RemoveDuplictesString {

	public static String removeDuplivatesFromString(String string) {
		
		StringBuilder sBuilder= new StringBuilder();
		int n= string.length();
		
		
		for (int i = 0; i < n; i++) {
			int j;
			for ( j = 0; j < i; j++) {
				if(string.charAt(i)==string.charAt(j))
				break;
				
			}
			if(j==i)
			sBuilder= sBuilder.append(string.charAt(i));
			
			
		}
		return sBuilder.toString();
		
		
	}
	
	public static void main(String[] args) {
		String str= "ramanazzzzzyyyyy1111";
		System.out.println(removeDuplivatesFromString(str));
	}
}
