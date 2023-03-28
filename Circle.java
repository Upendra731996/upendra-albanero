
//2. Create a class Circle and use inheritance to create another class cylinder
//        from it. Create method for area and volume.
public class Circle {

    public static double area(double r){
        return 3.14*r*r;


    }
    public static double volume (double r,double h){
return 3.14*r*r*h;
    }
}

class cylinder extends Circle{
    public static void main(String[] args) {
        cylinder obj= new cylinder();
//      (  double r) use argument this formate
        double res=obj.area(5);
        System.out.println("area : "+ res);
//for volume inter this formate (double r,double h)
      double ans=  obj.volume(10,10);
        System.out.println("volume :"+ans);
    }



}