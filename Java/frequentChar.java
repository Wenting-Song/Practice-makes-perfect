import java.util.HashMap;

/*"Given an input string, return the frequency of the most frequent character."
Your function should also handle the empty string as an input.
 */
public class frequency{
	public static int Max(String words){
		HashMap<String,Integer> freq = new HashMap<String,Integer>(); 
		char[] charwords = words.toCharArray();
		for(char ch:charwords){
			if(ch == ''){  //here caused an erro
				continue;
			}
		    if(map:containsKey(ch)){
		    	map.put(ch,map.get(ch)+1);
		    	
		    }else{
		    	map.put(ch,1);
		    }
		}
			
		Set<Character> set = map.keySet();

	    for (char c : set) {
	        if (max == 0 || map.get(c) > max) {
	            max = map.get(c);
	        }
	    }

	    for (Character o : map.keySet()) {
	        if (map.get(o).equals(max)) {
	            System.out.println(o);
	        }
	    }
	    System.out.println("");
	}

	public static void main(String[] args) {
	   
	   System.out.println(Max("aabbcccduuuuuuuu"));
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
