import java.util.Scanner;

class Leapyear {
  public static void main(String arags[]) {
    int year;
    System.out.println("enter the year");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();
    if ((year % 4 == 0) && (year % 100 != 0))
      System.out.println("this is leap year");
    else
      System.out.println("this not leap year");
  }
}