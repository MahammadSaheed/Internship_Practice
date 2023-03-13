class Animal {
  String color;
  String name;

  void walk() {
    System.out.println("the dog is walking");
    System.out.println("name= " + name + " color = " + color);
  }
}

class Dog extends Animal {
  int legs;

  void bark() {
    System.out.println("the dog is barking");
    System.out.println("no.of legs=" + legs);
  }
}

class Babydog extends Dog {
  int age;

  void sleep() {
    System.out.println("the dog is sleeping");
    System.out.println("age=" + age);
  }
}

class MultiLevel{
  public static void main(String args[]) {
    Babydog bdog = new Babydog();
    bdog.name = "pinky";
    bdog.color = "white";
    bdog.legs = 7;
    bdog.age = 5;
    bdog.walk();
    bdog.bark();
    bdog.sleep();
  }
}