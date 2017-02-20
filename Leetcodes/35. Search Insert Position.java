public class Solution {
	public int searchInsert(int[] nums, int target) {

		int high = nums.length - 1;
		int low = 0;

		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (target < nums[middle]) {
				high = middle - 1;
				
			}
			else if (target > nums[middle]) {
				low = middle + 1;
				
			}
			else if(target == nums[ middle])
				return middle;
		}
		return low;
	}

}
