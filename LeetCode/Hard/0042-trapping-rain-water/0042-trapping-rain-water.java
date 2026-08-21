class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int totalWater=0;
        int lmax=height[0];
        int rmax=height[right];

        while(left<right){
            if(height[left]<height[right]){
                lmax=Math.max(lmax,height[left]);
                if(lmax-height[left]>0){
                    totalWater+=lmax-height[left];
                }
                left++;
            }
            else{
                rmax=Math.max(rmax,height[right]);
                if(rmax-height[right]>0){
                    totalWater+=rmax-height[right];
                }
                right--;
            }

        }
        return totalWater;
    }
}