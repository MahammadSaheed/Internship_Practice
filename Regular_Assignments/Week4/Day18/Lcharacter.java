import java.util.*;

class Lcharacter {
  static void validateString(String str1) {
    if (str1.startsWith("L")) {
      System.out.println("its valid");
    } else {
      System.out.println("its not a valid character");
    }
  }

  public static void main(String args[]) {
    validateString("Lilly");
  }
}