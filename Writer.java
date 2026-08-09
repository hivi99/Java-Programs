import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Writer{
    public static void main(String[] args){
       try{
        File f4 = new File("C:\\Users\\santo\\OneDrive\\Documents\\File2.txt");
        Scanner sc = new Scanner(f4);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);

        }
        sc.close();
        
       
        }
       catch(IOException e){
        System.out.println("an error occurs");
        e.printStackTrace();


       }
    }
}