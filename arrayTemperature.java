import java.util.Scanner;
public class arrayTemperature{
    int[ ] a ;
    int size;
    int sum=0;
    int avg;
    Scanner sc = new Scanner(System.in);
    arrayTemperature(int size){
        this.size = size;
         a = new int[size];
    }
    public void collectTemperature(){
        for(int i=0;i<size;i++){
            System.out.println("Enter temperature for day " +(i+1));
            a[i]=sc.nextInt();
        }
    }
    public void display(){
         System.out.println("Displaying temprature" );
        for(int i =0;i<size;i++){ 
            System.out.println("Temperature at day" +(i+1));
            System.out.println(a[i]);
        }
    }
        public void retrieveTemperatureAtDay(int day){
            for(int i=0;i<size;i++){
                
                if(i==(day-1)){
                    
                    System.out.println("Temperature at day " +(i+1));
                    System.out.println(a[i]);
                break;
                }
            }   
        }
        public void average(){
              for(int i =0;i<size;i++){
        sum += a[i];
        }
avg = sum/size;
System.out.println("The average temperature is "+avg);
        }
        public void hottestColdest(){
            int max = a[0];
            int min = a[0];
            int temp=0;
            int temp2=0;
              for(int i =0;i<size;i++){
        if(a[i]>max){
             temp = i;
            max = a[i];
        }
        }
        System.out.println("Hottestday is day " +(temp+1));
         for(int i =0;i<size;i++){
        if(a[i]<min){
            min = a[i];
            temp2 =i;     
        }
        }
        System.out.println("Coldestday is day " +(temp2+1));    
        }
        public void search(int data){
            for(int i =0;i<size;i++){
        if(a[i]==data){
             System.out.println("Temperature " +data +" occured during day " +(i+1));
             return;      
        }  
        }
         System.out.println("temperature "+data +" did not occur ");
   
        }
        public void stimulateMissingData(int day){
int i;
i = day - 1;
a[i]=-1000;
        }
        public void updateMissingdata(int day,int temp){
            
            int i;
i = day - 1;
            if(a[i]==-1000){

a[i]=temp;
            }
            else{
                System.out.println("Temperature already exists");
            }
        }
        public boolean threshold(int temp){
            for(int i = 0; i<size;i++){
                if(a[i]>temp)
                return true;       
            }
            return false;     
        }
        public static void main(String[] args){
            arrayTemperature m = new arrayTemperature(30);
           m.collectTemperature();
           m.threshold(35);
            m.display();
            m.average();
            m.search(32);
            m.retrieveTemperatureAtDay(7);
            m.hottestColdest();
            m.stimulateMissingData(15);
            m.updateMissingdata(15,32);
            m.retrieveTemperatureAtDay(15);
        }
    }