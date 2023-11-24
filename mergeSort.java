import java.lang.reflect.Array;
import java.util.Arrays;
public class mergeSort {

    public static void main(String[] args) {
     int [] arr = {65,35,26,13,23,12,91};
     amergeSort(arr,0,arr.length-1);
     System.out.println(Arrays.toString(arr));   
    }
    private static void amergeSort(int arr[],int start, int end) {
        if(start<end){
            int mid = (start+end)/2;
            amergeSort(arr, start, mid);
            amergeSort(arr, mid+1, end);
            merge(arr,start,end,mid);
        }
    }
    private static void merge(int[] arr, int start, int end,int mid) {
        int i,j,k;
        int n1 = mid-start+1;
        int n2 = end-mid;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
        for(i = 0; i<n1; i++){
            leftArr[i] = arr[start+i];
        }
        
        for(i = 0; i<n2; i++){
            rightArr[i] = arr[mid+1+i];
        }
        i = 0;
        j = 0; 
        k = start;

        while (i<leftArr.length && j < rightArr.length){
            if(leftArr[i]<rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        while (i<leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j<rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        

    }
}