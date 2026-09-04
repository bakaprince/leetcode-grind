class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Find first occurrence
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                last = mid - 1; 
            }
            else if (nums[mid] > target) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }

        first = 0;
        last = nums.length - 1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                first = mid + 1; 
            }
            else if (nums[mid] > target) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }

        return ans;
    }
}