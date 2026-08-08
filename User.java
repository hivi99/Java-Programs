import java.util.ArrayList;
public  abstract class User{
        private String Name;
        private String email;
        private int id;
        public abstract void displayReport();
        public User(String Name, int id,String email){
            this.Name = Name;
            this.id = id;
            this.email = email;
            
        }
        public String getName(){
            return Name;
        }
        public int getId(){
            return id;
        }
        public String getEmail(){
            return email;
        }
        public void setName(String Name){
            this.Name = Name;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public static void main(String[] args){

       Student s1 = new Student("hem",12,"hem@gmail.com");
     Professor p1 = new Professor("ram",15,"ram@gmail.com","mechanical");
s1.addMarks(86, 100);
s1.addMarks(90,100);
s1.displayReport();
p1.displayReport();
    }

    }
         class Student extends User{
            private ArrayList<Integer> marks;
            public Student(String Name,int id,String email){
                super(Name,id,email);
                marks = new ArrayList<>();
            }
         private int sum = 0;
        private int total=0;
        public void addMarks(int mark,int total){
        
            marks.add(mark);
            this.total += total;
            
        }
        public float calculatepercentage(){
            for(int mark : marks ){
                 sum += mark;
            }
            float percentage = ((float)sum/total)*100;
            return percentage;

        }
        @Override
        public void displayReport(){
            System.out.println("---STUDENT REPORT---");
            System.out.println("student's name: " +getName() + "student id: " +getId() + "student emial: " +getEmail());
System.out.println("Percentage obtained: " +calculatepercentage());
        }
        
    }
     class Professor extends User{
        private String department;
        public Professor(String Name,int id,String email,String department){
            super(Name,id,email);
            this.department = department;
        }
        public String getDepartment(){
            return department;
        }
        public void setDepartment(String department){
            this.department = department;
        }
        @Override
        public void displayReport(){
            System.out.println("---PROFFESSOR REPORT---");
            System.out.println("Professor name: " +getName() + "Proffessor id: " +getId() + "Professor email: " +getEmail() + "Proffesor department: " +getEmail());
        
        }
       
    }



    

