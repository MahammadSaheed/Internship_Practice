import java.util.Scanner;

class Strongnumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n, rem = 0, i, total = 0;
    int fact;
    System.out.println("enter the number");
    n = sc.nextInt();
    int temp = n;
    while (n != 0) {
      fact = 1;
      rem = n % 10;
      for (i = 1; i <= rem; i++) {
        fact = fact * i;
      }
      total = total + fact;
      n = n / 10;
    }
    if (total == temp) {
      System.out.println("this strong number" + temp);
    } else {
      System.out.println("this is not strong number" + temp);
    }
  }
}
