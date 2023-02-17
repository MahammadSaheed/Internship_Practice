import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period; 

class Age {
  public static void main(String args[]) {
    System.out.println("enter the date of birth");
    Scanner sc = new Scanner(System.in);
    String birth_date = sc.next();
    LocalDate today = LocalDate.now();
    System.out.println(today);
   DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   LocalDate dateofbirth = LocalDate.parse(birth_date, dateFormat);
    Period age=Period.between(dateofbirth,today);
    System.out.println(age.getYears());
    if(age.getYears()>=18){
      System.out.println("he/her is adult");
    }
    else{
      System.out.println("he/her is minor");
    }
  }
}
