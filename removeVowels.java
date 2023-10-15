https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118626/offering/1377977?leftPanelTab=0








import java.util.* ;
import java.io.*; 
public class Solution {
	public static String removeVowels(String str) {
	 // Write your code here.
	 StringBuilder sb = new StringBuilder();
	 for(int i = 0; i < str.length(); i++){
		 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
			 continue;
		 }
		 sb.append(str.charAt(i));
	 }
	 return sb.toString();
	}
}
