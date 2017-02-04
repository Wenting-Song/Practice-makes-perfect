public class Solution {
	public int missingNumber(int[] nums) {
		int len = nums.length;
		int realSum = 0;
		for (int i = 0; i < nums.length; i++) {
			realSum += nums[i];
			
		}
		int sum=0;
		for (int i = 0; i <= len; i++) {
			sum += i;
			
		}
		return sum-realSum;
		
	}
}
