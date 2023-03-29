import java.lang.reflect.Method;

interface InterFace01 {

    public void Meth01();

}
 class Hello implements InterFace01 {
 public void Meth01(){
     System.out.println("interface code");
  }

     public static void main(String[] args) {
     Hello obj=new Hello();
        obj.Meth01();
     }
}

