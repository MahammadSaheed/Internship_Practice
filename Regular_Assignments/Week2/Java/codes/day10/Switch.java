import java.util.Scanner;
 class Switch{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int number;
     number =sc.nextInt();
     switch(number){
       case 10:
         System.out.println("the number is 10");
         break;
          case 20:
         System.out.println("the number is 20");
         break;
          case 30:
         System.out.println("the number is 30");
         break;
          case 40:
         System.out.println("the number is 40");
         break;
          case 50:
         System.out.println("the number is 50");
         break;
          default:
         System.out.println("it is invalid");
     }
   }
 }