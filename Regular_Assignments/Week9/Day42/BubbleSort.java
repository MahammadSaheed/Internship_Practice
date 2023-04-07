// class BubbleSort{
//   public static void main(String args[]){
//     int a[]={50,20,10,5,30};
//     int temp;
//     for(int i=0;i<a.length;i++){
//       for(int j=0;j<a.length-1-i;j++){
//         if(a[j]>a[j+1]){
//         temp=a[j];
//         a[j]=a[j+1];
//         a[j+1]=temp;
//         }
//       }
//     }
//     System.out.println("Sorted array is:");
//     for(int i=0;i<a.length;i++){
//       System.out.print(a[i]+" ");
//     }
//   }
// }

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}