package Examples;

import java.util.Arrays;

public class LargestSmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array =  {1,289,3,9,8,4,5,7};
		
		int largest= array[0];
		int smallest= array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>largest)
			{
				largest= array[i];
				
			}
			else if (array[i]<smallest) {
				smallest= array[i];
			}
		}
		Arrays.toString(array);
		System.out.println("LargestNumber is :" + largest+ " &" +" SmallestNumber is : "+ smallest);
	}

}
