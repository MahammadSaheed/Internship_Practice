import java.util.Scanner;

class Min {
  public static void main(String args[]) {
    int a[] = new int[] { 21, 7, 8, 15, 98 };
    int min = a[0];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    System.out.println("the minimum value is :-" + min);
  }
}