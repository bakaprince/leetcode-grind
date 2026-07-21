class Solution {
    public int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int num : nums) {
                if (nums[i] == num) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}