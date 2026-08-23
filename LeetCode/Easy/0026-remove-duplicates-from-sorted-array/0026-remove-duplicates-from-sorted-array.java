class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int unique = 1;

        for (int k = 1; k < nums.length; k++) {
            if (nums[k] != nums[k - 1]) {
                nums[unique] = nums[k];
                unique++;
            }
        }

        return unique;
    }
}