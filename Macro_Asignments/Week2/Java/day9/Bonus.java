import java.util.Scanner;

class Bonus {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the salary");
    double salary = sc.nextDouble();
    System.out.println("enter the performance of employee");
    String p = sc.next();
    double bonus = 0;
    if (p.equals("Excellect")) {
      bonus = 0.1 * salary;
      System.out.println("Total" + bonus);
    } else if (p.equals("Good")) {
      bonus = 0.05 * salary;
      System.out.println("Total" + bonus);
    } else if (p.equals("Average")) {
      bonus = 0.02 * salary;
      System.out.println("Total" + bonus);
    } else if (p.equals("Poor")) {
      System.out.println("No bonus");
    } else {
      System.out.println("Invalid input");
    }

    double total = salary + bonus / 100 * salary;
  }
}