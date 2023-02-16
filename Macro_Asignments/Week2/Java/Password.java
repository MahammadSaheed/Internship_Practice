import java.util.Scanner;

class Password {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String Mpassword, uinput;
    Mpassword = ("meandyou");
    System.out.println("If you know your password then enter");
    uinput = sc.next();
    System.out.println("checking you entered password");
    if (uinput.equals(Mpassword)) {
      System.out.println("entered password is correct");
    } else {
      System.out.println("password is wrong");
    }
  }
}