import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Readfromfile{
    public static void main(String[] args){
        try{
            File f = new File("C:\\Users\\santo\\OneDrive\\Desktop\\file1.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);

            }
            sc.close();


        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}