class demo {
  private int n = 10;
}

class demo1 extends demo {
  protected int n = 10;
}

public class PrivateAccessSpecifier {
  public static void main(String args[]){
    demo num = new demo();
    demo1 num1 = new demo1();
    System.out.println(num1.n);
  }