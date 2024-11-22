package Examples;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArrayHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,1,2,3,4,4,5};
	findDuplciatesUsingHashMap(array);

	}
	

	public static void findDuplciatesUsingHashMap(int[] array)
	{
		HashSet<Integer> hashSet= new HashSet<Integer>();

	for (int i : array) {
	if(!hashSet.add(i))
	{
		System.out.println("Duplciate Element Found :" + i);
	}
	
			}
	
	
	}
}
