import java.util.Scanner;
     class Bookborrow{
       public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the book name");
           String bname=sc.next();
          System.out.println("Enter the Author of book");
           String cname=sc.next();
          System.out.println("Enter the Borrower name");
           String name=sc.next();
          System.out.println("Enter the phone number");
           Long pnum=sc.nextLong();
         System.out.println("Book name:" +bname);
         System.out.println("Author of book:" +cname);
         System.out.println("Borrower name:" +name);
         System.out.println("phone number:" +pnum);
       }
     }