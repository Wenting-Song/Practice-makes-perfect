public class Solution {
    public boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;
        char[] direction = moves.toCharArray();;
        for(Character ch:direction){
    	   if(ch=='U') ver++;
    	   if(ch=='D') ver--;
    	   if(ch=='L') hor--;
    	   if(ch=='R') hor++;
       }
       if(ver!=0||hor!=0) return false;
       return true;
    }
}
