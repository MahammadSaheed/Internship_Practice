abstract class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  abstract void move();

  void eat() {
    System.out.println(name + " is eating something ");
  }

  String getName() {
    return name;
  }
}

class Dog extends Animal {
  Dog(String name) {
    super(name);
  }

  void move() {
    System.out.println(name + " is running by all four legs");
  }
}

class Birds extends Animal {
  Birds(String name) {
    super(name);
  }

  void move() {
    System.out.println(name + " flying through the wings");
  }
}

class AnimalDetails {
  public static void main(String args[]) {
    Dog dog = new Dog("roger");
    Birds birds = new Birds("lavender");
    dog.move();
    dog.eat();
    birds.move();
    birds.eat();
  }
}