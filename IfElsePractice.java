import java.util.Scanner;
public class IfElsePractice {





    public static void main(String[] args) {
        //===================================
//        Q print the day name if user enter one so print monday and enter two so print tuesday
//        like thate so on
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int i=sc.nextInt();
//        System.out.println("enter the inetgere vale (1-7)for show the day ");
//        int day=sc.nextInt();
//
//        if(day==1){
//            System.out.println("monday");
//        }
//        else if (day==2){
//            System.out.println("tuesday");
//        }
//else  if (day==3){
//            System.out.println("wednesday");
//        }
//        else  if (day==4){
//            System.out.println("thrusday");
//        }
//        else  if (day==5){
//            System.out.println("frieday");
//        }
//        else  if (day==6){
//            System.out.println("saturday");
//        }
//        else  if (day==7){
//            System.out.println("sunday");
//        }
//        else {
//            System.out.println("enter the valid value 1 to 7");
//        }
        //=====================================

//        Q take the value from usert if user is enter value multiple of 3 print foo
//                or multiple 5 print ff or multiple of both so print fooff

         if (i%15==0){
            System.out.println("fooff");
        }
         else if (i%3==0){
       System.out.println("foo");
   }
   else if (i%5==0){
       System.out.println("ff");
   }
   else {
             System.out.println(" this value is not multiple of 3 and 5");
         }


    }
}
