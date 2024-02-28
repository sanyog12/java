https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        goal = goal + goal;
        if (goal.contains(s))
            return true;
        else
            return false;
    }
}