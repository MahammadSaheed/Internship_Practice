import java.util.Scanner;

class Readanddisplay{
 static void create (int n,int a[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array elements");
   for(int i=0;i<n;i++){
     a[i]=sc.nextInt();
   }
 }
  static void display(int a[]){
    for(int i=0;i<5;i++)
    System.out.println(a[i]);
    
  }
  public static void main(String args[]){
     int a[]=new int[50];
    create(5,a);
    display(a);
  }
}