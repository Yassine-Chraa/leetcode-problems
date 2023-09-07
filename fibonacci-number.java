class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        else return fib(n-1)+fib(n-2);
    }
}

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int sum = 0;
        int prev1 = 1;
        int prev2 = 0;
        for(int i=2;i<=n;i++){
            sum = prev1+prev2;
            prev2 = prev1;
            prev1 = sum;
        }
        return sum;
    }
}