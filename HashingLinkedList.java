/**
 * Hashing
 */
public class Hashing {
    private Node head;
    class Node{
        int n; 
        Node next;
        Node(int d){
            n =d;
            next = null;
        }
    }
    public Hashing(){
        head = null;
    }

    public void addatstart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean search( int data){
        Node temp = head;
        while(temp != null){
            if( data == temp.n ){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void displaydata(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.n+",");
            temp = temp.next;
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
       Hashing[] hash = new Hashing[5];
       
       for(int i = 0; i < hash.length;i++){
        hash[i]= new Hashing();
       }

       int []arr = {1,12,23,54,23,34,23,45,123,6};

         for(int i = 0; i < arr.length;i++){
        int pos = arr[i]%hash.length;
        hash[pos].addatstart(arr[i]);
       }

         for(int i = 0; i < hash.length;i++){
            hash[i].displaydata();
       }

       int searchno =12;

       int pos = searchno%hash.length;

       System.out.println("search position "+pos);

       if(hash[pos].search(searchno)){
        System.out.println("number exists");
       }
       else{
        System.out.println("no does not exists");
       }       
    }
}