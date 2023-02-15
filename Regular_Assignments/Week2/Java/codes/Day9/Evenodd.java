import java.util.Scanner;
      class Evenodd{
        public static void main(String args[]){
          int number;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          number=sc.nextInt();
          if(number%2==0){
          System.out.println("yes! it is an even number");
           }
          else{
            System.out.println("yes! it is an odd number");
          }  
        }
      }