https://leetcode.com/problems/longest-palindrome/


class Solution {
    public int longestPalindrome(String s) {
        if (s.isEmpty())
            return 0;
        if (s.length() == 1)
            return 1;
        int length = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char a : s.toCharArray()) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
            if (hm.get(a) % 2 == 0) {
                length = length + 2;
            }
        }
        if (length < s.length())
            return length + 1;
        return length;

    }
}