
//for method overriding have  some point
//1:same method
//2;different class
//3: same argument
//        i:no of args
//ii:type of args
//iii:seq of args
//4:inheritance( Is-a retionship)
public class PolyMethodOverridin01 {
    public static void show(int num,String name){
        System.out.println(" this is firs method"+ num+"name");

    }
}

class Animal extends PolyMethodOverLodin03
{

    public static void show(int n,String city){
        System.out.println(" thhis is second method in differnt class");
    }

    public static void main(String[] args) {

        PolyMethodOverridin01 obj1= new PolyMethodOverridin01();
        obj1.show(10,"upendra");

        Animal obj02=new Animal();
        obj02.show(22,"bihar");
    }


}
