class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> schar = new HashMap<>();
        Map<Character, Integer> tchar = new HashMap<>();

        for (char c : s.toCharArray()) {
            schar.put(c, schar.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tchar.put(c, tchar.getOrDefault(c, 0) + 1);
        }

        return schar.equals(tchar);
    }
}