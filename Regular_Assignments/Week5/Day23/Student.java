class Student{
  int rolno;
  String name;
  String branch;
Student(){
  rollno=2;
  name="shaiduu";
  branch="cse";
  }
  void display(){
    System.out.println(rollno+ " "+ name +" "+ branch);
  }
}
class DefaultConstructor{
  public static void main(String args[]){
    Student st = new Student();
    st.display();
  }
}