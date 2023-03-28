
//
//        // In generic list we can only stores similler data type.

//
//        // In non-generic list we can stores any types of elements without getting error


import java.util.*;
public  class Generics01 {
    public static void main(String[] args) {

        List <Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.get(2));
        Collections.sort(arr,Collections.reverseOrder());
        List <String> str=new ArrayList<>();
        str.add("upendra");
        str.add("abc");
        str.add("fghj");
        str.add("abc");
//        str.add(50);

        System.out.println(arr);
        System.out.println(str);



    }
}