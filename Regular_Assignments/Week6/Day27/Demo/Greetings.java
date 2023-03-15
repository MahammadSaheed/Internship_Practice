public class Greetings {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Students st = new Students();
    st.setRollno(1234);
    st.setName("lalitha");
    st.setDept("CSE");
    st.setSection('c');
    System.out.println(st.getRollno() + " " + st.getName() + " " + st.getDept() + " " + st.getSection());
  }
}