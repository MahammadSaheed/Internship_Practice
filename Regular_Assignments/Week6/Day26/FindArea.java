class Shape {
  double getArea() {
    return 0.0;
  }
}

class Circle extends Shape {
  double getArea() {
    int r = 5;
    double area;
    area = (3.14) * (r * r);
    return area;
  }
}

class Rectangle extends Shape {
  double getArea() {
    int l = 7, b = 9;
    double area;
    area = (l * b);
    return area;
  }
}

class FindArea {
  public static void main(String args[]) {
    Rectangle rec = new Rectangle();
    Circle cir=new Circle();
    System.out.println("area is "+rec.getArea());
    System.out.println("area is "+cir.getArea());
  }
}