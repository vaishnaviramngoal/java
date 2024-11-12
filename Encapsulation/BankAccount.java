package com.xworkz.encapsulation

public class BankAccount {
    
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String bankBranch;
    private double interestRate;
    private boolean isActive;
    private String currency;
    private String openingDate;
    private String lastTransactionDate;
    private String email;
    private String phoneNumber;
    private String address;
    private int overdraftLimit;
    private int dailyWithdrawalLimit;
    private String accountStatus;
    private String linkedCardNumber;
    private String identificationNumber;
    private boolean isJointAccount;
    private String nomineeName;
    
    public long getAccountNumber() { 
        return accountNumber; 
    } // Added closing brace
    
    public String getAccountHolderName() { 
        return accountHolderName; 
    }

    public double getBalance() { 
        return balance;
    }

    public String getAccountType() {
        return accountType; 
    }

    public String getBankBranch() { 
        return bankBranch;
    } 
    
    public double getInterestRate() {
        return interestRate; 
    }
   
    public boolean isActive() {
        return isActive; 
    }

    public String getCurrency() { 
        return currency; 
    }

    public String getOpeningDate() { 
        return openingDate; 
    }

    public String getLastTransactionDate() {
        return lastTransactionDate;
    }
    
    public String getEmail() { 
        return email; 
    }

    public String getPhoneNumber() {
        return phoneNumber; 
    }
    
    public String setAddress() { 
        return address; 
    }

    public int getOverdraftLimit() {
        return overdraftLimit; 
    }

    public int getDailyWithdrawalLimit() { 
        return dailyWithdrawalLimit; 
    }

    public String getAccountStatus() { 
        return accountStatus; 
    }

    public String getLinkedCardNumber() { 
        return linkedCardNumber; 
    }

    public String getIdentificationNumber() {
        return identificationNumber; 
    }

    public boolean getisJointAccount() {
        return isJointAccount;
    }

    public String getNomineeName() {
        return nomineeName;
    }
    
    public void setAccountNumber(long accountNumber) { 
          this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) { 
       this.accountHolderName = accountHolderName; 
     }
 
     public void setBalance(double balance) { this.balance = balance; }

    
    public void setAccountType(String accountType) { 
         this.accountType = accountType; 
     }
  
    public void setBankBranch(String bankBranch) { 
    this.bankBranch = bankBranch;
      }

    public void setInterestRate(double interestRate) { 
     this.interestRate = interestRate; 
        }

    
    public void setActive(boolean active) {
     this.isActive = active; }

    
    public void setCurrency(String currency) { 
       this.currency = currency; 
      }
    
    public void setOpeningDate(String openingDate) { 
        this.openingDate = openingDate; 
     }

   
    public void setLastTransactionDate(String lastTransactionDate) { 
          this.lastTransactionDate = lastTransactionDate; 
      }

    public void setEmail(String email) { 
       this.email = email; 
     }

   
    public void setPhoneNumber(String phoneNumber) { 
       this.phoneNumber = phoneNumber; 
     }

    
    public void setAddress(String address) {
         this.address = address; 
      }

    public void setOverdraftLimit(int overdraftLimit) {
       this.overdraftLimit = overdraftLimit; 
    }

    public void setDailyWithdrawalLimit(int dailyWithdrawalLimit) {
       this.dailyWithdrawalLimit = dailyWithdrawalLimit; 
     }

   
    public void setAccountStatus(String accountStatus) { 
       this.accountStatus = accountStatus; 
      }

    
    public void setLinkedCardNumber(String linkedCardNumber) { 
      this.linkedCardNumber = linkedCardNumber; 
       }

    
    public void setIdentificationNumber(String identificationNumber) { 
        this.identificationNumber = identificationNumber; 
      }

    public void setJointAccount(boolean jointAccount) { 
       this.isJointAccount = jointAccount; 
       }

    public void setNomineeName(String nomineeName) { 
    this.nomineeName = nomineeName; 
    }

    
    

    public BankAccount(long accountNumber, String accountHolderName, double balance, String accountType, String bankBranch, double interestRate,
                       boolean isActive, String currency, String openingDate, String lastTransactionDate, String email, String phoneNumber,
                       String address, int overdraftLimit, int dailyWithdrawalLimit, String accountStatus, String linkedCardNumber,
                       String identificationNumber, boolean isJointAccount, String nomineeName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.bankBranch = bankBranch;
        this.interestRate = interestRate;
        this.isActive = isActive;
        this.currency = currency;
        this.openingDate = openingDate;
        this.lastTransactionDate = lastTransactionDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.overdraftLimit = overdraftLimit;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.accountStatus = accountStatus;
        this.linkedCardNumber = linkedCardNumber;
        this.identificationNumber = identificationNumber;
        this.isJointAccount = isJointAccount;
        this.nomineeName = nomineeName;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Bank Branch: " + bankBranch);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Account Status is Active: " + isActive);
        System.out.println("Currency: " + currency);
        System.out.println("Opening Date: " + openingDate); 
        System.out.println("Last Transaction Date: " + lastTransactionDate);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Daily Withdrawal Limit: " + dailyWithdrawalLimit);
        System.out.println("Account Status: " + accountStatus);
        System.out.println("Linked Card Number: " + linkedCardNumber);
        System.out.println("Identification Number: " + identificationNumber);
        System.out.println("Is Joint Account: " + isJointAccount); 
        System.out.println("Nominee Name: " + nomineeName);
    }
}
