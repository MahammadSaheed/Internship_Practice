import java.util.Scanner;

class Totalnotes {
  public static void main(String args[]) {
    int amount, n2000, n500, n200, n100, n50;
    n2000 = n500 = n200 = n100 = n50 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the amount");
    amount = sc.nextInt();
    if (amount >= 2000)
      n2000 = amount / 2000;  
    if (amount >= 500)
      n500 = amount / 500;
    if (amount >= 200)
      n200 = amount / 200;
    if (amount >= 100)
      n100 = amount / 100;
    if (amount >= 50)
      n50 = amount / 50;
    
    System.out.println("Total Number of Notes =:" + (n2000 + n500 + n200 + n100 + n50));
    System.out.println("2000 notes = " + n2000);
    System.out.println("500 notes = " + n500);
    System.out.println("200 notes = " + n200);
    System.out.println("100 notes = " + n100);
    System.out.println("50 notes = " + n50);

  }
}