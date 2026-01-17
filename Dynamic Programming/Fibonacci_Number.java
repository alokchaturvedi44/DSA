public class Fibonacci_Number {

    // Recursive approach --> Time Complexity = O(2^n)
    private static int fibR(int n){
        if(n <= 1) return n;

        return fibR(n-1) + fibR(n-2);
    }

    // Memoization
    private static int fibDP(int n, int dp[]){
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibDP(n-1, dp) + fibDP(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibR(n));

        int dp[] = new int[n+1];
        System.out.println(fibDP(n, dp));


        // Bottom Up approach --> Time Complexity = O(n), Space Complexity = O(n+1)
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);

    
        // Constant space complexity 
        int a = 0, b = 1, c = 0;
        for(int i=1; i<n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
