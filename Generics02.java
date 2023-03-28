import java.util.*;

public class Generics02 {
    public static void main(String[] args) {
        List  <String> str = new LinkedList();
        str.add("upendra");
        str.add("rohan");
        str.add("gupta");
        str.add("hanuman gupta");
//        str.add(10); when we uncomment this line so this line will thro error
        System.out.println(str.get(1));
    }
}
