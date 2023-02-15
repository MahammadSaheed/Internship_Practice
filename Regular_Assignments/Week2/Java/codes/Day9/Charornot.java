import java.util.Scanner;
    class Charornot{
      public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.println("enter the alphabet");
        ch=sc.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
          System.out.println("it is an alphabet");
        }
          else{
            System.out.println("it is not an alphabet");
          }
      }
    }