import java.util.*;

public class Longest_String_Chain {
    private static String words[] = {"xbc","pcxbcf","xb","cxbc","pcxbc"};

    private static boolean isPredecessor(String str1, String str2){
        int m = str1.length();
        int n = str2.length();

        if(n - m != 1) return false;

        int i=0, j=0;
        while(i<m && j<n){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == m;
    }

    // Recursion and Memoization

    private static int solve(int idx, int prev, int dp[][]){
        if(idx >= words.length) return 0;

        if(prev != -1 && dp[idx][prev] != -1) return dp[idx][prev];

        int take = 0;
        if(prev == -1 || isPredecessor(words[prev], words[idx])){
            take = 1 + solve(idx+1, idx, dp);
        }

        int skip = solve(idx+1, prev, dp);

        if(prev != -1) dp[idx][prev] = Math.max(take, skip);

        return Math.max(take, skip);
    }

    public static void main(String[] args) {
        int n = words.length;
        Arrays.sort(words, Comparator.comparingInt(String::length));

        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(0, -1, dp));


        // Bottom Up

        int temp[] = new int[n];
        Arrays.fill(temp, 1);
        int max = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(isPredecessor(words[j], words[i])){
                    temp[i] = Math.max(temp[i], temp[j]+1);
                    max = Math.max(max, temp[i]);
                }
            }
        }
        System.out.println(max);
    }
}
