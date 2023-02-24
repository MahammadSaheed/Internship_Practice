import java.util.Scanner;

class Array {
  public static void main(String args[]) {
    int arr[] = { 23, 45, 34, 32, 78 };
    System.out.println("enter the 3rd index:-" + arr[3]);
    System.out.println(arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}