public class Bank {

             static String bankName ;
             static double interest;
             static int totalAccounts ;
             String accountHolderName;
             double balance;
              String accountType;
              int accountNumber;

              static {
                 bankName = "HDFC";
                 interest = 3.5;
                  totalAccounts = 300;
                }


               public Bank(String accountHolderName, double balance, String accountType, int accountNumber) {

                  this.accountHolderName = accountHolderName;
                  this.balance = balance;
                  this.accountType = accountType;
                  this.accountNumber = accountNumber;
                }

                public void printBankDetails() {

                  System.out.println("BankName:" +bankName);
                  System.out.println("Interest:" +interest);
                  System.out.println("TotalAccounts :" +totalAccounts );
                  System.out.println("AccountHolderName:" +accountHolderName);
                  System.out.println("AccountType:" +accountType);
                  System.out.println("AccountNumber:" +accountNumber);
                }
}
          

       
       


       
                   