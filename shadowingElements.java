
public class Main
{
	public static void main(String[] args) {
	    String a = "here hellog";
	    String b = "hola write";
	    
	    if(shadowString(a,b)){
	        System.out.println("shadow");
	    }
	    else{
	        System.out.println("not shadow");
	    }
	}
	public static boolean shadowString(String a,String b){
	    String []string1 =a.split("\\s+"); 
	    String []string2 =b.split("\\s+");
	    
	    if(string1.length != string2.length) return false;
	    
	    for(int i = 0; i < string1.length; i++){
	        if(string1[i].length() != string2[i].length()) return false;
	    }
	    return true;
	}
}
