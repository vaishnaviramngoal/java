public class Principal extends Staff {
        String qualification;

    public Principal(String name, int age, String qualification, float salary) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Qualification is: " +qualification);
        System.out.println("Salary is: " +salary);
    }
}
