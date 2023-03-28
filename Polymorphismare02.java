
//methodOverring Polymorphismare
public class Polymorphismare02 {
    public static void show(String name){
        System.out.println("this out put is Polymorphismare02 class");
    }
}

class Test extends Polymorphismare{
public void show(String name){
    System.out.println(" this is test class method output");
}

    public static void main(String[] args) {

        Test t=new Test();
        t.show("upendra");
        Polymorphismare02 t2= new Polymorphismare02();
        t2.show("gupta");
    }
}
