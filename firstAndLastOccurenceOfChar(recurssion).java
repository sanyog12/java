import java.util.*;

 class firstClass{
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String s, int index, char element){
        if(index == s.length()){

            System.out.println(first);
            System.out.println(last);
            return;

        }    

        char ch = s.charAt(index);
        if(ch == element){

        if(first == -1){

            first = index;
        
        }
        else{
        
            last = index;
        
        }

    }

    findOccurence(s, index + 1 , element);
    
}

    public static void main(String args[]){

        String s= "abasaheb";
        findOccurence(s,0,'a');

    }

}
