import java.util.*;

class Car {
  String make;
  String model;
  String color;
  int year;

  Car() {
    make = "volkswagon";
    model = "Audi A4";
    color = "black";
    year = 1994;

  }

  public void display() {
    System.out.println("The maker of Car:-" + make);
    System.out.println("The model of car is:-" + model);
    System.out.println("The color of the car:-" + color);
    System.out.println("The year of this car:-" + year);
  }

  public static void main(String args[]) {
    Car c1 = new Car();
    c1.display();
  }
}