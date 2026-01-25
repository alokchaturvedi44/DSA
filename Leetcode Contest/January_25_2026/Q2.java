import java.util.*;

public class Q2 {
     public static int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i >= 0){ 
                list.add(i);
            }
        }
        int l = list.size();
        
        if (l == 0) return nums;
        
        int positive[] = new int[l];
        k = k % l;
        for(int i=0; i<l; i++){
            int newIdx = (i - k + l) % l;
            positive[newIdx] = list.get(i);
            
        }
        int i=0, j=0;
        while(i<list.size() && j<n){
            if(nums[j] >= 0){
                nums[j] = positive[i];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,3,-4};
        int k = 3;
        int resut[] = rotateElements(nums, k);
        for(int i : resut){
            System.out.print(i + " ");
        }
    }
}
