import java.util.ArrayList;
import java.util.HashMap;

//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		for (int i:nums1){
			int count = map.getOrDefault(i, 0);
			map.put(i, count + 1);

		}
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int c:nums2) {
			if (map.containsKey(c)) {

				int count = map.getOrDefault(c, 0);
				if (count > 1)
					map.put(c, count - 1);
				else {
					map.remove(c);
				}
				ret.add(c);

			}

		}
		int[] result = new int[ret.size()];
		int j = 0;
		while (j < ret.size()) {
			result[j] = ret.get(j);
			j++;
		}

		return result;
	}
}
