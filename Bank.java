public class Bank {

             static String bankName ;
             static double interest;
             static int totalAccounts ;
             String accountHolderName;
             double balance;
              String accountType;
              int accountNumber;

              static {
                 bankName = "HDFC";
                 interest = 3.5;
                  totalAccounts = 300;
                }


               public Bank(String accountHolderName, double balance, String accountType, int accountNumber) {

                  this.accountHolderName = accountHolderName;
                  this.balance = balance;
                  this.accountType = accountType;
                  this.accountNumber = accountNumber;
                }

                public void printBankDetails() {

                  System.out.println("BankName:" +bankName);
                  System.out.println("Interest:" +interest);
                  System.out.println("TotalAccounts :" +totalAccounts );
                  System.out.println("AccountHolderName:" +accountHolderName);
                  System.out.println("AccountType:" +accountType);
                  System.out.println("AccountNumber:" +accountNumber);
                }
    }


    class Student {

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

         class Employee {

          static String companyName ;
          static String headquarters ;
          static int totalEmployees ;
          String name;
          int age;
          String position;
           double salary;


           static {
              companyName = "Mphasis";
              headquarters = "Banglore";
              totalEmployees = 500;
            }
 
            public Employee(String name, int age, String position, double salary) {
                  this.name = name;
                   this.age = age;
                   this.position = position;
                   this.salary = salary;

              }
           
              public void printEmployeeInfo() {

               System.out.println("companyName: " +companyName);
               System.out.println("headquaters: " +headquarters);
               System.out.println("totalEmployees: " +totalEmployees);
               System.out.println("name: " +name);
               System.out.println("age: " +age);
               System.out.println("position: " +position);
               System.out.println("salary: " +salary);
               }
 }

     class LibraryBook {

    static String libraryName ;
    static int totalBooks ;
    static String librarian ;
    String title;
    String author;
    String bookName;
    boolean isAvailable;

     static {
       libraryName = "City Central Library";
       totalBooks = 50000;
       librarian = "Ms. Jane";
       }

     public LibraryBook(String title, String author, String bookName, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.bookName = bookName;
         this.isAvailable = isAvailable;
       }
          
       public void printLibraryBookInfo() {

          System.out.println("LibraryName: " +libraryName);
          System.out.println("totalBooks: " +totalBooks);
          System.out.println("librarian: " +librarian);
          System.out.println("title: " +title);
          System.out.println("author: " +author);
          System.out.println("bookName: " +bookName);
          System.out.println("isAvailable: " +isAvailable);
        }
}


       class Car {

         static String manufacturer = "Toyota";
         static int totalCarsProduced = 100000;
         static String fuelType = "Gasoline";
         String model;
         String color;
         int year;
         int mileage;

         static {

          manufacturer = "Toyota";
          totalCarsProduced = 100000;
          fuelType = "Gasoline";
          }

           public Car(String model, String color, int year, int mileage) {
              this.model = model;
              this.color = color;
               this.year = year;
                this.mileage = mileage;
           }

          

          public void printCarInfo() {

          System.out.println("manufacturer: " +manufacturer);
          System.out.println("totalCarsProduced : " +totalCarsProduced );
          System.out.println("fuelType: " +fuelType);
          System.out.println("model: " +model);
          System.out.println("color: " +color);
          System.out.println("year: " +year);
          System.out.println("mileage: " +mileage);
          }
        
 }
          

       
       


       
                   