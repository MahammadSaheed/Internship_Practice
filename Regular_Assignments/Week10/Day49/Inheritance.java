// animal
//   color
//   nooflegs
// dog --animal

//   bark()

// babydog ==dog

//   weep()

//   cat-->animal

//   meow()
class Animal {
  String name;
  String colour;
  int no_of_legs;
  // Animal(String name,String colour,int no_of_legs){
  // this.name=name;
  // this.colour=colour;
  // this.no_of_legs=no_of_legs;
  // }
}

class Dog extends Animal {
  public void bark() {
    System.out.println(name + "running by" + no_of_legs + "with" + colour);
  }
}

class BabyDog extends Dog {
  public void weep() {
    System.out.println("the baby is weeping");
  }
}

class Cat extends Animal {
  public void meow() {
    System.out.println("the cat is saying meow");
  }
}

class Inheritance {
  public static void main(String args[]) {
    Dog dog = new Dog();
    dog.name = "kutta";
    dog.no_of_legs = 4;
    dog.colour = "black";
    dog.bark();
    BabyDog bdog = new BabyDog();
    bdog.weep();
    Cat cat = new Cat();
    cat.meow();
  }
}
