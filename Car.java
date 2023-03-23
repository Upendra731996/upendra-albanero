
public class Car {
    public static void main(String[] args){
        Car maruti=new Car("black");
        Car ferrari=new Car("red");
        System.out.println(ferrari.no_of_tyres);
    }


    int no_of_tyres;
    String Color;
    int no_of_brake;
    Car(String Color)
    {
        this.Color=Color;
        this.no_of_brake=1;
        this.no_of_tyres=4;

    };
}
