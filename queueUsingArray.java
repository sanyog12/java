import java.util.Arrays;

/**
 * queueUsingArray
 */
public class queueUsingArray {

    public int arr[];
    private int size;
    private int front;
    public int rear;

    public queueUsingArray(){
        arr = new int[10];
        size = 10;
        front = 0;
        rear = -1;
    }

    public queueUsingArray(int data){
        arr = new int[data];
        size = data;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return front > rear; 
    }

    public boolean isFull(){
        return rear == size -1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            rear++;
            arr[rear] = data;
         
        }

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int num = arr[rear];
            rear--;
            return num;
        }
    }


    public static void main(String[] args) {
        queueUsingArray qua = new queueUsingArray();
        qua.enqueue(12);
        qua.enqueue(23);
        qua.enqueue(14);
        qua.enqueue(25);
        qua.dequeue();
     for(int i = 0 ;  i <= qua.rear; i++)
             System.out.println(qua.arr[i]);
        
       
      
        
         
            
         
    }
}