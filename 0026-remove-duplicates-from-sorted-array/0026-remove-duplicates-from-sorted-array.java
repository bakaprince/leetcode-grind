class Solution {
    public int removeDuplicates(int[] nums) {
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