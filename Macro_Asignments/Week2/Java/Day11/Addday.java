import java.util.Scanner;
import java.time.LocalDate;

class Addday {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter date in yyyy-MM-dd format: ");
    String input = sc.next();
    LocalDate date = LocalDate.parse(input);
    System.out.println("Enter the days to be added: ");
    int n = sc.nextInt();
    LocalDate newdate = date.plusDays(n);
    System.out.println(newdate);
  }
}