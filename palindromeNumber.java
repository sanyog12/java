https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverseDigit = 0;
        int y = x;
        while (x > 0) {
            int reminder = x % 10;
            reverseDigit = 10 * reverseDigit + reminder;
            x = x / 10;
        }
        if (reverseDigit == y)
            return true;
        return false;
    }
}