public class InheritanceMultiLevel {
    public static void Meth01(){
        System.out.println("this is InheritanceMultiLevel class method out put ");
    }
}
 class AA extends InheritanceMultiLevel
 {
    public  void Meth02(){
        System.out.println(" this is AA class method");
    }
}
class B extends AA
{
public static void Meth03(){
    System.out.println(" this is B class method");
}
    public static void main(String[] args) {

        B obj=new B();
        obj.Meth01();
        obj.Meth02();
        obj.Meth01();
    }

}
