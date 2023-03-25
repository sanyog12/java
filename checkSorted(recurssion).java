public class  Main{

    public static boolean isSorted(int s[], int index){

        if(index == s.length-1){
            return true;
        
        }
        if(s[index] < s[index + 1]){
            
            return isSorted(s, index+1);
        
        }
        else{

            
            return false;
        }
    }

	public static void main(String[] args) {

		int []arr = {1,2,3,4};
        System.out.println(isSorted(arr, 0));
	
    }

}