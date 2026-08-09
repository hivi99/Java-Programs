import java.util.Scanner;
public class Viva{
  private  int top;
    private int [] stack;
    private int size;
    Scanner sc = new Scanner(System.in);
public Viva(int size){
    this.size = size;
    stack = new int[size];
    top = -1;
}
    public boolean isEmpty(){   
        if(top==-1)
        return true;
    else 
        return false;
    }
    public boolean isFull(){
        return (top==size-1);
    }
    public  void EnteredStudent(int roll_no){
        if(isFull()){
            System.out.println("Viva slot exceeded");
            return;
        }
          
        top++;
        stack[top]=roll_no;
         System.out.println("Succesfully added roll_no :" +stack[top]);
    }
    public void Vivacompleted(){
        if(isEmpty()){
            System.out.println("No student available for viva");
            return;
        }
        int temp;
        temp = stack[top];
        top--;
        System.out.println("Viva of roll_no " +temp + " successfully completed");
    }
    public void display(){
        if(isEmpty()){
              System.out.println("No student available");
            return;    
        }
         System.out.println("It contains following sequence of students with roll_no for viva: ");
        for(int i=top;i>=0;i--){
             System.out.println(stack[i]);
        }
    }
    public static void main(String[] args){
        Viva b  = new Viva(3);
        b.EnteredStudent(20);
        b.EnteredStudent(12);
        b.EnteredStudent(13);
        b.display();
        b.Vivacompleted();
        b.display();
    
    }     
}