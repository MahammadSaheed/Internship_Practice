class Mammals {
  void speak() {
    System.out.println("the animal speaks");
  }
}

class Lion extends Mammals {
  public void speak() {
    System.out.println("Dog barks");
    super.speak();
  }
}

public class SuperAnimal {
  public static void main(String[] args) {
    Lion d = new Lion();
    d.speak();
  }
}