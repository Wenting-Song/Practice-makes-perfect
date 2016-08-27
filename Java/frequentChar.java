//Thank you so much for Ben Babtsov's help:

    public static int Max(String words) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        char[] charwords = words.toCharArray();
        for (char ch : charwords) {
            int frequency = map.containsKey(ch) ? map.get(ch) + 1 : 1;
            map.put(ch, frequency);
            max = Math.max(max, frequency);
        }
        return max;
    }	
	
	
	
	
