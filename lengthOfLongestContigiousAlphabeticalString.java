https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/description/



class Solution {
    public int longestContinuousSubstring(String s) {
       
        int count = 1;
        int maxCount=1;
        for(int x = 0; x < s.length() - 1; x++){

        
        if(s.charAt(x+1) - s.charAt(x)==1){
            count++;
        }
        else{
            count = 1;
        }
      
        maxCount = Math.max(count,maxCount);
        }
        return  maxCount;
    }
}