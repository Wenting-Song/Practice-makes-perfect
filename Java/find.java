  private static int findme(String s, char c) {
        if (s == null) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == c) {
                return i;
            }
        }
        return -1;    
    }
