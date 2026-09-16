class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (current.indexOf(ch) != -1) {
                current = current.substring(current.indexOf(ch) + 1);
            }
            current += ch;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest.length();
    }
}