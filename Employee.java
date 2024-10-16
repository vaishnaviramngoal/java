class Employee {
    int id;
    String name;
    double salary;
    String employmentType;

    
    public Employee(int id, String name, double salary, String employmentType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.employmentType = employmentType;
    }

    
    public void EmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Employment Type: " + employmentType);
        
    }
}


