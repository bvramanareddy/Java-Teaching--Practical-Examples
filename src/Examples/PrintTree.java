package Examples;

import java.util.Map;
import java.util.TreeMap;

public class PrintTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> treeMap= new TreeMap<Integer, String>();
		treeMap.put(1, "Ramana");
		treeMap.put(3, "Reddy");
		treeMap.put(2, "Sanjeev");
		treeMap.put(4, "Raj");
		treeMap.put(10, "Mahesh");
		treeMap.put(6, "Naren");
		
		System.out.println("Printing the values in TreeMap");
		
		for(Map.Entry<Integer, String> entry:treeMap.entrySet())
		{
			System.out.println("The Key is: "+ entry.getKey() + " " + "The Value is: " + entry.getValue());
		}
	}

}
 