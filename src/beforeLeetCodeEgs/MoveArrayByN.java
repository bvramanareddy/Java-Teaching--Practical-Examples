package beforeLeetCodeEgs;

import java.util.Arrays;

public class MoveArrayByN {
	
	public static void moveArrayToNRorate(int[] arr, int n)
	{
		int[] arr2= new int[arr.length];
		int index=0;
		
		for(int i=n; i<arr.length; i++)
		{
			arr2[index]= arr[i];
			index++;
			
		}
		for(int i=0; i<n; i++)
		{
			arr2[index]=arr[i];
			index++;
			
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		int n=2;
		System.out.println("Given Array  is : " + Arrays.toString(arr));
		System.out.println("Given Array is moved to-->"+ n + " times roation ");
		System.out.println("Printing the Rotated array is below");
		moveArrayToNRorate(arr, n);
	

	}

}
