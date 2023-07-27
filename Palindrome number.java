https://www.codingninjas.com/studio/problems/palindrome-number_624662?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

import java.util.*;
public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int newNumber = 0 ;
        int originalNumber = n;
        while(n > 0){
            int digit = n%10;
            newNumber = (newNumber*10) + digit;
            n/=10;
        }
        
        return (originalNumber == newNumber);
    }
}