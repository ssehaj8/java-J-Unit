package com.bridgelabz.JUnit.BankAccountTest;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance=balance;
    }
    public void deposit(int amount) {
        if (amount >= 0) {
            balance+=amount;
        }
    }

    public int getBalance() {
        return balance;
    }


    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
