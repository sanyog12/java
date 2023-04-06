
import java.util.*;

class LL{
    
    Node head;
    
    class Node{
        
        String data;
        Node next;

        Node(String data){
            
            this.data = data;
            next = null;
            
        }
    }


    public void addLast(String data){
        
        Node newNode = new Node (data);
        
        if (head == null){
            
            head = newNode;
            return;
            
        }
        Node currentNode = head;
        
        while(currentNode.next != null){
            
            currentNode = currentNode.next;
            
        }
        
        currentNode.next = newNode;
        return;
    }
    public void addFirst(String data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            
            head = newNode;
            return;
            
        }
        
        newNode.next = head;
        head = newNode;
        return;
    }

    public void printNode(){
        
        Node currentNode = head;
        
        if( currentNode == null ){
            
            System.out.println("Empty");
            return;
            
        }
        while (currentNode != null) {
            
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
            
        }
    }

    public void deleteNode(String data){
        
        if(head == null || head.next == null){
            
            head = null;
            System.out.println("Head is set to null");
            return;
            
        }

        if(head.data == data){
            
            head = head.next;
            return;
            
        }

        Node prev = head;
        Node current = head.next;
        
        while (current.next != null){
            
            if(current.data == data){
                prev.next = current.next;
                System.out.println("Node removed");
                return;
                
            }
            
            current = current.next;
            prev = prev.next;
            
        }
        
        if(current.data == data){
            
            prev.next = null;
            
        }
        return;

    }
    public int sizeOflist(){
        
        int size = 0;
        Node currentNode = head;
        
        while (currentNode != null){
            
            size++;
            currentNode = currentNode.next;
            
        }
        
        return size;
    }

    public static void main(String[] args) {
        
        LL list = new LL();
        list.addFirst("Hello,");
        list.addLast("How are u?");
        list.addLast("just fine");
        list.printNode();
        list.deleteNode("Hello,");
        list.printNode();
        System.out.println(list.sizeOflist());
        
    }
}
