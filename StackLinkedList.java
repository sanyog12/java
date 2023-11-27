/**
 * StackLinkedList
 */
public class StackLinkedList {
    private Node top;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null; 
        }
    }
    public Node(){
        top  = null ;
    }
     
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(top!= null){
        newNode.next = top;
        }
        top = newNode;

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack under flow");
            return;
        }
        else{
            Node temp = top;
            top = top.next;
            temp.next = null;//garbage collector will take care of it
        }

    }
    public void displaydata(){
        if(top == null){
            System.out.println("no data available");
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;

            }
        }
    }


    public static void main(String[] args) {
        StackLinkedList sl = new StackLinkedList();

            sl.push(12);
            sl.push(13);
            sl.push(14);
            sl.push(16);
            sl.push(13);
            sl.pop();
            sl.pop();
          

         
            sl.displaydata();

        
    }
    
}