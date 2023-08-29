package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Bank bank = new Bank();

       int choice;

       do {
           System.out.println(" 1. Enter bank details \n 2. Display all account details \n 3. Search by account number \n 4. Deposit the amount \n 5. Withdraw the amount \n 6. Exit");
           System.out.println("Select Your Choice: ");
           Scanner scanner = new Scanner(System.in);
           choice = scanner.nextInt();

           //Using switch case to proceed choices
           switch (choice) {

               case 1:
                   // Customer needs to enter bank details
                   bank.accDetails();
                   break;

               case 2:
                   // Display bank details
                   bank.displayAccDetails();
                   break;

               case 3:
                   // Search by account number

               case 4:
                   // Deposit the amount
                   bank.depositCash();
                   break;
               case 5:
                   // Withdraw the amount
                   bank.withdrawCash();
                   break;

               case 6:
                   System.out.println("Exit");
                   break;

               default:
                   System.out.println("Invalid Choice! Try Again.");
                   break;

           }

       }
       while ( choice != 0);

    }
}

class Bank {

    private String accountNo;
    private String name;
    private String accountType;
    private long accountBal;


    Scanner scanner = new Scanner(System.in);

    public void accDetails() {
        System.out.println("Please Enter the Account No: ");
        accountNo = scanner.next();

        System.out.println("Enter Your Name: ");
        name = scanner.next();

        System.out.println("Enter Account Type: ");
        accountType = scanner.next();

        System.out.println("Enter Account Balance: ");
        accountBal = scanner.nextLong();
    }

    //Display all account details
    public void displayAccDetails(){
        System.out.println("Account Holder's Name: " + name);
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBal);
    }

    //Search by account number
    public boolean searchAcc(String acc_no) {
        if (accountNo.equals(acc_no)) {
            displayAccDetails();
            return (true);
        }

        return (false);
    }

    //Deposit the amount
    public void depositCash() {
        long depositAmount;

        System.out.println("Enter the amount you want to deposit: ");
        depositAmount = scanner.nextLong();
        accountBal = accountBal + depositAmount;
        System.out.println(accountBal);

    }

    //Withdraw the amount
    public void withdrawCash() {
        long WithdrawAmount;

        System.out.println("Enter the amount you want to withdraw: ");
        WithdrawAmount = scanner.nextLong();

        if (accountBal >= WithdrawAmount) {
            accountBal = accountBal - WithdrawAmount;
            System.out.println("Current balance: ");
            System.out.println(accountBal);
        }else {
            System.out.println("Your account balance is low. Cannot withdraw amount!!!!!");
        }


    }

}