import java.util.*;

class Maximumoccurance {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();

    char a[] = str.toCharArray();
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          System.out.println("The maximum occured is:-" + a[i]);
        }
      }
    }
  }
}