https://leetcode.com/problems/length-of-last-word/description/


class Solution {
    public int lengthOfLastWord(String s) {
        String []x = s.split(" ");
        int size = x.length;
        int y = x[size-1].length();
     return y;
    }
}