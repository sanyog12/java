package laudaLassun;

public class childClass2 {

    public void demo(){
        System.out.println("I am from parent class");
    }
    public static void first(){
        System.out.println("I am from parent but static");
    }

    public static void main(String []args){
    first();
    childClass2 g = new childClass2();
    g.demo();

    }

}




package laudaLassun;

public class overloadMainMethod extends childClass2
{
    public void demo(){
        System.out.println("I am from child class");
    }
    public static void first(){
        System.out.println("I am from child but static");
    }

    public static void main(String[]args){
    first();
    overloadMainMethod h = new overloadMainMethod();
    h.demo();
    }
}
