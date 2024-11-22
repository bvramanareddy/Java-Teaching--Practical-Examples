package Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementArrays {

	public static void main(String[] args) {

		
		int[]  a1= {1,2,3,4,5,6,7};
		int[]  a2= {1,2,3,8,9,10};
		int[] a3=  {1,2,3,11};
		
		
		
	Set<int[]> mySet1=	Arrays.asList(a1).stream().collect(Collectors.toSet());
	Set<int[]> mySet2=	Arrays.asList(a2).stream().collect(Collectors.toSet());
	Set<int[]> mySet3=	Arrays.asList(a3).stream().collect(Collectors.toSet());
	mySet1.retainAll(mySet2);
	mySet1.retainAll(mySet3);
	
	System.out.println(mySet1);

	
		
		
	}

}
