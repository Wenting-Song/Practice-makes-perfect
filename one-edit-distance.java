//lintcode 640
public class Solution {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if they are both one edit distance apart or false
     */
    public boolean isOneEditDistance(String s, String t) {
        // write your code here
        if(s.length() > t.length()) {
            String temp = s;
            s = t;
            t = temp;
        }
        if(t.length() - s.length() > 1){
            return false;
        }
        if(t.length() - s.length() == 0){
            int cnt = 0;
            for(int i = 0 ; i < s.length(); i++) {
                if(s.charAt(i) != t.charAt(i)){
                    cnt++;
                }
            }
            return (cnt ==1 );
        }
         if(t.length() - s.length() == 1){
            for(int i = 0 ; i < s.length(); i++) {
                if(s.charAt(i) != t.charAt(i)){
                    return s.substring(i).equals(t.substring(i+1));
                }
            }
           
        }
        return true;
    }
}
