package com.task3;

public class Main {

    public static void main(String[] args) {

        // Create a bank account with initial balance
        BankAccount userAccount = new BankAccount(10000);

        // Create ATM object and link to bank account
        ATM atm = new ATM(userAccount);

        // Start ATM system
        atm.displayMenu();
    }

}
