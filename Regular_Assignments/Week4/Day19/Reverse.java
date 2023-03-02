import java.util.*;

class Reverse {
  static void reverseString(String str1) {
    char a[] = str1.toCharArray();
    String rev = "";
    for (int i = a.length - 1; i >= 0; i--) {
      rev = rev + a[i];
    }
    System.out.println(rev);
  }

  public static void main(String args[]) {
    reverseString("shaiduu");
  }
}