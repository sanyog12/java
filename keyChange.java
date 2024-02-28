https://leetcode.com/problems/number-of-changing-keys/description/

class Solution {
    public int countKeyChanges(String s) {
        int keyChange = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) keyChange++;
        }
        return keyChange;
    }
}