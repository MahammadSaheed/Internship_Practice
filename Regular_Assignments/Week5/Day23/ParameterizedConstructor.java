class ParameterizedConstructor{
  int roll;
  String name,place;

  ParameterizedConstructor(int r,String n,String p){
    roll=r;
    name=n;
    place=p;
  }

  void display(){
    System.out.println("student details " +roll+" "+name+" "+place);
  }
  public static void main(String args[]){
    ParameterizedConstructor s=new ParameterizedConstructor(10,"shaiduu","mangalore");
    s.display();
  }
}