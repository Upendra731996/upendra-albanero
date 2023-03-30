public class PracticeProblem {

    ////    check palindrom
//public static boolean meth01(String str){
//    str= str.replaceAll("[^a-zA-Z0-9]","");
//    str= str.toLowerCase();
//    int i=0;
//    int j=str.length()-1;
//    while (i<j){
//        if(str.charAt(i)!=str.charAt(j)){
//            return false;
//
//        }
//        i++;
//        j--;
//    }
//
//    return true;
//
//}
//
//    public static void main(String[] args) {
//        String str="upen#ne  pU";
//        System.out.println( meth01(str));
//
//
//    }
    //========================================================
////    fibonaci series
//
//    public static int  fibonaci(int n){
//
//        if (n<=2){
//            return 1;
//        }
//         ;
//
//        return fibonaci( n-1)+fibonaci(n-2);
//    }
//public static void main(String[] args) {
//
//    System.out.println(fibonaci(20));;
//
//}
    //===============================================

//    //ttps://www.javatpoint.com/armstrong-number-in-java
////    problem armstrong number
//    public  static boolean armstrong(int n){
//        int  sum=0;
//        String str=  Integer.toString(n);
//        for (int i=0; i<str.length(); i++){
//            int num = Character.getNumericValue(str.charAt(i));
//            sum+=num*num*num;
//
//        }
//        if (sum==n){
//            return true;
//        }
//        else {
//            return  false;
//        }
//
//
//
//
//
//    }

//    public static void main(String[] args) {
//        System.out.println(armstrong(15));
//    }


    //===================================
//    print the pattern


    public static void main(String[] args) {

        for (int i=0; i<6; i++){
            for (int j=0; i>j; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
