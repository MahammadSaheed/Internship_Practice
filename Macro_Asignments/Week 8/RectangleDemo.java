// import java.util.*;

// class Area implements Comparable<Area>{
//   int l;
//   int b;
//  Area(int l,int b){
//     this.l=l;
//     this.b=b;
//   }
//  public int getArea(){
//    return l*b;
//  }
//   public int compareTo(Area a){
//     if(getArea()>a.getArea()){
//       return 1;
//     }
//     else if(getArea()<a.getArea()){
//       return -1;
//     }
//     else{
//       return 0;
//     }
// }
  
// class RectangleDemo{
//   public static void main(String args[]){
    
//   }
// }

import java.util.*;
class Rectangle implements Comparable<Rectangle> {
   double width;
   double height;
  
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double getWidth() {
    return width;
  }
  public double getHeight() {
    return height;
  }
  public double getArea() {
    return width * height;
  }
  
  public double getPerimeter() {
    return 2 * width + 2 * height;
  }
  
  public int compareTo(Rectangle r) {
    if (this.getPerimeter() < r.getPerimeter()) {
      return -1;
    } else if (this.getPerimeter() > r.getPerimeter()) {
      return 1;
    } else {
      return 0;
    }
  }
}
class AreaComparator implements Comparator<Rectangle> {
  public int compare(Rectangle r1, Rectangle r2) {
    if (r1.getArea() < r2.getArea()) {
      return -1;
    } else if (r1.getArea() > r2.getArea()) {
      return 1;
    } else {
      return 0;
    }
  }
}
class RectangleDemo {
  public static void main(String[] args) {
    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter width and height for 3 rectangles:");
    for (int i = 0; i < 3; i++) {
      double width = scanner.nextDouble();
      double height = scanner.nextDouble();
      rectangles.add(new Rectangle(width, height));
    }
    System.out.println("Sorted based on area:");
    Collections.sort(rectangles, new AreaComparator());
    for(Rectangle r: rectangles){
      System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight() +", Area:"+ r.getArea());
    }
    System.out.println("\nSorted based on perimeter:");
    Collections.sort(rectangles);
    for(Rectangle r: rectangles){
      System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight()+", ,Perimeter"+ r.getPerimeter());
    }
  }
}