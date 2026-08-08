import java.util.Scanner;
class Students {
    int id;
    int roll_no;
    String name;
    int subject;
    int marks[];
    int totalMarks;
    int sum = 0;

    Scanner sc = new Scanner(System.in);
    Students(int id,int roll_no,String name,int subject){
        this.id =id;
        this.roll_no = roll_no;
        this.name = name;
        this.subject = subject;
        marks = new int[subject];
    }
    public void displayDetails(){
        System.out.println("id: " +id + " roll_no: " + roll_no + " name: " +name);
    }
    public void collectMarks(){
         System.out.println("Enter total marks of each subject: ");
        totalMarks =  sc.nextInt();
         System.out.println("Enter marks: ");
        for (int i =0;i<subject;i++){
             System.out.println("Enter marks for subject " +(i+1));
         marks[i]=  sc.nextInt();  
        }
    }
    public void displayGrade(){
        for (int i = 0; i<subject;i++){
            sum+=marks[i];
        }
        float p;
        p = ((float)sum)/(float)(subject*totalMarks);
        float percentage = p*100;
        if(percentage>=90){
             System.out.println("O grade");
        }
        else if(percentage>=80){
             System.out.println("A grade");
        }
        else if(percentage >=70){
             System.out.println("B grade");
            
        }
        else if(percentage >=60){
             System.out.println("C grade");
        }
        else{
             System.out.println("D grade");
        }
    }
    
    public static void main(String[] args) {
     
     Students s  = new Students(1223,39,"Hima",4);
     s.displayDetails();
     s.collectMarks();
     s.displayGrade();
    }
}