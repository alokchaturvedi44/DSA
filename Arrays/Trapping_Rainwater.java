public class Trapping_Rainwater {
    public static int trappedRainWater(int height[]){
        int n = height.length;
     
        // leftMax array
        int leftmax[] = new int[n];
        leftmax[0] = height[0]; 
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // rightMax array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        // int height[] = {1,2,3,4,5,6,7,8,9};
        // int height[] = {9,8,7,6,5,4,3,2,1};
        // int height[] = {4,2};
        int height[] = {4,3,7,4,8,2,7,10,12,4,15};
        System.out.println(trappedRainWater(height));
    }
}
