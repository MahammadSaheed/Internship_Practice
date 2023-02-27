import java.util.Scanner;

class Maximum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows");
    int n = sc.nextInt();
    int sum = 0;
    System.out.println("enter number of columns");
    int m = sc.nextInt();
    int a[][] = new int[n][m];
    int count = 0;
    System.out.println("enter elements ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[i][j] != 20) {
          if (a[i][j] > max) {
            max = a[i][j];
          }
        }
      }
    }
    System.out.println(max);
  }

}