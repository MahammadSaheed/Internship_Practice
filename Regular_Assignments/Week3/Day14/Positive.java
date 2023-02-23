import java.util.Scanner;

class Positive {
  public static void main(String args[]) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
     System.out.println("enter the values");
    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
      if (a[i] >= 0) {
        System.out.println("then it is positive number" + a[i]);
      } else {
        System.out.println("its an negative number"+a[i]);
      }
    }

  }
}