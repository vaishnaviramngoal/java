public class Employee {

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

     