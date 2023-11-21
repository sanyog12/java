public class Main
{
	   public static int bs(int start, int end, int []arr,int x){
        if(start>end){
            return -1;
        }
        int mid = (start + end)/2;
        
        if(arr[mid] == x){  
            System.out.println("ele fnd at pos "+mid);
            return mid;
        }
        else if(arr[mid]<x){
            return bs(mid+1, end,arr,x);
        }
        else{
           
             return bs(start, mid-1, arr, x);
        }
    }
    public static void main(String [] args){
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int x = 4;
    
    int start = 0;
    int end = arr.length-1;
   
 bs(start,end,arr,x);
}}
