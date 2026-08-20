class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> unique = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a=nums[i];

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                if(nums[left]+nums[right]==-a){
                    List<Integer> triplet=Arrays.asList(a,nums[left],nums[right]);
                    unique.add(triplet);
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]>-a){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<>(unique);
    }
}