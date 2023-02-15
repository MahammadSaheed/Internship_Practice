import java.util.Scanner;

class Uppercase {
  public static void main(String args[]) {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    ch = sc.next().charAt(0);
    if (ch >= 'A' && ch <= 'Z') {
      System.out.println("the character is in uppercase");
    } else {
      System.out.println("the character is in lowercase");
    }
  }
}