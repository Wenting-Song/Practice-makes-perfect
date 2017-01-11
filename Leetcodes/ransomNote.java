import java.util.HashMap;

/*canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true*/
public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] maga = magazine.toCharArray();
		for (char i : maga) {
			int count = map.getOrDefault(i, 0);
			map.put(i, count + 1);

		}
		char[] ran = ransomNote.toCharArray();
		for (char j : ran) {
			if (!map.containsKey(j)) {
				return false;
			} else {
				int count = map.get(j);
				if (count > 1)
					map.put(j, count - 1);
				else {
					map.remove(j);
				}
				

			}
		}
		return true;
	}
}
