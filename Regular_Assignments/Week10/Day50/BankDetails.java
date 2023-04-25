abstract class Bank {
  abstract void rateOfInterest();

  void bankName() {
    System.out.println("Bank");
  }
}

class SBI extends Bank {
  public void rateOfInterest() {
    System.out.println("rate of interest is 8rs");
  }
}

class Axis extends Bank {
  public void rateOfInterest() {
    System.out.println("rate of interest is 9rs");
  }
}

class BankDetails {
  public static void main(String args[]) {
    Bank bank = new SBI();
    bank.rateOfInterest();
  }
}