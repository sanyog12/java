import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "sient";
		
		char ss1[] = s1.toCharArray();
		char ss2[] = s2.toCharArray();
		
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		int flag = 0;
		if((ss1.length) == (ss2.length)){
		for(int i = 0; i < ss1.length; i++){
		    if(ss1[i] == ss2[i]){
		        continue;
		    }
		    else
		    flag = 1;
		    
		}
		}
		else{
		    flag = 1;
		}
		if (flag ==1){
		    System.out.print("they are not anagram");
		}
		else
		System.out.println("they are anagram");
	}
}
