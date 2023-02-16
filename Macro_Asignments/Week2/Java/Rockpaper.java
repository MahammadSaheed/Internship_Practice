import java.util.Scanner;

class Rockpaper {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("select an options");
    String userch;
    String compch;
    System.out.println("enter the user choice");
    userch = sc.next();
    System.out.println("enter the computer choice");
    compch = sc.next();
    if (userch.equals(compch)) {
      System.out.println("Game is tie");
    } else if (userch.equals("rock") && (compch.equals("paper"))
        || (userch.equals("paper")) && (compch.equals("scissors"))
        || (userch.equals("scissors")) && (compch.equals("rock"))) {
      System.out.println("computer wins");
    } else if (userch.equals("paper") && (compch.equals("rock"))
        || (userch.equals("scissors")) && (compch.equals("paper"))
        || (userch.equals("rock")) && (compch.equals("scissors"))) {
      System.out.println("user wins");
    } else {
      System.out.println("lose the game");
    }
  }
}