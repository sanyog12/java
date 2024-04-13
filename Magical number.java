public class Main
{
    public static int reverseNo(int num){
        int revNo = 0;
        while(num > 0){
            int temp = num % 10;
            revNo = (10*revNo) + temp;
            num = num/10;
        }    
        System.out.println(revNo);
        return revNo;
    }
    
    public static int sumNum(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
        return sum;
    }
    
	public static void main(String[] args) {
    int magicNumber = 1729;
    int addNo = sumNum(magicNumber);
    int revNo = reverseNo(addNo);
    if((addNo*revNo) == magicNumber)
        System.out.print("yes magic");
    else 
        System.out.print("no magic");
	}
}
