public class Traffic{
     String current =  "Red";
     boolean running = true;
     int count = 0;
        public void timer(String color,int seconds){
            for(int i=seconds;i>=0;i--){
System.out.println("Remaining time for signal" +color + ": " +i);
            }
        }
            public void traffic(){

            
            while(running){
    switch(current){
        case "Red":
            System.out.println("Stop");
            timer("Red",20);
            current = "Green";
            break;
            case"Green":
               System.out.println("Move");
            timer("Green",20);
            current = "Yellow";
            break;
            case "Yellow":
                   System.out.println("wait");
             timer("Yellow",10);
            current  = "Red";
           
            count++;
            if(count==2)
                running = false;
            break;
            default:
                   System.out.println("Invalid");
                   running = false;
                   break;
    }
}
            }
        
    public static void main(String[] args){
        Traffic t = new Traffic();
        t.traffic();

      
    }
}