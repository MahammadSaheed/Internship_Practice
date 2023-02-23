import java.util.Scanner;

class Insertlast {
  public static void main(String[] args) {
    int n, pos, e;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of an array:");
    n = sc.nextInt();
    int a[] = new int[n + 1];
    System.out.println("Enter " + n + " all the elements:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    pos= n;
    System.out.print("Enter the element which you want to insert:");
    e = sc.nextInt();
    for (int i = n - 1; i >= pos; i--) {
      a[i + 1] = a[i];
    }
    a[pos] = e;
    System.out.println("After inserting : ");
    for (int i = 0; i <= n; i++) {
      System.out.println("a[" + i + "]=" + a[i]);
    }
  }
}