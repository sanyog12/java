import com.demo.beans.MyStack;

/**
 * StackUsingArray
 */
public class StackUsingArray {
    public  int [] arr;
    public int size;
    public int top;

    public StackUsingArray(){
        arr = new int[10];
        size = 10;
        top = -1;
    }
    public StackUsingArray(int n){
        arr = new int[n];
        size = n;
        top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top == size-1;
    }


    public void push(int data){
        if(isFull()){
            System.out.println("it is full dummy");
            
        }
        else{
            top++;
            arr[top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int num = arr[top];
            top--;
            return  num;
        }
        
    }



    public static void main(String[] args) {
       StackUsingArray sua = new StackUsingArray();
     
sua.push(23);
sua.push(234);
sua.pop();
       
       
        while (!sua.isEmpty()) {
            System.out.println(sua.pop());
        }
       
    }
}