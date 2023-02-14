import java.util.Scanner;
class Studentavg {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of subject1:");
    int sub1 = sc.nextInt();
    System.out.print("Enter marks of  subject2:");
    int sub2 = sc.nextInt();
    System.out.print("Enter marks of subject3:");
    int sub3 = sc.nextInt();
    int avg = (sub1 + sub2 + sub3) / 3;
    System.out.println("Average grade : " + avg);
  }
}