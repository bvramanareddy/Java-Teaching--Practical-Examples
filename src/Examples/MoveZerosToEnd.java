package Examples;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	public static int[] moveZerosToEnd(int[]  array) {
		int nonZeroIdx=0; 
		
		// Traverse the array
		for(int i=0; i<array.length; i++)
		{
			if(array[i] != 0)
			{
                // Swap non-zero element to the nonZeroIndex position

				 array[nonZeroIdx]= array[i];
				 nonZeroIdx++; //Increments the iteration
				
			}
			
			
		}
        // Fill the remaining positions with zeros 
		
		for (int i = nonZeroIdx; i < array.length; i++) {
			array[i]=0;
			
		}
		return array;
	}

	public static void main(String[] args) {

		int[] nums= {0,5,0,4,0,6,7,9};
		int[] result=  moveZerosToEnd(nums);
		
		// Output the modified array
				System.out.println(Arrays.toString(result));
        

		
	}

}
