import java.util.*;

class Buffer {
  public static void main(String args[]) {
    StringBuffer str = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string value");
    str.append("String buffer is mutable string and we can modify");
    System.out.println(str.lastIndexOf("m"));
  }
}