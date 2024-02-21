https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int []ccount = new int[26];
        for(int i = 0; i < t.length(); i++){
            ccount[s.charAt(i)-'a']++;
             ccount[t.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(ccount[i]!=0) return false;
        }
        return true;

        // char []cc = s.toCharArray();
        // char []cs = t.toCharArray();
        // Arrays.sort(cc);
        // Arrays.sort(cs);
        // return Arrays.equals(cc,cs);  
    }
}