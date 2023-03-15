import java.util.Scanner;
interface Atm {
  void withdraw();
  void deposit();
  void getBalance();
}
class Satm implements Atm {
  Scanner sc = new Scanner(System.in);
    double balance = 5000;
    public void deposit() {
        System.out.println("Enter the  amount you want to deposit ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        getBalance();
    }
    public void withdraw() {
        System.out.println("Enter the  amount your want to withdraw");
        double amount = sc.nextDouble();
        balance = balance - amount;
        getBalance();
    }
    public void getBalance() {
        System.out.println("the remaining balance is " + balance);
    }
}
class SBIAtm {
  public static void main(String args[]) {
    Atm a = new Satm();
     a.deposit();
    a.withdraw();
  }
}