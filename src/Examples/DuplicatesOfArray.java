package Examples;

public class DuplicatesOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	array= {1,2,1,3,4,5,6,6,7,7,8};
		int[] array2= {1,1,2,23,2,5,6};
	findDuplicatesInArray(array);
	findDuplicatesUsingSorting(array2);

	}

	public static void findDuplicatesInArray(int[] input)
	{
		for (int i = 0; i < input.length; i++) {
			
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j])
				{
					System.out.println("Duplicate element found :" +input[i]);
				}
			}
		}
	}
	
	public static void findDuplicatesUsingSorting(int[]  input) {
		
		for (int i = 0; i < input.length-1; i++) {
			
			if(input[i]==input[i+1]) {
				System.out.println("Duplocate Found "+ input[i]);
			}
				
			
		}
		
	}
}
