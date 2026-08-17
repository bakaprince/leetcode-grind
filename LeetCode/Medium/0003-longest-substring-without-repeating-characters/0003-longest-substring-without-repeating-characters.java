class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null ||s.isEmpty()){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }
        
        int left=0;
        int right=0;
        int ans=0;
        Set<Character> set=new HashSet<>();

        char[] c=s.toCharArray();

        while(right<c.length){
            while(set.contains(c[right])){
                set.remove(c[left]);
                left++;
            }
            set.add(c[right]);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}