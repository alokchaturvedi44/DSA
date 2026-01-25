import java.util.*;

public class Q1 {
    public static int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        if(n <= 1) return 0;
        int i = n-1;
        while(i>0 && nums[i-1] < nums[i]){
            i--;
        }
        return i;
    }

    public static void main(String[] args) {
        int nums[] = {1,-1,2,3,3,4,5};
        System.out.println(minimumPrefixLength(nums));
    }
}
