public class Students {
 
      String name ;
      int rollno ;
      String dept ;
      int age;
      String Address;
     
     public Students() {
        System.out.println("No parameter Constructor");
      }

     public Students(String name) {
      this();
      this.name=name;
      }
      
     public Students(String name, int rollno) {
      this(name);
      this.rollno = rollno;
     }
 
     public Students(String name, int rollno,String dept) {
      this(name, rollno);
      this.dept = dept;
     }
      public Students(String name, int rollno,String dept,int age) {
      this(name, rollno, dept);
      this.age = age;
       }
      public Students(String name, int rollno,String dept,int age, String Address) {
      this(name, rollno,dept,age);
      this.Address = Address;
       }
     

        public void StudentsInfo() {
        System.out.println("name : " + name);
        System.out.println("rollno: " + rollno);
        System.out.println("dept: " + dept);
        System.out.println("age: " +age);
        System.out.println("Address:" +Address);
       }

   
}

       