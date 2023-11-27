/**
 * LinkedList
 */
public class LinkedList {

    private Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    } 
    public LinkedList(){
        head = null;
    }
    
    public void displaydata(){
       
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       
    }

     public void addAtEnd(int data){
         Node newNode = new Node(data);
            if(head == null){
                head = newNode; 
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

    public void addAtPosition(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            if (head == null){
                head = newNode;
            }
            else{
            newNode.next = head;
            head = newNode;
            }
        }
        else{
            Node temp = head;
            int cnt = 1;
            for(;cnt < pos-1 && temp!= null; cnt++ ){
                temp = temp.next;
            }            
            if(temp!= null){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else{
                System.out.println("wrong position");
            }
        }
      
    }
      public void deleteByValue(int val){
        
            if(head == null){
                System.out.println("laude pahile se hi deleted h");
            }
            if(head.data == val){
                head=head.next;
            }
            else{
            Node temp = head;
            Node previousNode = new Node(-1);
            previousNode.next = head;
            while(temp.data != val && temp != null){
                temp = temp.next;
                previousNode = previousNode.next;
            }
            previousNode.next = temp.next;
            temp = null;
        }
        }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addAtEnd(12);
        list.addAtEnd(13);
        list.addAtEnd(20);
        list.addAtPosition(14,3);
        list.addAtPosition(15,4);
        list.addAtPosition(16,5);
        list.addAtPosition(17,6);
        list.deleteByValue(13);
          list.deleteByValue(17);
            list.deleteByValue(20);
              list.deleteByValue(12);
        list.displaydata();
    }

}