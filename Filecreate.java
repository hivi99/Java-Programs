import java.io.File;
import java.io.IOException;
public class Filecreate{
    public static void main(String[] args){
        File myobj = new File("C:\\Users\\santo\\OneDrive\\Desktop\\file1.txt");
        try{
if(myobj.createNewFile()){
    System.out.println("new file created ");
}
else{
    System.out.println("file already exist");
}

    }
    catch(IOException e){
        System.out.println("error occured");
        e.printStackTrace();

    }
}
}