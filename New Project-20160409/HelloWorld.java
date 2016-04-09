import java.io.*;

public class HelloWorld{

     public static void main(String []args){
        Console co = System.console();
        try 
        {
            String line = co.readLine();
            System.out.println("line : " + line);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
     }
}
