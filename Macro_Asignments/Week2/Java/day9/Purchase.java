import java.util.Scanner;

class Purchase {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    boolean item;
    Double money,itemCost;
    System.out.println("Add money to your account");
    money = sc.nextDouble();
    System.out.println("Check the avilablity of the item(true or false)");
    item = sc.nextBoolean();
    System.out.println("Enter the item cost");
    itemCost = sc.nextDouble();
    if (item = false) {
      System.out.println("Sorry!Try again later");
    } else if (item = true && itemCost <= money) {
      System.out.println("Transaction completed");
    } else {
      System.out.println("Insufficient balance please add enough money to buy an item");
    }
  }
}