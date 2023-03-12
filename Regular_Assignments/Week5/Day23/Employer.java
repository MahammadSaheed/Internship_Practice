import java.util.*;

class Employee {
  int empid;
  String name;
  double salary;

  Employee(int id, String n, double sal) {
    empid = id;
    name = n;
    salary = sal;
  }

  void grossSalary(double hra, double da) {
    double totalSalary = hra + da + salary;
    System.out.println(totalSalary);
  }

  void display() {
    System.out.println(empid + " " + name + " " + salary);
  }
}

public class Employer {
  public static void main(String args[]) {
    System.out.println("enter the information of employee");
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("enter employee " + (i + 1) + " details");
      System.out.println("enter the id of employee");
      int id = sc.nextInt();
      System.out.println("enter name of employee");
      String name = sc.next();
      System.out.println("enter the salary of employee");
      double salary = sc.nextDouble();
      emp[i] = new Employee(id, name, salary);
    }

    System.out.println("Employee Information");
    for (int i = 0; i < 5; i++) {
      emp[i].display();
      System.out.println("enter the value of hra and da ");
      emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
    }

  }
}