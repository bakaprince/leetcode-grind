class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||t.length()>s.length()){
            return "";
        }

        Map<Character,Integer> mapt=new HashMap<>();
        for(char c:t.toCharArray()){
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }

        int required=mapt.size();
        int  l=0;int r=0;
        int create=0;
        int[] ans={-1,0,0};
        Map<Character,Integer> subStringm=new HashMap<>();

        while(r<s.length()){
            char c=s.charAt(r);
            subStringm.put(c,subStringm.getOrDefault(c,0)+1);

            if(mapt.containsKey(c)&&subStringm.get(c).intValue()==mapt.get(c).intValue()){
                create ++;
            }
            while(l<=r && required==create){
                c=s.charAt(l);
                if(ans[0]==-1||ans[0]>r-l+1){
                    ans[0]=r-l+1;
                    ans[1]=l;
                    ans[2]=r;
                }
                subStringm.put(c,subStringm.get(c)-1);
                if(mapt.containsKey(c) &&subStringm.get(c) < mapt.get(c)){
                    create--;
                }
                l++;
            }
            r++;
        }
        if(ans[0]==-1){
                return "";
            }
        return s.substring(ans[1],ans[2]+1);
    }
}