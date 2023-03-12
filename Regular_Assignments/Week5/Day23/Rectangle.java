import java.util.*;

class Rectangle {
  int length;
  int width;

  Rectangle() {
    length = 12;
    width = 9;
  }

  void calculate() {
    double area = length * width;
    System.out.println("the area of rectangle is :-" + area);
    double perimeter = 2 * (length + width);
    System.out.println("the perimeter of rectangle is :-" + perimeter);
  }

  void display() {
    System.out.println("the length of rectangle is :-" + length);
    System.out.println("the width of rectangle is :-" + width);
  }

  public static void main(String args[]) {
    Rectangle rec = new Rectangle();
    rec.calculate();
    rec.display();
  }
}
