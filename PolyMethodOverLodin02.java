public class PolyMethodOverLodin02 {

    public static void method01(int a,String name){
        System.out.println(a+"," +name);
    }
    public static void method01(int a,double b){
        System.out.println(a+"this is function second meth "+" ");

    }

    public static void main(String[] args) {
        method01(10,"upendra");
        method01(12,12.4);
    }
}
