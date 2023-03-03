import java.util.*;

class Indexof {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size = sc.nextInt();
    int a[] = new int[size];
    System.out.println("enter the elements of array");
    for (int i = 0; i < size; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("enter the value");
    int value = sc.nextInt();
    for (int i = 0; i < size; i++) {
      if (a[i] == value)
        System.out.print(i);
    }
  }
}