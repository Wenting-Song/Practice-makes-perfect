//Create a lookup table called memo.
//memo[i] stores the ith fibonacci number if it was already computed
//Otherwuse, memo[i] = -1
//Initially all values are -1 since they aren't computed.
int[] memo = new int[MAX_N];
Arrays.fill(memo,-1);

public int fib( int n)
{
  //Base cases.
  if(n == 0 || n == 1)
      return 1;
  if(memo[n] != -1)
      return memo[n];
  int value = fib(n-1) + fib(n-2);
  memo[n] = value;
  return value;
}
