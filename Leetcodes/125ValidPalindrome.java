/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.*/
public class Solution {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		if(s.length()==0) return true;
		if(s.length()==1) return true;
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
	    	if ((s.charAt(i) == s.charAt(j))) {
				i++;
				j--;

			}
			else return false;

		}
		return true;

	}
}
