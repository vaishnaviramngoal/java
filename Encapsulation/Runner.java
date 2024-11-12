package com.xworkz.encapsulation

public class Runner {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(12345, "Vaishnavi", 5000.0, "Savings", "Nandikur Branch", 2.5, true,
            "India", "2023-01-01", "2024-02-15", "amngoalvai067@example.com", "1234567890",
            "Kalburgi", 1000, 500, "Active", "6655774433334444", "AB1245567C", false, "John Smith");

        account.displayAccountDetails();

        
        account.setDailyWithdrawalLimit(1000);
        int withdrawalLimit = account.getDailyWithdrawalLimit();
        System.out.println("Updated withdrawal limit: " + withdrawalLimit);

        
        account.setOverdraftLimit(2000);
        int overdraftLimit = account.getOverdraftLimit();
        System.out.println("Overdraft limit: " + overdraftLimit);

        account.setAddress("Bidar"); 
        String address = account.setAddress();
        System.out.println("Updated Address: " + address);


        
    }
}
