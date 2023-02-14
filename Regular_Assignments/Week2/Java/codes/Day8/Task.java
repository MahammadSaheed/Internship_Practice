import java.util.Scanner;
  class Task {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integar");
    int num1 =sc.nextInt();
        System.out.println("Enter the double");
    double num2=sc.nextDouble();
        System.out.println("Enter the character");
    char num3=sc.next().charAt(0);
        System.out.println("Enter the boolean");
     boolean num4=sc.nextBoolean();

        System.out.println("Integer "+num1);
        System.out.println("double "+num2);
        System.out.println("character "+num3);
        System.out.println("Boolean "+num4);
    
  }
}