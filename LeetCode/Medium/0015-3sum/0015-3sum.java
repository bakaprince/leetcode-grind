class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> unique = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
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