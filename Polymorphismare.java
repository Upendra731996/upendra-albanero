
//How many types of polymorphismare there in java.Give their names with examples.
//  there are two type of Polymorphismare
//1:methodOverloding
//2:method overriding


//this is methodoverrloding
// for achive methodoverrloding methodoverrloding have some rull
//1: save class
//2:same same method name
//3:diferent argument

public class Polymorphismare {

    public static void meth(String name){
        System.out.println(name+ " this is first method output");
    }
    public static void meth(int num){
        System.out.println(num + " this is onother meth");
    }

    public static void main(String[] args) {
        Polymorphismare obj= new Polymorphismare();
        obj.meth("upendra");
        obj.meth(10);
    }

}
