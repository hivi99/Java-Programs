/*Airport Operations and Passenger Services 
Circular Queue – Baggage Carousel System 
Bags are placed on a conveyor belt that continuously loops around the baggage collection area. 
Passengers collect their luggage as the carousel rotates. 
Simulate insertion and removal of baggage using a circular queue. 
Demonstrate how circular queues reuse available memory locations without shifting elements. Learning Outcome: Students understand efficient memory utilization and continuous processing using circular queues. 
Priority Queue – Emergency Flight Scheduling 
Flights are scheduled for takeoff and landing operations. 
Emergency flights such as medical evacuation aircraft and VIP flights are assigned higher priority than regular commercial flights. 
Simulate scheduling decisions using a priority queue. 
Compare execution order based on priority rather than arrival time. 
Learning Outcome: Students understand how priority queues process critical tasks before routine tasks. 
Double-Ended Queue (Deque) – Airport Shuttle Service 
Passengers may board airport shuttle buses from either the front or rear boarding point. 
Shuttle buses may be dispatched from either end depending on traffic conditions and passenger demand. 
Perform insertion and deletion operations from both ends of the deque. 
Analyse scenarios where flexibility in servicing improves system efficiency. 
Learning Outcome: Students understand how deques support insertion and deletion at both ends and are useful in dynamic transportation systems. 
*/
public class AirportSystem{
 static  class Carousel{
int front;
int rear;
int size;
int queue[];
public Carousel(int size){
    this.size= size;
    queue =new int[size];
    front=-1;
    rear=-1;


}
public boolean isFull(){
    return front==(rear+1)%size;
}
public boolean isEmpty(){
    return front==-1;
}
public void addBag(int bag_no){
    if(isFull()){
        System.out.println("No remaining slots for bags,come again later");
        return;
    }
    if(front==-1){
        front=0;
        rear=0;
    }
    else{
            rear=(rear+1)%size;
    }
    queue[rear]= bag_no;
    System.out.println("Bag with bag_no " +bag_no+ " added");

}
public void removeBag(){
    if(isEmpty()){
        System.out.println("No bag to remove!");
        return;
    }
    int temp;
    temp = queue[front];
    if(front==0 && rear ==0){
        front=-1;
        rear=-1;
    }
    else{
    front = (front+1)%size;}
    System.out.println("Bag_no "+temp+ " removed");
}
public void displayBags(){
    if(isEmpty()){
        System.out.println("No bags to display");
    }
   

    int i=front;
  System.out.println("Carousel contains the following bags: ");
    while(i!=rear){
        System.out.println("Bag with bag_no: " +queue[i]);
        i=(i+1)%size;
    }
    System.out.println("Bag with bag_no: "+queue[rear]);
  }
}
  static class ShuttleService{
    int front;
    int rear;
    int q[];
    int size;
  
 public ShuttleService(int size){
    this.size = size;
    front=-1;
    rear =-1;
    q = new int[size];
 }
  public boolean isdequeEmpty(){
    return front==-1;
}
public boolean isdequefull(){
    return front==(rear+1)%size;
}
  public void boardfront(int passenger){
    if(isdequefull()){
        System.out.println("Bus completely boarded, take another bus!");
        return;
    }
    if(front==-1){
        rear=0;
        front=0;
    }
    else{
        front = (front-1+size)%size;
    }
    q[front]=passenger;
System.out.println("Passeneger with passengerid " +q[front]);

}
public void boardrear(int passenger){
    if(isdequefull()){
        System.out.println("Bus completely boarded, take another bus!");
        return;
    }
    if(front==-1){
        front=0;
        rear=0;
    }
    else{
        rear = (rear+1)%size;
    }
    q[rear]=passenger;
    System.out.println("Passeneger with passengerid " +q[rear] + " added");

}
public void deleterear(){
    if(isdequeEmpty()){
        System.out.println("No one in bus");
        return;
    }
    int temp;
    temp = q[rear];
    if(front==rear){
        front =-1;
        rear = -1;
    }
    else{
        rear = (rear-1+size)%size;
    }
    System.out.println("Passenger no.: "+temp+" exited");
}
    public void deletefront(){
    if(isdequeEmpty()){
        System.out.println("No one in bus");
        return;
    }
    int temp;
    temp = q[front];
    if(front==rear){
        front =-1;
        rear = -1;
    }
    else{
        front = (front+1)%size;
    }
    System.out.println("Passenger no.: "+temp+ " exited");
}
public void displayPassengers(){
    if(isdequeEmpty()){
        System.out.println("No passenger to display");
    }
   

    int i=front;
  System.out.println("Bus contains the following passengers: ");
    while(i!=rear){
        System.out.println("Passenger with passenger_no: " +q[i]);
        i=(i+1)%size;
    }
    System.out.println("Passenger with passenger_no: "+q[rear]);

  }
}

static class EmergencySystem{
   
   Flight pq[]; 
    int size;
    int currentsize;
  int max;
  int maxIdx=0;
    int rear;
    static class Flight{
   
       int id;
       int priority;
      
      public Flight(int id,int priority){
this.id = id;
this.priority=priority;
       }
    }
    public EmergencySystem(int size){
        this.size = size;
     currentsize=0;
        rear=-1;
        pq = new Flight[size];
    }
public boolean ispqEmpty(){
return currentsize==0;

}
public boolean ispqFull(){
    return currentsize==size;
}
public void insert(int flight,int priority){
    if(ispqFull()){
        System.out.println("No more emergency flight can be added");
        return;
    }
    
    pq[currentsize]=new Flight(flight,priority);

    currentsize++;
}


public void delete(){
if(ispqEmpty()){
    System.out.println("No emergency flight to be deleted");
    return;}
   
    for(int i=0;i<currentsize;i++){
if(pq[i].priority>pq[maxIdx].priority){
   
    maxIdx=i;
}
System.out.println("dispatching the flight "+pq[i].id+" with priority"+pq[i].priority);
  pq[maxIdx]=pq[currentsize-1];
  pq[currentsize-1]=null;
  currentsize--;  
}



}
public void display(){
    if(ispqEmpty()){
    System.out.println("No emergency flight to be displayed");
    return;
}
 System.out.println("Following flights are contained: ");
    for(int i=0;i<currentsize;i++){
        System.out.println("Flight with id: " +pq[i].id +" flight's priority "+pq[i].priority);
    }
}

}

  
    public static void main (String[]args){
      AirportSystem.Carousel c = new AirportSystem.Carousel(3);
        c.addBag(32);
        c.addBag(23);
        c.addBag(12);
     c.addBag(92);
   
    c.displayBags();
    c.removeBag();
    c.addBag(92);
    c.displayBags();

    AirportSystem.ShuttleService s = new AirportSystem.ShuttleService(3);
    s.boardfront(23);
     s.boardfront(13);
      s.boardrear(3);
      s.displayPassengers();
      s.boardrear(2);
      s.deletefront();
      s.deleterear();
      s.displayPassengers();

      AirportSystem.EmergencySystem e = new AirportSystem.EmergencySystem(3);
      e.insert(20,5);
      e.insert(30,3);
      e.insert(50,2);
      e.display();
      e.delete();
      e.display();
      e.insert(30,7);
      e.display();
    }
}


