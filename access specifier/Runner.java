public class Runner extends CollegeInformation {

    public static void main(String[] args) {
        
        CollegeInformation clgInformation = new CollegeInformation();
        System.out.println("College Name: " + clgInformation.clgName);
        clgInformation.setCollege();

        System.out.println("Address: " + clgInformation.Address);
        clgInformation.setAddress();
        clgInformation.identifyDepartment();

        
        CollegeStudent student = new CollegeStudent();
        System.out.println("Student Name: " + student.name);
        student.getInfo();

        
        Runner runner = new Runner();
        System.out.println("College ID: " + runner.getCollegeId());
    }
}
