import java.util.*;

public class Maximum_Length_Of_Chain {
    private static int arr[][] = {{1,2},{7,8},{4,5}};

    private static int solve(int idx, int prev, int dp[][]){
        if(idx >= arr.length) return 0;

        if(prev != -1 && dp[idx][prev] != 0) return dp[idx][prev];

        // take
        int take = 0;
        if(prev == -1 || arr[prev][1] < arr[idx][0]){
            take = 1 + solve(idx+1, idx, dp);
        }

        // skip
        int skip = solve(idx+1, prev, dp);

        if(prev != -1) dp[idx][prev] =  Math.max(take, skip);

        return Math.max(take, skip);
    }
    public static void main(String[] args) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int dp[][] = new int[n+1][n+1];

        System.out.println(solve(0, -1, dp));

        // Bottom Up 
        int temp[] = new int[n];
        Arrays.fill(temp, 1);
        int max = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i][0] > arr[j][1]){
                    temp[i] = Math.max(temp[i], temp[j]+1);
                    max = Math.max(max, temp[i]);
                }
            }
        }
        System.out.println(max);
    }
}
