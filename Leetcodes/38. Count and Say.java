public class Solution {
    public String countAndSay(int n) {
    	String str = "1";
    	
    	
    	for(int i=1;i<n;i++){
    		char current = str.charAt(0);
    		StringBuilder sb = new StringBuilder();
    		int count =1 ;
    		for(int j = 1;j<str.length();j++){
    			if(str.charAt(j)!=current){
    				
    				sb.append(count);
    	    		sb.append(current);
    	    		current = str.charAt(j);
    	    		count=1;
    				
    			}
    			else{
    				count++;
    			}
    		}
    		sb.append(count);
    		sb.append(current);
    		str = sb.toString();
    		
    	}
    	return str;
    }  
}
