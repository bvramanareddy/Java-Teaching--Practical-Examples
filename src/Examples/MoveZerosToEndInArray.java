package Examples;

import java.util.Arrays;

public class MoveZerosToEndInArray {
	
	public static int[] moveZerosToEndArray(int[] array, int n) {
		int n1=array.length;
		int zerIdx= 0;
		int nonZeroIdx= 0;
		for (int i = 0; i < n1; i++) {
			if(array[nonZeroIdx]!=0)
			{
				array[zerIdx]= array[nonZeroIdx];
				zerIdx++;
			}
			nonZeroIdx++;
			
		}
		return array;
		
		
	}

	public static void main(String[] args) {
		
		int[] array= {0,2,3,0,6,8,0};
		int n= array.length;
	System.out.println(Arrays.toString(moveZerosToEndArray(array, n)));


		
		

	}

}
