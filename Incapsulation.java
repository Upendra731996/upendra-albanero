public class Incapsulation {
    private int num;

    public void setData(int n){
        num=n;
    }
    public  int getData(){
        return num;
    }
}
class Test{
    public static void main(String[] args) {
        Incapsulation obj=new Incapsulation();
        obj.setData(100);
        System.out.println(obj.getData());
    }
}
