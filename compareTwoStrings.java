
import java.util.*;

public class Main{
    
	public static void main(String[] args) {
	    
		Scanner su = new Scanner(System.in);
		
		String name = su.nextLine();
		
		String surname = su.nextLine();
		
	if(name.compareTo(surname) == 0){
	    
	    System.out.println("Equal");
	    
	}
	
	else{
	    
	    System.out.println("Not Equal");
	    
	}
		
	}
	
}
