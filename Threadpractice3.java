import java.io.InterruptedIOException;
public class Threadpractice3{
    public static void main(String[] args){
        System.out.println("===Apllication Started===");
        Printer p = new Printer();
        Task t = new Task(p);
        myTask t1 = new myTask(p);
        t.start();
        try{
            t.join();
       
        }
        catch(InterruptedException e){
            System.out.println("error");
            e.printStackTrace();
        }
        t1.start();
       
        System.out.println("===Application Finished===");
    }
}
class Printer{
  
   
    void printDocuments(int i,String doc){
        try{
             Thread.sleep(500);
        for(i=1;i<=10;i++){
            System.out.println("printing document no. " +i+ "for: " +doc);
        }
    }
    catch(InterruptedException e){
        System.out.println("error");
        e.printStackTrace();
    }
    }
    
   }
   class Task extends Thread{
    Printer p1;
    Task(Printer p1){
        this.p1 = p1;
    }
    @Override
    public void run(){
        synchronized(p1){
         p1.printDocuments( 10," +Mira's Profile");
        }
    }
   }
   class myTask extends Thread{
    Printer pr;
    myTask(Printer pr){
        this.pr = pr;
    }
    @Override
    public void run(){
        synchronized(pr){
         pr.printDocuments( 10," @tahir's Profile");
        }
    }
    }
   