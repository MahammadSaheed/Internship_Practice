import java.util.Scanner;

class DeleteArray {
  public static void main(String[] args) {
    int n, pos;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements in array:");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter index position that you need to delete:");
    pos = sc.nextInt();
    for (int i = pos + 1; i < n; i++) {
      a[i - 1] = a[i];
    }
    System.out.println("After the deleting the position:");
    for (int i = 0; i < n - 1; i++) {
      System.out.println("a[" + i + "]=" + a[i]);
    }
  }
}