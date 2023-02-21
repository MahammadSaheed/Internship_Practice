import java.util.Scanner;
 class While{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int i=1;
      while(i<=100){
        if(i % 5 ==0)
          System.out.println(i);
        i =i+1;
      }
     System.out.println("exit");
   }
 }