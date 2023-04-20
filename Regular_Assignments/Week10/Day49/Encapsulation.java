class Employee {
  private String name;
  private int id;
  private String dept;

  Employee(String name, int id, String dept) {
    this.name = name;
    this.id = id;
    this.dept = dept;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }
}

public class Encapsulation {
  public static void main(String args[]) {
    Employee e1 = new Employee("saheed", 21, "developer");
    System.out.println("name :-" + e1.getName());
    System.out.println("id :-" + e1.getId());
    System.out.println("dept :-" + e1.getDept());
  }
}