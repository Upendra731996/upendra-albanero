public class java2 {
//    public static int  fun01(int a){
//        return a;
//    };
    int age;
    String name;

    public java2(int age,String fname){
        this.name=fname;
        this.age=age;
        System.out.println(this.age);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
//        System.out.println(fun01(10));
        System.out.println(a + b);
        java2 fname = new java2(25, "upendra");
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }}
