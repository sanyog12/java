https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();
        String title = word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase();

        if (word.equals(upper) || word.equals(lower) || word.equals(title))
            return true;

        return false;
    }
}