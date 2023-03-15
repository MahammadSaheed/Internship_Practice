import java.util.Scanner;
interface AnimalTest {
    void speak();
    void eat();
}

class Dog implements AnimalTest {
    public void speak() {
        System.out.println("Bow bow!");
    }

    public void eat() {
        System.out.println("Eating bones");
    }
}

class Cat implements AnimalTest {
    public void speak() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Eating fish");
    }
}

class Cow implements AnimalTest {
    public void speak() {
        System.out.println("Moo!");
    }

    public void eat() {
        System.out.println("Eating grass");
    }
}

public class Animal {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String animalType = sc.next();
      AnimalTest animal;
        switch (animalType.toUpperCase()) {
            case "DOG":
                animal = new Dog();
                break;
            case "CAT":
                animal = new Cat();
                break;
            case "COW":
                animal = new Cow();
                break;
            default:
                System.out.println("Invalid animal type");
                return;
        }
        animal.speak();
        animal.eat();
    }
}