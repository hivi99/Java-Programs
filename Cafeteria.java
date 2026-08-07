public class Cafeteria{
private int token_id;
private int front;
private int rear;
private int queue[];
private int capacity;

public Cafeteria(int capacity){
this.capacity = capacity;
queue = new int[capacity];
front=-1;
rear =-1;
token_id = 0;

}

public boolean isEmpty(){
if(front==-1)
return true;
return false;
}
public boolean isFull(){
if(rear==capacity-1){
return true;
}
return false;
}
public void ArrivedCustomer(){
if(isFull()){
System.out.println("All slots are reserverd,come again later after sometime!");
return;

}
if(front==-1){
front=0;
rear=0;
}
else{
    rear++;
token_id++;
}

queue[rear]=(token_id+1);
System.out.println("Arrived customer assigned token id : " +(token_id+1));



}
public void CompletedCustomer(){
if(isEmpty()){
System.out.println("No customer for order completion process");
return;
}

int temp;
temp= queue[front];
if(front==0 && rear==0 ){
    front=-1;
    rear=-1;
}
else{
front++;}
System.out.println("Order of customer with token_id " +temp + " completed");
}
public void display(){
    if(isEmpty()){
        System.out.println("No customers to display!");
        return;
    }
System.out.println("The following is the sequence:");
for(int i = front;i<=rear;i++){
System.out.println("Customer with token_id " +(i+1));
}

}
public static void main(String[] args){
Cafeteria c = new Cafeteria(5);
c.ArrivedCustomer();
c.ArrivedCustomer();
c.ArrivedCustomer();
c.ArrivedCustomer();
c.ArrivedCustomer();
c.ArrivedCustomer();
c.display();
c.CompletedCustomer();
c.display();
}




}
