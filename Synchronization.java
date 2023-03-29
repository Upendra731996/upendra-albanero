// method level Synchronization


public class Synchronization {

    public  synchronized void run(int n){

        int amount =50;
        int num =amount-n;
        if(num<0){
            System.out.println("insuficiant money");

        }

        System.out.println(num);
    }

    public static void main(String[] args) {
        Synchronization test=new Synchronization();
        for(int i=0; i<5; i++){
            test.run(7);
            test.run(56);
    }

}}
