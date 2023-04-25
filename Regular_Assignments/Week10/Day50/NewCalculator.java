interface Calculator {
  int add(int a, int b);

  int subtract(int a, int b);

  int multiply(int a, int b);

  int divide(int a, int b);
}

class BasicCalculator implements Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("it can't be divided");
    }
    return a / b;
  }
}

class NewCalculator {
  public static void main(String args[]) {
    Calculator cal = new BasicCalculator();
    int a = 5, b = 18;
    System.out.println("addition is:-" + cal.add(a, b));
    System.out.println("subtracted is:-" + cal.subtract(a, b));
    System.out.println("multiplied is:-" + cal.multiply(a, b));
    System.out.println("divided is:-" + cal.divide(a, b));

  }
}