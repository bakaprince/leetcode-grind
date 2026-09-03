class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int tempMax = Math.max(x,Math.max(x * maxProduct, x * minProduct));

            minProduct = Math.min(x,Math.min(x * maxProduct, x * minProduct));

            maxProduct = tempMax;

            ans = Math.max(ans, maxProduct);
        }

        return ans;
    }
}