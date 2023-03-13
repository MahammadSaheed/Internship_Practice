class Person {
  String name;
  int age;
  String address;

  void display() {
    System.out.println("name=" + name + " " + "age=" + age + " " + "address=" + " " + address);
  }
}

class Employee extends Person {
  String job_role;

  void show() {
    System.out.println("the job role of employee is :-" + job_role);
  }
}

class SingleInheritance {
  public static void main(String args[]) {
    Employee emp = new Employee();
    emp.name = "shaiduu";
    emp.age = 21;
    emp.address = "bahrain";
    emp.job_role = "developer";
    emp.display();
    emp.show();

  }
}