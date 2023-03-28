import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetCollection {
    public static void main(String[] args) {
        Set hs=new HashSet();
        for (int i=0; i<10; i++){
            hs.add(i);
        }
        System.out.println(hs);

        Set lhs=new LinkedHashSet();
        lhs.add(5);
        lhs.add(50);
        lhs.add(51);
        lhs.add(52);
        lhs.add(53);
        System.out.println(lhs);


    }
}
