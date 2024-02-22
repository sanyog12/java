https://leetcode.com/problems/longest-common-prefix/submissions/1183297947/?envType=study-plan-v2&envId=top-interview-150


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length -1];
        int index = 0;
        while(s1.length() > index && s2.length() > index){
            if(s1.charAt(index) == s2.charAt(index)) index++;
            else break;
        }
        return s1.substring(0, index);
    }
}