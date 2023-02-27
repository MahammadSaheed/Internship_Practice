import java.util.Scanner;

class Numoftwos {
  public static void main(String args[]) {
    int a[][] = new int[3][2];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        if (a[i][j] == 1) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}