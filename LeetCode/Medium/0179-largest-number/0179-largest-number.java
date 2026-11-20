class Solution {
    public String largestNumber(int[] nums) {
        String[] asStr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            asStr[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(asStr, new Comparator<String>(){

            public int compare(String a,String b){
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);
            }
        });

        if(asStr[0].equals("0")){
            return "0";
        }

        StringBuilder largestNumStr=new StringBuilder();
        for(String numAsStr:asStr){
            largestNumStr.append(numAsStr);
        }
        return largestNumStr.toString();
    }
}