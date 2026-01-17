public class Maximum_Alternating_Subsequence_Sum {
    private static long dp[][];

    // Recursion & Memoization
    private static long sol1(int idx, int arr[], int flag){
        if(idx >= arr.length) return 0;
        
        if(dp[idx][flag] != -1){
            return dp[idx][flag];
        }

        long skip = sol1(idx+1, arr, flag);

        long val = arr[idx];
        if(flag == 0){
            val = -val;
        }
        long take = sol1(idx+1, arr, 1-flag) + val;

        return dp[idx][flag] = Math.max(skip, take);
    }

    // Pure Greedy approach. --> Best one
    public static long maxAlternatingSum(int[] nums) {
        long ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans += Math.max(nums[i]-nums[i-1],0);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8};
        int n = arr.length;

        dp = new long[n+1][2];
        // for (int i = 0; i < n; i++) {
        //     dp[i][0] = -1;
        //     dp[i][1] = -1;
        // }

        // System.out.println(sol1(0, arr, 1));


        // Bottom Up

        for(int i=1; i<=n; i++){
            dp[i][0] = Math.max(dp[i-1][1]-arr[i-1], dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]+arr[i-1], dp[i-1][1]);
        }
        System.out.println(Math.max(dp[n][0], dp[n][1]));

        System.out.println(maxAlternatingSum(arr));
    }
}
