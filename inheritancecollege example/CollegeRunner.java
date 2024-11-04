public class CollegeRunner {
    public static void main(String[] args) {
        HOD hod1 = new HOD("Hemanth", 47, "Computer Network",80000.00f);
        HOD hod2 = new HOD("Sunitha", 48, "Computer Science", 74000.00f);
        HOD[] pesitHOD = {hod1, hod2};
    
        Principal pesitPrincipal = new Principal("Dr. Y VIJAYKUMAR", 68, "PhD Education",140000.00f);
    
        Professors professor1 = new Professors("Dr. Santhosh Kumar", 42, "Advance java" ,45000.00f);
        Professors professor2 = new Professors("Dr. Raghvendra", 50, "DSA", 54000.00f);
        Professors professor3 = new Professors("Dr. Adarsh ", 40,  "Operating Systems" ,52000.00f);
        Professors professor4 = new Professors("Dr. Arun Kumar", 36, "Web Technology" ,51000.00f);
        Professors[] pesitProfessors = {professor1, professor2, professor3, professor4};
    
        Students student1 = new Students("Vaishnavi", 22, 1,"Computer Science");
        Students student2 = new Students("Charan", 23,2, "Digital Marketing");
        Students student3 = new Students("Keerthi", 24,3, "Human Resource");
        Students student4 = new Students("Sneha", 22, 4,"Accounting");
        Students student5 = new Students("Rajesh", 23,5, "Electronics");
        Students[] pesitStudents = {student1, student2, student3, student4, student5};
    
        PESIT pesit = new PESIT(pesitPrincipal, pesitHOD, pesitProfessors, pesitStudents, 5, 20);
        
        pesit.printInfo();
    
        HOD hod3 = new HOD("Santhosh kumar", 47, "Computer Science",80000.00f);
        HOD hod4 = new HOD("Prashant", 43, "Electrical Engineering",84000.00f);
        HOD[] jnnceHOD = {hod3, hod4};
    
        Principal jnncePrincipal = new Principal("Dr. Anil kumar", 51, "PhD Education", 170000.00f);
    
        Professors professor5 = new Professors("Dr. Hemant Kumar", 42, "DSA", 58000.00f);
        Professors professor6 = new Professors("Dr. Prashant", 42, "AI", 62000.00f);
        Professors professor7 = new Professors("Dr. Sunitha", 38, " Computer Networking",58000.00f);
        Professors[] jnnceProfessors = {professor5, professor6, professor7};
    
        Students student6 = new Students("Aishwarya", 22,6, "Computer Science");
        Students student7 = new Students("Karan", 23,7, "Computer Networks");
        Students student8 = new Students("Sahana", 23,8, "Mechanical Engineering");
        Students student9 = new Students("Vinutha", 21,9, " DSA");
        Students student10 = new Students("Abhigna", 24,10, "Electrical Engineering");
        Students[] jnnceStudents = {student6, student7, student8, student9, student10};
    
        JNNCE jnnce = new JNNCE(jnncePrincipal, jnnceHOD, jnnceProfessors, jnnceStudents, 5, 20);
        
        jnnce.printInfo();
    }
    
}