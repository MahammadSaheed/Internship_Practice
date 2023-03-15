public class Greetings {
  public static void main(String[] args) {
    Employee e = new Employee();
    e.setName("shaiduu");
    e.setEid(21);
    e.setSalary(25000);
    e.setDept("developer");
    System.out.println(e.getName() + " " + e.getEid() + " " + e.getSalary() + " " + e.getDept());
  }
}
