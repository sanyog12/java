https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0




public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        	int cnt = 0;
            int on = n;

	// Write your code here.	
	while(n > 0){

		int digit = n%10;

		if( digit !=0 && on%digit == 0){

			cnt++;

		}

		n/=10;

	}
	
	return cnt;
        
    }
}