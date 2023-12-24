import java.util.*;

public class Main{
    
    public static int printFact(int a){
        
        if(a < 0){
            
            return -1;
            
        }
        
        int fact = 1;
        
        for(int i = 1; i <= a; i++){
            
           fact = fact * i;
           
        }
        
        return fact;
    }
        
    public static void main(String [] args){
        
        Scanner su = new Scanner(System.in);
        
        int a = su.nextInt();
        
        System.out.println(printFact(a));
        
    }
}
