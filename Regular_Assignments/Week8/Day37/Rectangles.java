import java.util.*;

class Rectangle {
  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double calculateArea() {
    return length * width;
  }
}

class Rectangles {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
    for (int i = 0; i < 2; i++) {
      System.out.println("Enter value for rectangle " + (i + 1) + " :");
      System.out.println("enter the length of rectangle");
      double length = sc.nextDouble();
      System.out.println("enter the width of rectangle");
      double width = sc.nextDouble();
      rec.add(new Rectangle(length, width));
    }
    for (Rectangle rectangle : rec) {
      System.out.println("length is " + rectangle.length + "\twidth is" + rectangle.width);
    }
    for (Rectangle rectangle : rec) {
      if (rectangle.length == 2.5) {
        rec.remove(rec.indexOf(rectangle));
      }
    }
    for (Rectangle rectangle : rec) {
      System.out.println("length is " + rectangle.length + "\twidth is" + rectangle.width);
    }
  }
}
