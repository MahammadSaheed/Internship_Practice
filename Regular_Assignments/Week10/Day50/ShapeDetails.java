abstract class Shape {
  abstract double getArea();

  abstract double getPerimeter();

  void shapeName() {
    System.out.println("shape");
  }
}

class Square extends Shape {
  double side;

  Square(double side) {
    this.side = side;
  }

  double getArea() {
    return side * side;
  }

  double getPerimeter() {
    return 4 * side;
  }
}

class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return length * width;
  }

  double getPerimeter() {
    return 2 * (length + width);
  }
}

class ShapeDetails {
  public static void main(String args[]) {
    Shape square = new Square(5);
    System.out.println("the area of square is" + square.getArea());
    System.out.println("the perimeter of square is" + square.getPerimeter());

    Shape rectangle = new Rectangle(4, 7);
    System.out.println("area of rectangle is"
        + rectangle.getArea());
    System.out.println("perimeter of rectangle is" + rectangle.getPerimeter());
  }
}