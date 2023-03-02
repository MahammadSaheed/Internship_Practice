import java.util.*;

class Compareto {
  static void compareTo(String str1, String str2) {
    if (str1.compareTo(str2) == 0) {
      System.out.println("the strings are equal");
    } else {
      System.out.println("the strings are not equal");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str1, str2;
    System.out.println("enter the first String");
    str1 = sc.nextLine();
    System.out.println("entr the second string");
    str2 = sc.nextLine();
    compareTo(str1, str2);
  }
}