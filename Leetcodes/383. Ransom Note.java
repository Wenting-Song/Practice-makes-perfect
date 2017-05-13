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




updated version:
public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : magazine.toCharArray()) {
			int count = map.getOrDefault(c, 0) + 1;
			map.put(c, count);
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			if (!map.containsKey(ransomNote.charAt(i)))
				return false;
			else {
				int n = map.get(ransomNote.charAt(i));
				n--;
				map.put(ransomNote.charAt(i),n);
				if(n==0) map.remove(ransomNote.charAt(i));
			}
		}
		return true;

	}
}
