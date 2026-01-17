public class House_Robber_I {

    // Recursive approach
    private static int sol1(int arr[], int i){
        if(i >= arr.length) return 0;

        int steal = arr[i] + sol1(arr, i+2);
        int skip = sol1(arr, i+1);

        return Math.max(steal, skip);
    }

    // Memoization
    private static int sol2(int arr[], int i, int dp[]){
        if(i >= arr.length) return 0;

        if(dp[i] != 0) return dp[i];

        int steal = arr[i] + sol2(arr, i+2, dp);
        int skip = sol2(arr, i+1, dp);

        return dp[i] = Math.max(steal, skip);
    }
    
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1, 2, 3, 1};
        System.out.println(sol1(arr, 0));

        int dp[] = new int[n+1];
        System.out.println(sol2(arr, 0, dp));


        // Bottom Up
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i=2; i<=n; i++){
            int steal = arr[i-1] + dp[i-2];
            int skip = dp[i-1];

            dp[i] = Math.max(steal, skip);
        }
        System.out.println(dp[n]);


        // Constant space
        int a = 0, b = 0;
        for(int i=0; i<n; i++){
            int c = Math.max(arr[i]+a, b);
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
