// Problem - Leetcode 3813 - https://leetcode.com/problems/vowel-consonant-score/description/


import java.util.*;

public class Q1 {
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u';
    }
    public static int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        if (c == 0) {
            return 0;
        }
        return v / c;
    }
    public static void main(String[] args) {
        String s1 = "cooear";
        String s2 = "axeyizou";
        String s3 = "au 123";

        System.out.println(vowelConsonantScore(s1));
        System.out.println(vowelConsonantScore(s2));
        System.out.println(vowelConsonantScore(s3));
    }
}
