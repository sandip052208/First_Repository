import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InvalidClassException;

public class Test {
    public static void main(String args[]){
        Object obj = null;
        try{
            FileInputStream fis = new FileInputStream("E:\\Java_Practice\\Practice.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            fis.close();

        }catch (IOException io){
            System.out.println(io);
        }catch (ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        System.out.println(obj);
        System.out.println("Successfull");
    }
}