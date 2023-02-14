import java.util.Scanner;

class Restuarent {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cost of food");
    double cf = sc.nextDouble();
    double tax = 0.05 * cf;
    System.out.println("tax" + tax);
    System.out.println("Enter the tip:");
    int tip = sc.nextInt();
    double totalcost = cf + tax + tip;
    System.out.println("Total payment:" + totalcost);
  }
  
}
