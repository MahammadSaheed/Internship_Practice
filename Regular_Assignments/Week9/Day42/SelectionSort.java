import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;

        }
      }
      System.out.print(a[i] + "  ");
    }
  }
}


// class BubbleSort{
//   public static void main(String args[]){
//     int[] arr ={10,30,50,20,15};
//     int temp=0;
//     for(int i=0; i<arr.length-1; i++){
//       for(int j=0; j<arr.length-i-1; j++){
//             if(arr[j]>arr[j+1]){
//         temp=arr[j];
//         arr[j]=arr[j+1];
             
//         arr[j+1]=temp;
//         }
//       }
//     }
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
// }

