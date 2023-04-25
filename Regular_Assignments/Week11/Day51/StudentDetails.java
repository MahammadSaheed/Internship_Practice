import java.util.*;
class Student{
  String name;
  String grade;
  Student(String name,String grade){
    this.name=name;
    this.grade=grade;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
  public StringToString(){
    return name+" "+grade;
  }
}
class StudentDetails{
  void insert(ArrayList<Student>student){
  Scanner sc = new Scanner(System.in);
    for(int i=0;i<2;i++){
      student.add(new Student(sc.next(),sc.next()));
    } }
  void remove(ArrayList<Student>student){
    student.remove(0);
  }
  void display(ArrayList<Student>student){
   for(Student students:student){
     System.out.println(students);
   }
  }
  public static void main(String args[]){
   ArrayList<Student> student = new ArrayList<Student>();
  StudentDetails std=new StudentDetails();
      Scanner sc = new Scanner(System.in);
    // std.insert(student);
    // std.remove(student);
    // std.display(student);
    int choice;
    do{
      System.out.println("enter your choice");
      System.out.println("1.add the name");
      System.out.println("2.delete the name");
      System.out.println("3.display the name");
      System.out.println("4.quit");
      choice=sc.nextInt();
      switch(choice){
        case 1:{
          students.insert(student);
          break;
        }
        case 2:{
          students.remove(student);
          break;
        }
          case 3:{
          students.display(student);
          break;
        }
          case 4:{
          System.out.println("thank you");
          break;
        }
      }
    }while(choice!=4);
  }
}