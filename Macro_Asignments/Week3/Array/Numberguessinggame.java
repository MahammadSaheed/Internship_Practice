import java.util.Scanner;
import java.util.Random;

class Numberguessinggame {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    System.out.println("enter the number");
    int guess = sc.nextInt();
    int randomNum = ran.nextInt(100);
    System.out.println("the random number is:-"+randomNum);
    while (true) {
      if (guess != randomNum) {
        System.out.println("its not correct and re write the number");
        guess = sc.nextInt();
        System.out.println(randomNum);
      } else {
        System.out.println("the number is correct");
        break;
      }
    }
  }
}