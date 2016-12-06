/*
 * the function is called String rollingString(String s, String[] operations) it
 * accepts a word as a string (assume all lower case letters) the operations
 * allowed are of type "1 2 L" this means, start from index 1 until index 2 and
 * shift each letter in this range left by shifting letter it means "b" becomes
 * "a" and "z" becomes "y"  "0 0 R" means shift all
 * letters from index 0 to index 0 to the right b shifted right is C x shifted
 * right is y "z" shifted right is "a" (wrap around) "a" shifted left is "z"
 * (wraps around)
 *  String[] ops = {"1 2 L", "0 0 R", "2 3 R"}
 */
public class shiftLetters {
	static String rollingString(String s, String[] operations) {
		char[] str = s.toCharArray();
		for (int i = 0; i < operations.length; i++) {
			String[] tokens = operations[i].split(" ");
			int startIndex = Integer.parseInt(tokens[0]);
			int endIndex = Integer.parseInt(tokens[1]);
			char op = tokens[2].charAt(0);

			if (op == 'L') {
				for (int j = startIndex; j <= endIndex; j++) {

					if (str[j] == 'a') {
						str[j] = 'z';
					} else
						str[j]--;
				
				}
			} else {
				for (int j = startIndex; j <= endIndex; j++) {
					if (str[j] == 'z') {
						str[j] = 'a';
					} else
						str[j]++;
					
				}
			}
		}
		return new String(str);
	}

	public static void main(String[] args) {
		String s = "abcz";
		// String[] operations = new String[3];
		String[] ops = { "1 2 L", "0 0 R", "2 3 R" };
		shiftLetters object = new shiftLetters();
		String result = object.rollingString(s, ops);
		System.out.println(result);

	}
}
