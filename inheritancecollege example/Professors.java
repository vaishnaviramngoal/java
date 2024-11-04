public class Professors extends Staff {
         String subjectName;

             public Principal(String name, int age, String subjectName, float salary) {
                this.name=name;
                this.age=age;
                this.subjectName= subjectName;
                this.salary=salary;
             }

            public void printInfo() {
                 System.out.println("name is :" +name);
                 System.out.println("age is:" +age);
                 System.out.println("subjectname is :" +subjectName);
                 System.out.println("salary is :" +salary);
            }

  }