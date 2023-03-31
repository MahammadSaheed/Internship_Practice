import java.util.*;

class Employee {
  int e_id;
  String e_name, e_address, position;
  double salary;

  Employee(int e_id, String e_name, String e_address, String position, double salary) {
    this.e_id = e_id;
    this.e_name = e_name;
    this.e_address = e_address;
    this.position = position;
    this.salary = salary;
  }
}

class EmployeeArrayList {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> e = new ArrayList<Employee>();
    System.out.println("enter 3 employees details");
    for (int i = 0; i < 3; i++) {
      e.add(new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble()));
    }
    for (Employee emp : e) {
      System.out.println("Employee ID:" + emp.e_id + "\n" + "Name: " + emp.e_name + "\n" + "Employee address:"
          + emp.e_address + "\n" + "Position:" + emp.position + "\n" + "Salary:\n" + emp.salary + "\n");
    }
  }
}