import java.util.Scanner;
class Totalcost {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the cost of one night");
         double cost= scanner.nextDouble();
     System.out.println("one night cost" + cost);
       System.out.print("Enter the days");
         double days= scanner.nextDouble();
     System.out.println("num of days " + days);
            scanner.close();
         double totalamount = cost*days;
     System.out.println("Totalamount " + totalamount );
  }
}