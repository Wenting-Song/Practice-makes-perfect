/*
137. Single Number II   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 104749
Total Submissions: 261574
Difficulty: Medium
Contributors: Admin
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?
*/
public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i=i+3){
            if(nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
