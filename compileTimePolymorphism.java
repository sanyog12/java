package laudaLassun;

public class compileTimePolymorphism
{
    public static int add(int a){
        return a;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
        System.out.println(add(1));
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
