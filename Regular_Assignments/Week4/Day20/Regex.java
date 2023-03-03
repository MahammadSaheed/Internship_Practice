import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Regex {
  static void regexDemo(String str) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the username");
    str = sc.nextLine();
    String regex = "^[A-Za-z]\\w{5,29}$";
    if (str.matches(regex)) {
      System.out.println("its an valid username");
    } else {
      System.out.println("its an invalid username");
    }

  }

  public static void main(String args[]) {
    String str = "";
    regexDemo(str);
  }
}
