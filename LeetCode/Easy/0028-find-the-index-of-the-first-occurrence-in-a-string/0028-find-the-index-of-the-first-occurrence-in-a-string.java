class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();

        for(int i=0;i<=haystack.length()-n;i++){
            if(needle.equals(haystack.substring(i,n+i))){
                return i;
            }
        }
        return -1;
    }
}