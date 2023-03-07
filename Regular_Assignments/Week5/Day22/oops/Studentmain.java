class Student {
  int id;
  String name;
  String branch;
  double sub1, sub2, sub3;

  void average() {
    double avg = (sub1 + sub2 + sub3) / 3;
    System.out.println("name of the student:- " + name + "\n average of the student is:- " + avg);
  }

  void percentage() {
    double totalmarks = sub1 + sub2 + sub3;
    double per = (totalmarks / 300) * 100;
    System.out.println("name of the student:-" + name + "\n the percentage is:-" + per);
  }
}

class Studentmain {
  public static void main(String args[]) {
    Student s1 = new Student();
    s1.id = 23;
    s1.name = "saheed";
    s1.branch = "cse";
    s1.sub1 = 70;
    s1.sub2 = 59;
    s1.sub3 = 57;
    s1.average();
    s1.percentage();
    Student s2 = new Student();
    s2.id = 21;
    s2.name = "antony";
    s2.branch = "cse";
    s2.sub1 = 88;
    s2.sub2 = 98;
    s2.sub3 = 34;
    s2.average();
    s2.percentage();
  }
}