
// step first extends the Thread class
public class ThreadingClass extends Thread{
//    step second overrid the run method
    public void run(){
        System.out.println("this is thread run method");
    }

    public static void main(String[] args) {
//        step third creat obj of class ThreadingClass(user writen class)
        ThreadingClass tc=new ThreadingClass();
//        step fourth invoke the run method through start method
        tc.start();
    }
}

