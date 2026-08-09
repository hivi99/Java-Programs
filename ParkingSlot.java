public class ParkingSlot{
    int front=-1;
   int rear=-1;
   int size;
   int queue[];
   public ParkingSlot(int size){
    this.size = size;
    queue = new int[size];
   }
   public boolean isFull(){
    return front==(rear+1)%size;
   }
   public boolean isEmpty(){
    return front==-1;
   }
   public void enteredCar(int reg_no){
if(isFull()){
    System.out.println("All slots are full come later");
    return;
}
rear=(rear+1)%size;
if(front==-1){
    front=0;
    rear=0;
}
 queue[rear]=reg_no;
 System.out.println("car with reg_no" +queue[rear]+ " entered");
 
   }
   public void exitedCar(){
    if(isEmpty()){
        System.out.println("Parking lot is empty");
        return;
    }  
    int temp;
    temp = queue[front];
    if(front==rear){
        rear=-1;
        front = -1;
    }
    else{
    front = (front+1)%size;
    }
    System.out.println("The car with reg_no: " +temp+" exited");
   }
  public void display(){
    if(isEmpty()){
        System.out.println("Nothing to display");
        return;
    }
  int i=front;
  System.out.println("The lot contains the following cars: ");
    while(i!=rear){
        System.out.println("Car with reg_no: " +queue[i]);
        i=(i+1)%size;
    }
    System.out.println("Car with reg_no: "+queue[rear]);
  }
  public  static void main(String[] args){
    ParkingSlot p = new ParkingSlot(4);
    p.enteredCar(1224);
     p.enteredCar(1227);
      p.enteredCar(12290);
       p.enteredCar(12274);
       p.enteredCar(1234);
    p.exitedCar();
    p.display();
  }

}