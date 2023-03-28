//3. How to achieve encapsulation in java. Give Example.

//ANS: we can achive the encapsulation thorgh the seter method and grtermethod
//why use enencapsulation: for detai hiding and data binding to gether and security puspose
public class Encapsulation01 {

    private int num;


    public void setData(int num){

        num=num;

    }
    int getData(){
        System.out.println(num);
        return num;
    }


    public static void main(String[] args) {
        Encapsulation01 obj=new Encapsulation01();
        obj.setData(10);
        System.out.println(obj.getData());
    }
}
