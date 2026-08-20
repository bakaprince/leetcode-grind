class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> unique = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = nums[i];

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int b = nums[j];

                int required = -a - b;

                if (set.contains(required)) {

                    List<Integer> triplet =
                        Arrays.asList(a, required, b);

                    unique.add(triplet);
                }

                set.add(b);
            }
        }

        return new ArrayList<>(unique);
    }
}