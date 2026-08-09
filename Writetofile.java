import java.io.FileWriter;
import java.io.IOException;
public class Writetofile{
    public static void main(String[] args){
        try{
    FileWriter f2 = new FileWriter("C:\\Users\\santo\\OneDrive\\Desktop\\file1.txt",true);
  //add second parameter as true if you dont want previous content to be altered
    f2.write("hell world ,programming is becoming more difficult day by day");
    f2.close();
    System.out.println("success in printing message in file");
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
}

}