/*
you have an array
[1,2,3,4,5,6,7,8]
and you are given a range of indexes for which you need to reverse the array
so for example if you range 2,6
then the resulting array [1,2,7,6,5,4,3,8]*/

public class reversePartial {

	public static int[] reverse(int[] nums, int n, int m) {
		int[] newnums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			// if (i < n || i > m)
			newnums[i] = nums[i];

		}
		for (int i = n; i <= m; i++) {
			newnums[i] = nums[n + m - i];

		}
		return newnums;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 1;
		int m = 3;
		int ret[] = reverse(nums, n, m);

		for (int i = 0; i < ret.length; i++) {
			System.out.print(ret[i]);
		}

	}
}
