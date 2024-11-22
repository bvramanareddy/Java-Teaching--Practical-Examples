package Examples;

public class SumofIndicesTarget {

		 static   int[] twoSum(int[] nums, int target) {
	        int[] ans = new int[2];
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[j] == target- nums[i]) {
	                    ans[0] = i;
	                    ans[1] = j;
	                    return ans;
	                }
	            }
	        }
	        return ans;
	    }
		    
		    public static void main(String[] args) {
				int[] intArray= {3,4,5};
				int target = 6;
				twoSum(intArray, target);
			}
	}

