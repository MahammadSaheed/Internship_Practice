class Demo{
  protected int price;
   int pid;
}
class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}
class AccessSpecifier{
  public static void main(String args[]){
    Demo1 d=new Demo1();
    d.price=20;
    d.display();
  }
}