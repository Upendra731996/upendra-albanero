import java.util.*;
//List collection

public class Collection01 {
    public static void main(String[] args) {
        List ll=new LinkedList();
        ll.add(10);
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(101);
        ll.add(102);
        ll.add(103);
        System.out.println(ll);


        List obj01= new ArrayList<>();
        obj01.add(10);
        obj01.add(20);
        obj01.add(30);
        obj01.add(40);
        obj01.add(50);
        obj01.add(60);
        for(Object list : obj01){
            System.out.print(list+" ");
        }
        for(int i=0;i<obj01.size();i++){
            System.out.print(obj01.get(i)+" ");
        }
        System.out.println();
        Iterator it = obj01.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }

        System.out.println();
        System.out.println(obj01);



        List vec =new Vector();
        vec.add("abc");
        vec.add(55.2);
        vec.add(88);
        vec.add(55.f);
        vec.add(66);
        vec.add(99);
        vec.add("albanero");
        vec.add(55);
        System.out.println(vec);
Stack st= new Stack();
for (int i=0 ; i<20; i++){
    st.add(i*4);
}
        System.out.println(st);

    }
}
