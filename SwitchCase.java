
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int x ,y;
        switch (num){
            case "mul":
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println(x*y);
                break;
            case "add":
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println(x+y);
                break;
            case "sub":
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println(x-y);
                break;
            case "div":
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println(x*y);
                break;
            default:
                System.out.println("its default");
        }
    }
}
