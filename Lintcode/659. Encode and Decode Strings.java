public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
       String ans = "";
       for(String s: strs){
           for(char c: s.toCharArray()){
               if (c == ':'){
                   ans += "::";
               }else {
                   ans += c;
               }
           }
           ans += ":;";
       }
       return ans;
        
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        char[] charArr = str.toCharArray();
        int len = str.length();
        String item = "";
        int i = 0;
        while(i < len) {
            if(charArr[i] == ':'){
                if(charArr[i+1] == ';'){
                    ans.add(item);
                    item = "";
                    i+=2;
                }else{
                    item +=charArr[i+1];
                    i+=2;
                }
            }
            else {
                item+=charArr[i];
                i++;
            }
        }
        return ans;
    }
