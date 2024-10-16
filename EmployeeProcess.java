public class EmployeeProcess {
            
        
        static Employee[] employeedata = new Employee[8];
      
      public static void main(String[] args) {

         
         Employee  employee1 = new Employee(1,"Kavya",25000,"Full Time");
         Employee  employee2 = new Employee(2,"Keerthana",20000,"Part Time");
         Employee  employee3 = new Employee(3,"Karthik",18000,"Temporary");
         Employee  employee4 = new Employee(4,"charan", 20000,"Contract");
         Employee  employee5 = new Employee(5,"prabhu",25000,"Full Time");
         Employee  employee6 = new Employee(6,"shrinivas",18000,"self employed");
         Employee  employee7 = new Employee(7,"Reddy",20000,"Part Time");
         Employee  employee8 = new Employee(8,"Krithi",23000,"Contract");
         

         saveEmployee(employee1);
         saveEmployee(employee2);
         saveEmployee(employee3);
         saveEmployee(employee4);
         saveEmployee(employee5);
         saveEmployee(employee6);
         saveEmployee(employee7);
         saveEmployee(employee8);
         
         for(int i=0; i<employeedata.length; i++) {
              if(employeedata[i]!=null) {
                  employeedata[i].EmployeeInfo();
                }
          }

      }

    public static boolean saveEmployee(Employee employee) {
           for(int i=0;i<employeedata.length;i++) {
             if(employeedata[i]==null) {
               employeedata[i] = employee;
               System.out.println("employee is saved");
                return true;
              }
            }
     System.out.println("No space in the array");
     return false;
   }
}
         
   









