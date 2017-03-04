public class Solution {
    public int maxProfit(int[] prices) {
    	int max = 0;
        for(int i=0;i<prices.length-1;i++){
        	if(prices[i+1]<=prices[i]){
        		prices[i]=0;
        	}
        	else{
        		
        		for(int j=i+1;j<prices.length;j++)
        		max= Math.max(max,prices[j]-prices[i]);
        		prices[i]=max;
        	}
        	  
        }
        return max;
      
    }
}
