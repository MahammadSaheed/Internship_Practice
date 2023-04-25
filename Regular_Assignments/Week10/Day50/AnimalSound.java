class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog make sound like bow bow");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat make sound like meows");
    }
}

class Cow extends Animal {
    public void makeSound() {
        System.out.println("The cow make sound moos");
    }
}

 class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
