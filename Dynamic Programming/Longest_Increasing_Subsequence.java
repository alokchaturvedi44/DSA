import java.util.*;

public class Longest_Increasing_Subsequence {

    private static int arr[] = {10,9,2,5,3,7,101,18};


    // Recursion and Memoization --> T.C = 2^n
    private static int solve(int idx, int prev, int dp[][]){
        if(idx >= arr.length) return 0;

        if(prev != -1 && dp[idx][prev] != -1) return dp[idx][prev];

        // take ith element
        int take = 0;
        if(prev == -1 || arr[prev] < arr[idx]){
            take = 1 + solve(idx + 1, idx, dp);
        }
        // skip ith element
        int skip = solve(idx + 1, prev, dp);

        if(prev != -1){
            dp[idx][prev] = Math.max(take, skip);
        }
        return Math.max(take, skip);
    }

    private static int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) >= target)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int n = arr.length;

        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(0, -1, dp));


        // Bottom up --> T.C = O(n^2)

        int temp[] = new int[n];
        Arrays.fill(temp, 1);

        int max = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    temp[i] = Math.max(temp[i], temp[j]+1);
                    max = Math.max(max, temp[i]);
                }
            }
        }
        System.out.println(max);

        // Binary Search & Patience Sorting --> T.C = O(nlogn)
        List<Integer> sorted = new ArrayList<>();
        for (int i : arr) {
            int idx = lowerBound(sorted, i);
            if (idx == sorted.size()) {
                sorted.add(i);      
            } else {
                sorted.set(idx, i); 
            }
        }
        System.out.println(sorted.size());
    }
}
