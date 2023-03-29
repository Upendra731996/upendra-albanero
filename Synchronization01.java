
// bolock level Synchronion



class Check{
    public synchronized void mul(){
        for (int i=0; i<20;i++){
            System.out.println(i*10);
        }
    }
}



public class Synchronization01 {

    public  static void Test(int n,Object obj) throws Exception{

      synchronized(obj) {
            int num=10;
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          System.out.println("this is synchronzed area");
          for( int i=0; i<50; i++){
              System.out.println(i);
              Thread.sleep(400);
          }

        }

        System.out.println("this is non synchronzed area");
    };

    public static void main(String[] args) throws Exception{
        Synchronization01 obj= new Synchronization01();
        Check c=new Check();
        obj.Test(10,obj);
        obj.Test(20,obj);
        c.mul();
        System.out.println("this is mm synchronzed area");
    }
}
