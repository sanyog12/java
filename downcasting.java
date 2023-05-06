package nonPrimitiveCasting;

public class upcastingParent {

    public void nord(){
        System.out.println("nord: parent");
    }

    public void web(){
        System.out.println("web: parent");
    }

}



package nonPrimitiveCasting;

public class upcasingChild extends upcastingParent{

    public static void main(String args[]){

        upcastingParent h = new upcasingChild();		//Downcasting
        upcasingChild r = (upcasingChild)h;			// we do typecasting in order to achive downcasting
        r.nord();
        r.web();
        r.design();
        r.develop();
    }

    public void design(){
        System.out.println("design: child");
    }

    public void develop(){
        System.out.println("develop: child");
    }

}
