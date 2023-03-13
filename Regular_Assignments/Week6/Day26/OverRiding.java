class Bank {
  void intrest() {
    System.out.println("rate of interest is 10rs");
  }
}

class SBI extends Bank {
  void interest() {
    System.out.println("12rs");
  }
}

class HDFC extends Bank {
  void interest() {
    super.intrest();
    System.out.println("14rs");
  }
}

class OverRiding {
  public static void main(String args[]) {
    HDFC hdfc = new HDFC();
    hdfc.interest();
  }
}