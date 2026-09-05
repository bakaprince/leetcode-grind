class Solution {
    public int singleNonDuplicate(int[] nums) {

        int first = 0;
        int last = nums.length - 1;

        while (first < last) {

            int mid = first + (last - first) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                first = mid + 2;
            } else {
                last = mid;
            }
        }

        return nums[first];
    }
}