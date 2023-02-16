import java.util.Scanner;

class Validation {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String username, email, uinput;
    username = ("shaiduu");
    email = ("shaiduu2133@gmail.com");
    System.out.println("Enter the username/email");
    uinput = sc.next();
    System.out.println("Processing wait a minute");
    if (uinput.equals(username) || uinput.equals(email)) {
      System.out.println("welcome to our website");
    } else {
      System.out.println("sorry you entered wrong username/email");
    }
  }
}