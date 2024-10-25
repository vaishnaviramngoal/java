public class BankAccount {

           public static void main(String[] args) {
               Bank bank = new Bank("vaishnavi" ,100000, "savings" , 345667894);
                bank.printBankDetails() ;

                Bank bank1 = new Bank("keerthi" ,200000, "current" , 465758696);
                bank1.printBankDetails() ;
                  
                Bank bank2 = new Bank("priyanka" ,300000, "savings" , 474774449);
                bank2.printBankDetails() ;

                Bank bank3 = new Bank("priya" ,400000, "current" , 88466575);
                bank3.printBankDetails() ;

                Bank bank4 = new Bank("lekha" ,400000, "savings" , 375483944);
                bank4.printBankDetails() ;


                Student student = new Student("Suresh", 'A', 8.1 ,47);
                  student.printStudentDetails();

                Student student1 = new Student("Suresh", 'B', 7.1 ,67);
                  student1.printStudentDetails();

                Student student2 = new Student("Sanket", 'C', 8.2 ,183);
                  student2.printStudentDetails();

                Student student3 = new Student("Sushil", 'D', 6.1 ,83);
                  student3.printStudentDetails();

                 Student student4 = new Student("Suhas", 'E', 9.1 ,24);
                  student4.printStudentDetails();

                
                 Employee employee = new Employee("Kavya" , 27, "HR", 255000);
                   employee.printEmployeeInfo();

                 Employee employee1 = new Employee("Keerthana" , 24, "HR", 285000);
                   employee1.printEmployeeInfo();

                 Employee employee2 = new Employee("Thanu" , 25, "HR", 275000);
                   employee2.printEmployeeInfo();

                 Employee employee3 = new Employee("Spoorthi" , 23, "HR", 255000);
                   employee3.printEmployeeInfo();

                 Employee employee4 = new Employee("Karthik" , 22, "HR", 350000);
                   employee4.printEmployeeInfo();
    
                  LibraryBook librarybook = new LibraryBook("The Alchemist's Secret Diary", "Gosling", "The Silent Horizon", true);
                    librarybook.printLibraryBookInfo();
                    
                  LibraryBook librarybook1 = new LibraryBook("Echoes of a Broken Past", "john", "The Lost Chronicles", false);
                    librarybook1.printLibraryBookInfo();

                  LibraryBook librarybook2 = new LibraryBook("Beneath the Starlit Canopy", "Gosling", "A Journey Through Time", true);
                    librarybook2.printLibraryBookInfo();
                  
                  LibraryBook librarybook3 = new LibraryBook("The Alchemist's Secret Diary", "Gayle", "Rise of the Fallen Kings", false);
                       librarybook3.printLibraryBookInfo();
        
                  LibraryBook librarybook4 = new LibraryBook("Whispers of the Forgotten Shore", "james", "Shadows of Eternity", false);
                    librarybook4.printLibraryBookInfo();

                  Car car = new Car("Ford", "white", 2014, 35);
                     car.printCarInfo();

                  Car car1 = new Car("Nissan", "Blue", 2011, 28);
                     car1.printCarInfo();
    
                  Car car2 = new Car("Audi", "Black", 2012, 35);
                     car2.printCarInfo();
                  
                  Car car3 = new Car("BMW", "white", 2010, 28);
                     car3.printCarInfo();
                  
                  Car car4 = new Car("Toyota", "white", 2009, 35);
                     car4.printCarInfo();
                   
           }
}
                

                   