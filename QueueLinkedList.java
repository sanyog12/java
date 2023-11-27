/**
 * StackLinkedList
 */
public class QueueLinkedList {
    private Node front,rear ;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null; 
        }
    }
    public Node(){
        front  = null ;
        rear = null;
    }
     
    public boolean isEmpty(){
        return front == null;
    }


    public void enqueue(int n){

        Node newNode = new Node(n);
        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode ;
            rear = newNode;
        
        }
    }





    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            Node temp = front;
            front = front.next;
            temp.next = null;

        }
    }


    
    public void displaydata(){
        if(front == null && rear == null){
            System.out.println("no data available");
        }
        else{
            Node temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;

            }
        }
    }


    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.enqueue(2);
         ql.enqueue(3);
          ql.enqueue(4);
           ql.enqueue(5);
            ql.enqueue(6);
            ql.dequeue();
            ql.dequeue();
            ql.dequeue();
            ql.dequeue();
            ql.dequeue();
            ql.dequeue();
          

         
            ql.displaydata();

        
    }
    
}