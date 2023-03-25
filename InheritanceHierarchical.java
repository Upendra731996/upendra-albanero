public class InheritanceHierarchical {
    public void method(){
        System.out.println("this is Parent class method");
    }
}
 class Aaa extends InheritanceHierarchical {
    public void Meth05(){
        System.out.println("this is Aaa class method out put");
    }
}
class Bbb extends InheritanceHierarchical{
    public static void meth10(){
        System.out.println("this is Bbb class method");
    }
    public static void main(String[] args) {

        Bbb child01= new Bbb();
        child01.method();
        child01.meth10();

        System.out.println("===========after Baa class object==============");
        Aaa obj02=new Aaa();
        obj02.Meth05();
        obj02.method();

    }
}