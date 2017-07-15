public class selectionSort {

	public void sort(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			int mIndex = findMin(num, i);
			int tem = num[i];
			num[i] = num[mIndex];
			num[mIndex] = tem;
		}
	}

	public int findMin(int[] num, int beginNum) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int j = beginNum; j < num.length; j++) {
			if (num[j] < min) {
				min = num[j];
				minIndex = j;
			}
		}
		return minIndex;
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		selectionSort ob = new selectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
