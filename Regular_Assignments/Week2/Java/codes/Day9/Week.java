import java.util.Scanner;
    class Week{
      public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of week");
        num=sc.nextInt();
         if(num==1){
          System.out.println("now its sunday");
        }
         else if(num==2){
          System.out.println("now its monday");
        }
        else if(num==3){
          System.out.println("now its tuesday");
        }
       else if(num==4){
          System.out.println("now its wednesday");
        }
       else if(num==5){
          System.out.println("now its thursday");
        }
      else if(num==6){
          System.out.println("now its friday");
        }
         else if(num==7){
          System.out.println("now its saturday");
        }
        else{
          System.out.println("You should enter 1 to 7");
        }
      }
    }