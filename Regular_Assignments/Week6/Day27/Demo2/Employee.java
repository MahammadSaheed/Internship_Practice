public class Employee {
  private String name;
  private int eid;
  private double salary;
  private String dept;
  void setName(String name) {
    this.name = name;
  }
  void setEid(int eid) {
    this.eid = eid;
  }

  void setSalary(double salary) {
    this.salary = salary;
  }

  void setDept(String dept) {
    this.dept = dept;
  }
   String getName() {
    return this.name;
  }
  int getEid() {
    return this.eid;
  }

double getSalary() {
    return this.salary;
  }

  String getDept() {
    return this.dept;
  }
}
