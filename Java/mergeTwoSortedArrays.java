//merge two sorted arrays into one combined array such that the combined array will be sorted as well.
//output is 1 2 2 3 4 4 5 7 8
//for example: int A[] = {1,2,3,4,5}; int B[] = {2,4,7,8};
//output is 1 2 2 3 4 4 5 7 8

public class mergeTwo {

public static int[] merge(int[] A, int[] B) {
	int a = A.length;
	int b = B.length;
	int result[] = new int[a + b];
	int i = 0;
	int j = 0;
	int k = 0;
	while (true) {
		if (i < a && j < b) {
			if (A[i] < B[j]) {
				result[k++] = A[i];
				i++;
			} else {
				result[k++] = B[j];
				j++;
			}
		}

		else if (i >= a) {
			result[k++] = B[j];
			j++;
		} else {
			result[k++] = A[i];
			i++;

		}
		if (i >= a && j >= b)
			break;
	}

	return result;
}

public static void main(String[] args) {
	int A[] = { 1, 2, 3, 4 };
	int B[] = { 2, 4, 7, 8 };

	int[] c = merge(A, B);
	for (int elem : c) {
		System.out.print(elem + " ");
	}
}
}
//Ben's codes are always more concise!
  /*public static int[] merge(int[] A, int[] B) {
    int[] combined = new int[A.length + B.length];
    int a = 0, b = 0;
    for (int i = 0; i < combined.length; i++) {
      if (a >= A.length) {
        combined[i] = B[b++];
      } else if (b >= B.length) {
        combined[i] = A[a++];
      } else if (A[a] < B[b]) {
        combined[i] = A[a++];
      } else {
        combined[i] = B[b++];
      }
    }
    return combined;
  }*/
