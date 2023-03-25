public class PolyMethodOverLodin01 {
//    different argument type
    public  void test(int a){
        System.out.println("this is first method"+ a);
    }
    public void test(String name){
        System.out.println("my name is"+name);
    }

    public static void main(String[] args) {
        PolyMethodOverLodin01 obj=new PolyMethodOverLodin01();
//        yeh wah method call karega jisme data type match karega argument pass karte time
        obj.test(10);
    }
}
