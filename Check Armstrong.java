https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

bool checkArmstrong(int n){
	//Write your code here
	int original = n;
	int digitcnt = 0;
	int dummy = n;
	while(dummy > 0){
		dummy = dummy / 10;
		digitcnt++;
	}
	int ans = 0;
	while(n){
		int num = n % 10;
		ans+=pow(num,digitcnt);
		n = n/10;
	}
	return ans == original;

}
