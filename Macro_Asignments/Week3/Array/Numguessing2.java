import java.util.Random; 
import java.util.Scanner;

class Numguessing2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    int randomnum=random.nextInt(100);
    System.out.println(randomnum);
    int guess=0;
    int count=0;
    do{
      System.out.println("Guess Number:");
      guess=sc.nextInt();
      if(randomnum==guess)
        System.out.println("you guessed correct value");  
      else{
        if(randomnum>guess)
          System.out.println("Guess number is less than random number");
        else
          System.out.println("Guess number is greater than random number");
      }
      count++;
      if(count>=3){
        System.out.println("Chances exceeded");
        break;
      }
    }
      while(randomnum!=guess);
  }
}