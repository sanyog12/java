

public class Main
{
    public static void subSequence(String str, int index, String newString){
        
        if(index == str.length()){
            
            System.out.println(newString);
            return;
            
        }
        
        char currChar = str.charAt(index);
        subSequence(str, index+1, newString+currChar);
        
        subSequence(str, index+1, newString);
    }
    
	public static void main(String[] args) {
	    
		String str = "abc";
		subSequence(str, 0 , "");
		
	}
}
