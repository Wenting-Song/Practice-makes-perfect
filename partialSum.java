/*Write a function that, given an array A[0..N] returns a right sum array, R[0..N], such that:
for each i (0 <= i <= N ), we have R[i] = A[N] + A[N - 1] + A[N - 2] + ... A[i]



Example:
input: 1,2,3,4
output: 10,9,7,4
*/
public class partialSum2 {
	public static int[] rightSum(int[] A){
		int newarray[] = new int[A.length];
		if(A.length == 0){
			return A;
		}
		newarray[0] = 0;
		for(int i=0;i<A.length;i++){
			newarray[0]+= A[i];
			
		}
		for(int i=0;i<A.length-1;i++){
			
			
			newarray[i+1]=newarray[i]-A[i];
			
		}
		
		return newarray;
		
		
		 
		
		
	}
	public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]+"]");
    }

public static void main (String[]args){
	int inputArray[] = new int[]{2,5,6,7};

    int[] outputArray = rightSum(inputArray);
    printArray(outputArray);
	
   }
}
