/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/
public class Solution {
	public int majorityElement(int[] nums) {
        int maj_index = 0, count =1;
        for(int i = 0 ; i<nums.length;i++){
        	if(nums[maj_index]== nums[i]){
        		count ++;
        	}
        	else{count--;}
        	if(count == 0){
        		maj_index = i;
        		count =1;
        	}
        }
        return nums[maj_index];
       
        
      
        
    }
}
/*Boyer–Moore majority vote algorithm
Think of it as a game, where many groups are fighting for the throne. 
Each group has its own army. Any soldier can kill other group’s soldier only by suicidal attack. 
Now no matter who ever fights with whom, or how it starts, the one with more than half will always win. 
In worst half case, every group is aiming for the biggest group and nobody wins.*/
