import java.util.HashMap;

public class theUniqueNum {

	public int find(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int count = map.getOrDefault(nums[i], 0);
			count++;
			map.put(nums[i], count);
		}

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == 1) {
				return i;
			}

		}
		return -1;
	}

}
