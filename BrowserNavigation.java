import java.util.Scanner;
public class BrowserNavigation{
  private  int top;
    private String [] stack;
    private int size;
    Scanner sc = new Scanner(System.in);
public BrowserNavigation(int size){
    this.size = size;
    stack = new String[size];
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
    public  void visited(){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
         System.out.println("Enter url: ");
        String url;
        url = sc.nextLine();   
        top++;
        stack[top]=url;
         System.out.println("Succesfully added :" +stack[top]);
    }
    public void back(){
        if(isEmpty()){
            System.out.println("Stack is empty,error");
            return;
        }
        String temp;
        temp = stack[top];
        top--;
        System.out.println("Removed " +temp + "successfully");
    }
    public void display(){
        if(isEmpty()){
              System.out.println("Stack is empty,error");
            return;    
        }
         System.out.println("It contains following url: ");
        for(int i=top;i>=0;i--){
             System.out.println(stack[i]);
        }
    }
    public static void main(String[] args){
        BrowserNavigation b  = new BrowserNavigation(3);
        b.visited();
        b.visited();
        b.visited();
        b.display();
        b.back();
        b.display();
       b.sc.close();
    }     
}