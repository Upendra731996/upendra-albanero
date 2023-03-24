public class MethodCallByValue {
//    whenever we call the method with passing anrgument of primitive data type
//    so that is  called call by value for exaple bellow code
//    and we re-assined so it will change only there
    public static void animal(int num){
        num=20;
        System.out.println(num);
    }


    public static void main(String[] args) {
        int b=10;
        animal(b);
    }



}
