import java.util.*;

class Builder {
  public static void main(String args[]) {
    StringBuilder str = new StringBuilder("good morning");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string value");
    str.append("bitlabs");
    System.out.println(str);
  }
}