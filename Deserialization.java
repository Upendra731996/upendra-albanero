import java.io.FileInputStream;
import java.io.*;


public class Deserialization {


    public static void main(String[] args) throws Exception{
        FileInputStream fileIn = new FileInputStream("text.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SerialAndDeserialization  data= (SerialAndDeserialization) in.readObject();
        in.close();
        fileIn.close();
        System.out.println(data.name);
    }
}