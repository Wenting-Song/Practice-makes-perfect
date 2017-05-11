public class Solution {
    public int lengthOfLIS(int[] nums) {
        	if(nums.length <= 1) 
			return nums.length;
    	int[] T = new int[nums.length];
    	Arrays.fill(T,1);
    	for(int i=1;i<nums.length;i++){
    		
    		for(int j=0;j<i;j++){
    			if(nums[j]<nums[i]){
    				if(T[j]+1>T[i]){
    					T[i] = T[j]+1;
    				}
    				
    			}
    		}
    	}
    	Arrays.sort(T);
    	int res = T[nums.length-1];
    	return res;
    }
}
 
