public class JNNCE extends College {

            int numberOfDepartments;
            int numberOfFaculty;

             public JNNCE(Principal principal,HOD[] hod, Professors[] professors, Students[] students,int numberOfDepartments, int numberOfFaculty) {
                 super(principal, hod, professors, students);
                     this.numberOfDepartments = numberOfDepartments;
                     this.numberOfFaculty = numberOfFaculty;
              }
             public void printInfo() {
                principal.printInfo();

                 for(int i=0; i<hod.length; i++) {
                     hod[i].printInfo();
                  }

                 for(int i=0; i<professors.length; i++) {
                     professors[i].printInfo();
                  }

                  for(int i=0; i<students.length; i++) {
                     students[i].printInfo();
                  }


                 System.out.println("Number of department is:" + numberOfDepartments);
                 System.out.println("Numbe of Faculty:" +numberOfFaculty);
             }
   }
               
