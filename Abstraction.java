package Abstraction;



 abstract class AbstractClass {

    public abstract void userName();
    public abstract void car();
    public abstract void home();

    public static void mobileNo(){

    }


    public void rent() {

    }

}





package Abstraction;

public class concretClass extends AbstractClass {

    @Override public void userName(){
        System.out.println("This is userName");
    }

    @Override public void car(){System.out.println("This is car");}

    @Override public void home(){System.out.println("this is home");}

    public static void mobileNo(){
        System.out.println("This is mobile no.");
    }

    public void rent(){System.out.println("This is rent");}

    public static void main(String[]args){
        concretClass d = new concretClass();
        d.rent();
        d.userName();
        d.car();
        d.home();
        mobileNo();
    }

}
