interface operation {
  void add();

  void sub();

  void mul();

  void div();
}

class Calculator implements operation {
  public void add() {
    int a = 10, b = 20;
    System.out.println(a + b);
  }

  public void sub() {
    int a = 10, b = 20;
    System.out.println(a - b);
  }

  public void mul() {
    int a = 10, b = 20;
    System.out.println(a * b);
  }

  public void div() {
    int a = 10, b = 20;
    System.out.println(a / b);
  }
}

class Interface {
  public static void main(String args[]) {
    operation opt = new Calculator();
    opt.add();
    opt.sub();
    opt.mul();
    opt.div();
  }
}