class Solution {
    public void rotate(int[] nums, int k) {
        int[] rotated=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int newIndex=(i+k)%nums.length;
            rotated[newIndex]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }
    }
}