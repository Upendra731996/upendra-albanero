public class CallByReference {
    public static void meth01(RefClass obj){
//        in wich checking it proper referencing or not
        obj.name="hanuman";
        obj.roll=1;
        System.out.println(obj.name);
        System.out.println(obj.roll);
    }
    public static void main(String[] args) {
//        this object of class thro the
        RefClass obj =new RefClass();
        obj.name="upendra";
        obj.roll=113;
// passing the reference(obj) as a argument
        meth01(obj);
        System.out.println(obj.name);
        System.out.println(obj.roll);

    }

//     this is another class for object creating
    public static class RefClass{
String name;
int roll;
    }
}


