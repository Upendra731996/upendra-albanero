// different argument pass in method call

public class PolyMethodOverLodin03 {

    public static void function(double num){
        int a=10;
        System.out.println("this is first function sum of integer and double"+a+num);
    }
    public static void function(){
        System.out.println("this is method without any argument");
    }

    public static void main(String[] args) {
        function();
        function(10.5);
    }
}
