import java.util.*;

class Checksymbol {
  static void Stringcontains(String str1, String SubString) {
    if (str1.contains(SubString)) {
      if (SubString.contains("@")) {
        System.out.println("character found at the index" + SubString.indexOf("@"));
      } else {
        System.out.println("not found");
      }
    }
  }

  public static void main(String args[]) {
    Stringcontains("welcometobitl@abs", "bitl@abs");

  }
}