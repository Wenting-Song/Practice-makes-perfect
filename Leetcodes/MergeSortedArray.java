
/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.*/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        	
		int i = 0;
		int j = 0;
		int k = 0;
		//int a = nums1.length;
		//int b = nums2.length;
		int totalLen = m + n;
		int[] newnum = new int[totalLen];
		while (true) {
			if (i < m && j < n){
				if (nums1[i] < nums2[j]) {

					newnum[k] = nums1[i];
					i++;
					k++;
				} else {
					newnum[k] = nums2[j];
					j++;
					k++;
				}
			}
		
			else if(i>=m){
				newnum[k] = nums2[j];
				k++;
				j++;
				
			}else {
				newnum[k] = nums1[i];
				k++;
				i++;
			}
			if(i>=m && j>=n)
			   break;
			   
		}
		for (int index = 0; index < nums1.length; index++) {
		    nums1[index] = newnum[index];
		}
		 
	}



}
