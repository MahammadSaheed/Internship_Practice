// Create an interface called ATM with the following method signatures:

// void checkBalance()
// void withdraw(double amount)
// void deposit(double amount)

// Create a class called BankAccount that implements the ATM interface. The BankAccount class should have the following properties:

// String accountNumber
// String accountName
// double balance

// Implement the methods of the ATM interface in the BankAccount class. For example, the checkBalance() method should print out the current balance of the account, the withdraw(double amount) method should subtract the specified amount from the balance, and the deposit(double amount) method should add the specified amount to the balance.

// Write a Main class that creates an instance of BankAccount and allows the user to interact with the account by calling the checkBalance(), withdraw(double amount), and deposit(double amount) methods. For example, the user should be able to input an amount to withdraw or deposit, and the program should update the balance accordingly.

import java.util.*;

interface ATM {
  void checkBalance();

  void withdraw(double amount);

  void deposit(double amount);
}

class BankAccount implements ATM {
  long accountNumber;
  String accountName;
  double balance;

  public BankAccount(long accountNumber, String accountName, double balance) {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.balance = balance;
  }

  public void checkBalance() {
    System.out.println("Current balance: $" + balance);
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds.");
    } else {
      balance -= amount;
      System.out.println("rupees" + amount + " withdrawn. New balance: " + balance);
    }
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("rupees" + amount + " deposited. New balance: " + balance);
  }
}

class AtmDetails {
  public static void main(String args[]) {
    BankAccount account = new BankAccount(199191999, "John Smith", 1000.0);
    Scanner sc = new Scanner(System.in);
    String option;
    do {
      System.out.println("\n1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Exit");
      System.out.print("Enter option: ");
      option = sc.nextLine();
      switch (option) {
        case "1":
          account.checkBalance();
          break;
        case "2":
          System.out.print("Enter amount to withdraw: $");
          double withdrawAmount = sc.nextDouble();
          sc.nextLine();
          account.withdraw(withdrawAmount);
          break;
        case "3":
          System.out.print("Enter amount to deposit: $");
          double depositAmount = sc.nextDouble();
          sc.nextLine();
          account.deposit(depositAmount);
          break;
        case "4":
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid option.");
          break;
      }
    } while (!option.equals("4"));
  }
}