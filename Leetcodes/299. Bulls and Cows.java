import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class Solution {
	public String getHint(String secret, String guess) {
		HashMap<Character, Integer> map = new HashMap<>();
		int bull = 0;
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bull++;

			} else {
				int count = map.getOrDefault(secret.charAt(i), 0);
				count++;
				map.put(secret.charAt(i), count);
			}
		}

		int cow = 0;
		for (int i = 0; i < guess.length(); i++) {

			if (map.containsKey(guess.charAt(i)) && (secret.charAt(i) != guess.charAt(i))) {
				cow++;
				char key = guess.charAt(i);
				if (map.get(key) > 1) {
					map.put(key, map.get(key) - 1);
				} else if (map.get(key) == 1)
					map.remove(key);

			}
		}
		return bull + "A" + cow + "B";
	}
}
