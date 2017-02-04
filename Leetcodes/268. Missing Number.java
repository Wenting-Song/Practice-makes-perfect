public class Solution {
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int realSum = 0;
		for (int i = 0; i < nums.length; i++) {
			realSum += nums[i];
			
		}
		int sum=n*(n+1)/2;
	
		return sum-realSum;
		
	}
}
