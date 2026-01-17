import java.util.Arrays;

public class House_Robber_II {

    // Memoization
    private static int solve(int arr[], int i, int dp[],int n){
        if(i > n) return 0;
        if(dp[i] != -1) return dp[i];

        int steal = arr[i] + solve(arr, i+2, dp, n);
        int skip = solve(arr, i+1, dp, n);

        return dp[i] = Math.max(steal, skip);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;

        int dp[] = new int[n+1];
        
        // take 0th idx house
        Arrays.fill(dp, -1);
        int a = solve(arr, 0, dp, n-2);

        // take 1st idx house
        Arrays.fill(dp, -1);
        int b = solve(arr, 1, dp, n-1);

        System.out.println(Math.max(a, b));


        // ------- Bottom Up --------

            Arrays.fill(dp, 0);
            int result1 = 0;
            int result2 = 0;

            // take 0th idx house
            for(int i=1; i<=n-1; i++){
                int steal = arr[i-1] + (i-2 >= 0 ? dp[i-2]: 0);
                int skip = dp[i-1];

                dp[i] = Math.max(steal, skip);
            }
            result1 = dp[n-1];

            // take 1st idx house
            Arrays.fill(dp, 0);
            for(int i=2; i<=n; i++){
                int steal = arr[i-1] + (i-2 >= 0 ? dp[i-2]: 0);
                int skip = dp[i-1];

                dp[i] = Math.max(steal, skip);
            }
            result2 = dp[n];
            System.out.println(Math.max(result1, result2));


        // ------ Constant Space ---------

        int p = 0, q = 0;
        int ans1 = 0, ans2 = 0;

        // take 0th idx house
        for(int i=0; i<n-1; i++){
            int curr = Math.max(arr[i]+p, q);
            p = q;
            q = curr;
        }
        ans1 = q;

        p = 0; q = 0;
        for(int i=1; i<n; i++){
            int curr = Math.max(arr[i]+p, q);
            p = q;
            q = curr;
        }
        ans2 = q;

        System.out.println(Math.max(ans1, ans2));
    }
}
