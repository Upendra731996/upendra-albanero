//note : method overridoing me child class ka acess modifier jada acceseble  rhna chahia ya equal
// and return type bhi different ho sakta hai but uska some rull hai like object parent class me hai to uska child
//class metod String ho sakta hai or rull hai

 class PolyMethodOverridin02 {
    public static Object test(){
        return null;
    }

}

class Overridin extends PolyMethodOverridin02{

  public static  String test(){
      return "upendra";
  }



    public static void main(String[] args) {
        PolyMethodOverridin02 obj01=new PolyMethodOverridin02();
        System.out.println(obj01.test());
        Overridin obj02=new Overridin();
        System.out.println(obj02.test());


    }
}

