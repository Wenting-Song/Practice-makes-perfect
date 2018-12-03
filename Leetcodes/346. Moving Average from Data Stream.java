/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/
class MovingAverage {
    double[] sum;
    int id, size;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        sum = new double[size+1];
        id = 0;
        this.size = size;
    }
    int mod(int x){
        return x%(size+1);
    }
    public double next(int val) {
        id++;
        sum[mod(id)] = sum[mod(id-1)] + val;
        if(id - size >= 0) {
            return (sum[mod(id)] - sum[mod(id -size)]) / size;
        }else {
            return sum[mod(id)] / id;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
