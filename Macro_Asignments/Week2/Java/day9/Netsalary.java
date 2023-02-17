import java.util.Scanner;

class Netsalary{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double salary, asalary, tax = 0, netsalary;
    System.out.println("Enter your Salary");
    salary = sc.nextDouble();
    asalary = salary * 12;
    System.out.println("Your anual salary : " + asalary);
    if (asalary < 300000) {
      System.out.println("No need to pay gst income tax");
    } else if (asalary >= 300000 && asalary < 600000) {
      System.out.println("You should  pay 5% of income");
      tax = asalary * 0.05;
    } else if (asalary >= 600000 && asalary < 900000) {
      System.out.println("You should pay 10% of income");
      tax = asalary * 0.10;
    } else if (asalary >= 900000 && asalary < 1200000) {
      System.out.println("You should pay 15% of income");
      tax = asalary * 0.15;
    } else if (asalary >= 1200000 && asalary < 1500000) {
      System.out.println("You should pay 20% of income");
      tax = asalary * 0.20;
    } else {
      System.out.println("You should pay 30% of income");
      tax = asalary * 0.30;
    }
    System.out.println("Your  income tax is :" + tax);
    netsalary = asalary - tax;
    System.out.println("Your net Salary : " + netsalary);
  }
}