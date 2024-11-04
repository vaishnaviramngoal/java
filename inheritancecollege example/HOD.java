public class HOD extends Staff {
         String departmentName;

             public HOD(String name, int age, String departmentName, float salary) {
                this.name=name;
                this.age=age;
                this.departmentName= departmentName;
                this.salary=salary;
             }

            public void printInfo() {
                 System.out.println("name is :" +name);
                 System.out.println("age is:" +age);
                 System.out.println(" name of Dept :" +departmentName);
                 System.out.println("salary is :" +salary);
            }

  }