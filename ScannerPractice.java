import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        scanner class use for take input for user
//        input for integer value
        System.out.println("inter the first value integer type integer");
        int a=sc.nextInt();
        int num=25;
        System.out.println(a+num);
        System.out.println("inter the second value type double");
        double b=sc.nextDouble();
        System.out.println(a+num+b);
//        this is for String type
        System.out.println("inter the third vale type string");
        String str=sc.next();
        System.out.println(str);


    }
}
