import java.util.*;

class ArraySearch {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = sc.nextInt();
    int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
    System.out.println("Enter the index of element");
    int element = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (arr[i] == element) {
        System.out.println(arr[i]);
      }
    }
  }
}