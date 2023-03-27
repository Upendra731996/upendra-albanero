import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;


public class Deserialization {

    public static void main(String[] args) throws Exception{
        FileInputStream fileIn = new FileInputStream("text.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Sclass  bb = (Sclass) in.readObject();

        in.close();
        fileIn.close();
        System.out.println(Sclass.name);
    }
}