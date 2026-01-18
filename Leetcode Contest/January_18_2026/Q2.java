// Problem - Leetcode 3814 - https://leetcode.com/problems/maximum-capacity-within-budget/description/

import java.util.*;

public class Q2 {
    private static int upperBound(int[][] pairs, int value, int hi) {
        int lo = 0, res = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (pairs[mid][0] <= value) {
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }
    
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int result = 0;

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = costs[i];
            pairs[i][1] = capacity[i];
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        
        int[] prefixMax = new int[n];
        prefixMax[0] = pairs[0][1];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], pairs[i][1]);
        }

        for (int i = 0; i < n; i++) {
            if (pairs[i][0] < budget) {
                result = Math.max(result, pairs[i][1]);
            }
        }

        for (int i = 0; i < n; i++) {
            int remaining = budget - pairs[i][0] - 1;
            if (remaining < 0) continue;
            int idx = upperBound(pairs, remaining, i - 1);
            if (idx >= 0) {
                result = Math.max(result, pairs[i][1] + prefixMax[idx]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int costs[] = 
            // {4,8,5,3}
            {3,5,7,4}
            ;
        int capacity[] = 
            // {1,5,2,7}
            {2,4,3,6}
            ;
        int budget = 8;

        System.out.println(maxCapacity(costs, capacity, budget));
    }
}
