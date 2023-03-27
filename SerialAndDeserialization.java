//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

//public class SerialAndDeserialization {
////    public static void main(String args[]){
////        System.out.println("this worlds");
////        FileOutputStream fle = new FileOutputStream("e:");
////        ObjectOutputStream obj = new ObjectOutputStream();
////        obj.write(fle);
////
////    }
//}


public class SerialAndDeserialization implements Serializable{
    int id;
    String name;
    public SerialAndDeserialization(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Sclass{

    public static void main(String[] args) throws Exception{
        SerialAndDeserialization obj=new SerialAndDeserialization(10,"upendra");
        FileOutputStream str=new FileOutputStream("text.txt");
        ObjectOutputStream out= new ObjectOutputStream(str);
        out.writeObject(obj);
        out.flush();
        System.out.println();
    }
}