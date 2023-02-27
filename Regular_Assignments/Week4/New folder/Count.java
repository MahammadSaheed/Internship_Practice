import java.util.Scanner;

class Count {
  public static void main(String args[]) {
    int a[][] = { { 12, 3, 43 }, { 35, 90, 78 }, { 32, 21, 44 } };
    int count=0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (a[i][j] % 5 == 0) {
          count++;
      }
      System.out.println(count);
    }

  }
}