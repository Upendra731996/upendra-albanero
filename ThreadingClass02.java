// creating thread through the runnable interface

public class ThreadingClass02 implements Runnable{
    public void run(){
        System.out.println("thread task");
    }

    public static void main(String[] args) {
        ThreadingClass02 t=new ThreadingClass02();

        Thread th=new Thread(t);
        th.run();
        th.run();


    }

}
