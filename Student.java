public class Student {

    static String schoolName ;
    static String principalName ;
    static int totalStudents;
    String studentName;
    char grade;
    double GPA;
    int rollNumber;

     static {
        schoolName  = "N V school";
        principalName = "Rajesh" ;
        totalStudents = 100;
        }
 
      public Student(String studentName, char grade, double GPA, int rollNumber) {
         this.studentName =studentName;
         this.grade = grade;
         this.GPA = GPA;
         this.rollNumber = rollNumber;
       }

      public void printStudentDetails() {
 
          System.out.println("schoolName: " +schoolName);
          System.out.println("principalName: " +principalName);
          System.out.println("totalStudents: " +totalStudents);
           System.out.println("studentName: " +studentName);
           System.out.println("grade: " +grade);
           System.out.println("GPA: " +GPA);
           System.out.println("rollNumber: " +rollNumber);
        }
}

        
              