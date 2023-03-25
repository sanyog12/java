import java.util.*;

public class Main{
    public static void moveAllX(String str, int idx, int count, String newString){
        
        if(idx == str.length()){
        
            for(int i = 0; i < count; i++){
        
                newString += 'x';
            }
        
            System.out.println(newString);
        
            return;
        }
        if(str.charAt(idx) == 'x'){
        
            count++;
            moveAllX(str,idx+1,count,newString);
            
        }
        else{
            
            newString += str.charAt(idx);
            moveAllX(str,idx+1,count,newString);
            
        }
    }
	public static void main(String[] args) {
	    
	    String str = "sdfxhlxxxkjhkxkjxh";
	    moveAllX(str, 0 , 0, "");
	    
	}
}
