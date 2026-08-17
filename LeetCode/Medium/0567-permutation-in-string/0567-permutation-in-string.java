class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map=new HashMap<>();

        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            Map<Character, Integer> map1 = new HashMap<>();

            for (int j = i; j < i + s1.length(); j++) {

                char c = s2.charAt(j);

                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            if (map.equals(map1)) {
                return true;
            }
        }
        return false;
    }
}