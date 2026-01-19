import java.util.*;

public class Maximum_Balanced_Subsequence_Sum {
    private static int arr[] = {3, 3, 5, 6};
    private static Map<String, Long> mp = new HashMap<>();


    // Memoization 
    private static long solve(int idx, int prev) {
        if (idx >= arr.length) return 0;

        String key = idx + "_" + prev;
        if(mp.containsKey(key)){
            return mp.get(key);
        }

        long take = Integer.MIN_VALUE;

        if (prev == -1 || arr[idx] - idx >= arr[prev] - prev) {
            take = arr[idx] + solve(idx + 1, idx);
        }

        long skip = solve(idx + 1, prev);

        long ans = Math.max(take, skip);
        mp.put(key, ans);
        
        return ans;
    }

    public static long maxBalancedSubsequenceSum(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Long> map = new TreeMap<>();

        long ans = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            long curAns = nums[i];

            Map.Entry<Integer, Long> lower = map.floorEntry(key);

            if (lower != null) {
                curAns = Math.max(curAns, curAns + lower.getValue());
            }

            map.put(key, Math.max(map.getOrDefault(key, Long.MIN_VALUE), curAns));

            Map.Entry<Integer, Long> next = map.higherEntry(key);
            while(next != null && next.getValue() <= curAns){
                map.remove(next.getKey());
                next = map.higherEntry(key);
            }

            ans = Math.max(ans, curAns);
        }

        return ans;
    }
    public static void main(String[] args) {
        int n = arr.length;

        // System.out.println(solve(0, -1));
        int max = Arrays.stream(arr).max().getAsInt();
        if(max <= 0){
            System.out.println(max);
        }
        // System.out.println(solve(0, -1));


        // Bottom Up
        long dp[] = new long[n];
        for(int i=0; i<n; i++){
            dp[i] = (long) arr[i];
        }

        long result = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i] - i >= arr[j] - j){
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                    result = Math.max(result, dp[i]);
                }
            }
        }
        System.out.println(result > max ? result : max);

        // optimal approach
        System.out.println(maxBalancedSubsequenceSum(arr));
    }
}
