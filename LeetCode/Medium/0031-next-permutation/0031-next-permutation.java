class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int pivot = n - 2;
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        if (pivot >= 0) {
            int successor = n - 1;
            while (nums[successor] <= nums[pivot]) {
                successor--;
            }

            swap(nums, pivot, successor);
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}