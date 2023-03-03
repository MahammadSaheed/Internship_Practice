import java.util.*;

public class Arrayrotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter how many times you should rotates");
    int n = sc.nextInt();
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int j, last;
      last = arr[arr.length - 1];
      for (j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = last;
    }
    System.out.println();
    System.out.println("Array after right rotation: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}