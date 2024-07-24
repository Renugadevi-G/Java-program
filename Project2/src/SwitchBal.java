package pro;

import java.util.*;

class Account {
    String name;
    int phno;
    int age;
    int balance;

    void SetAccountDetails() {
        name = "renu";
        phno = 908700000;
        age = 20;
        balance = 10000;
    }

    void dispAccountDetails() {
        System.out.println("Name=" + name + "\n");
        System.out.println("Phno=" + phno + "\n");
        System.out.println("Age=" + age + "\n");
        System.out.println("Balance=" + balance + "\n");
    }

    void withdraw(int amount) {
        int minbal = 500;
        int rem = balance - amount;

        if (rem >= minbal) {
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

}

public class SwitchBal {
    public static void main(String[] args) {
        Account a = new Account();
        a.SetAccountDetails();
        a.dispAccountDetails();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter amount:");
        int amount = s.nextInt();

        System.out.println("Please choose an option:");
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("0. Exit");
        int c = s.nextInt();

        while (c != 0) {
            switch (c) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = s.nextInt();
                    a.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = s.nextInt();
                    a.deposit(depositAmount);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("\nUpdated Account Details:");
            a.dispAccountDetails();
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("0. Exit");
            c = s.nextInt();
        }

        System.out.println("Exiting program. Goodbye!");
    }
}