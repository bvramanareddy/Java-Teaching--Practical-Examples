package Examples;

import java.util.HashMap;


public class FindDuplicateChacters {

	public static void main(String[] args) {
		String strin=  "RamaRna";
		char[] arr=  strin.toCharArray();
		int count =1; 
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for (char c : map.keySet()) {
			if(map.get(c)>1)
			{
				System.out.println("The Character " +c + " is : " +map.get(c) );

			}
		}
	}

}
