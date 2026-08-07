public class Threadpractice{
    public static void main(String[] args){
        System.out.println("===Apllication Started===");
        Task t = new Task();
        t.start();
        //job3
        for(int i=1;i<=1000;i++){
            System.out.println("Printing  docs: " +i);
        }
         /*  Task t = new Task();
        t.start(); if we would write line 9 and 10 here after job 3(main thread ka task) main thread ka task
        hota then compailer ko pata chalta ki arey thread chalu krna hai so place it before the main thread ka task */ 
       // t.executeTask();

        System.out.println("===Application Finished===");
    }
}
//class Task{
          //  void executeTask(){
          //  for(int doc =1;doc<=10;doc++){
           //     System.out.println("@@Printing docs2:" +doc);
         //   }
    //    }
   // }
   class Task extends Thread{
    @Override
    public void run(){
            for(int doc =1;doc<=1000;doc++){
               System.out.println("@@Printing docs2:" +doc);
            }
        }

   }