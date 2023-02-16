import java.util.Scanner;

class Stock {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to store:");
    double balance = 2000;
    System.out.println("Enter the item you want:");
    String Item = sc.next();
    int amount;
    if (Item.equals("football")) {
      System.out.println("quantity:");
      int q = sc.nextInt();
      amount = q * 20;
      System.out.println("Amount" + amount);
      if (amount <= balance) {
        System.out.println("Purchased " + Item);
        balance = balance - amount;
        System.out.println("Balance:" + balance);
      } else
        System.out.println("Add money to your account!!Insufficient balance");
    } else
      System.out.println("Out of Stock!Try again later");
  }
}