import java.util.Arrays;


public class CircularQueue{

    public int arr[];
    private int size;
    private int front;
    public int rear;

    public queueUsingArray(){
        arr = new int[10];
        size = 10;
        front = -1;
        rear = -1;
    }

    public queueUsingArray(int data){
        arr = new int[data];
        size = data;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == -1; 
    }

    public boolean isFull(){
        if(front == 0 && rear == size - 1){
            return true;
        }
        if(front == rear+1){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
           if(front == -1){
            front = 0;
           }
           rear = (rear+1)%size;
           arr[rear] = data;
           System.out.println(b+"added");

    
         
        }

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int a = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return a;
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