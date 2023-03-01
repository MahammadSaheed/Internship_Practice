import java.util.Scanner;

class Char {

  static void getCharacter(String str) {
    System.out.println(str.charAt(2));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str1 = sc.nextLine();
    System.out.println(str1);
    getCharacter(str1);

  }
}