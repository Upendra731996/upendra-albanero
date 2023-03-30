// print prime number using inheritance
public class InheritSingleLevel {
    public static boolean Prime(int n){
        for (int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

}
class Solution extends InheritSingleLevel
{
    public static void main(String[] args) {

        Solution p=new Solution();

        int num=25;
        for (int i=2; i<=num; i++){
            boolean check=p.Prime(i);
            if(check){
                System.out.println(i);
            }
        }

    }


}