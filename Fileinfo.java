import java.io.File;
public class Fileinfo{
    public static void main(String[] args){
    File f1 = new File("C:\\Users\\santo\\OneDrive\\Desktop\\file1.txt");
if(f1.exists()){
    System.out.println("filename " +f1.getName());
    System.out.println("writeable " +f1.canWrite());
System.out.println("readable " +f1.canRead());
System.out.println("absolute path " +f1.getAbsolutePath());
System.out.println("length " +f1.length());
}
else{
    System.out.println("file does not exist");
}
    }
}