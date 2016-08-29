/*Given an array of non-negative integers,
 *  you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.*/
public class jumpGame {
    public boolean canJump(int[] arr) {
        int maxindex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i + arr[i];
            maxindex = Math.max(maxindex, index);

        }

        return maxindex >= arr.length-1? true : false;
    }

    public static void main(String[] args) {
        jumpGame game = new jumpGame();
        System.out.println(game.canJump(new int[] { 3, 2, 1, 0, 4 }));

    }

}
