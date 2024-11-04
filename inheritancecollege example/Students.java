public class Students extends StudentInfo {
            String departmentName;

            public Students(String studName, int studAge, int studId, String departmentName) {

                 this.studName = studName;
                 this.studAge = studAge;
                 this.studID = studID;
                 this.departmentName = departmentName;
             }

            public void printInfo() {
                System.out.println("student name is :" +studName);
                System.out.println("student age is :" +studAge);
                System.out.println("student id is :" +studID);
                System.out.println("department name is :" +departmentName);

             }
}