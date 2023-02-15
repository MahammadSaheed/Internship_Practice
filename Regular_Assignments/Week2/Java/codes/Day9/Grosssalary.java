import java.util.Scanner;
    class Grosssalary{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the user salary");
        double bsalary= sc.nextDouble();
        double hra,da,gsalary;
        if(bsalary<=10000){
          hra = bsalary*0.20;
          da = bsalary*0.80;
         }
        else if (bsalary<=20000  && bsalary<=10000){
          hra = bsalary*0.25;
          da =bsalary*0.90;
        }
        else {
          hra = bsalary*0.30;
          da = bsalary*0.95;
        }
        gsalary=hra+da+bsalary;
        System.out.println("Gross salary ="+ gsalary);
      }
    }