import java.util.Scanner;

class Vote {
  public static void main(String args[]) {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of voter");
    age = sc.nextInt();
    if (age >= 18) {
      System.out.println("this person is eligible for voting ");
    } 
    else {
      System.out.println("ohh shit! he is not eligible for voting");
    }
  }
}
