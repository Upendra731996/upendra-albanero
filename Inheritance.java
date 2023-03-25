public class Inheritance {
    void animal(){
        System.out.println("this is parent class");
    }
}
 class A extends Inheritance
 {
     void ChildMethod(){
         System.out.println("this is child class method");
     }
     public static void main(String[] args) {
         Inheritance obj01=new Inheritance();
         obj01.animal();
//         we can not call child   class method through  the parent clas object
//         but we can call the parent class method through the child class object
//         NOTe constructor and private method inherit nahi hota hai
//         because contructor clas ka part nahi hota hai
         A obj02= new A();

         obj02.ChildMethod();
         obj02.animal();


     }

}