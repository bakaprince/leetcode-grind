class Solution {
    public int firstMissingPositive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();

        int n=nums.length;
        for(int num:nums){
            if(num>=1&&num<=n){
                map.put(num,num);
            }
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return n+1;
    }
}