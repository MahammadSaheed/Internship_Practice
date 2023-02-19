import java.util.Scanner;
import java.time.LocalDate; 
import java.time.DayOfWeek;

class Dayfind{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter date in yyyy-MM-dd format: "); 
    String i= sc.next(); 
    LocalDate date=  LocalDate.parse(i);
    DayOfWeek day = date.getDayOfWeek();
    System.out.println(day);
  }
}