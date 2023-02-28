import java.util.Scanner;

class Usingreturnanddisplay{
  static void insert(int size,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<size;i++){
      a[i]=sc.nextInt();
    }
  }
  static int[] display(int n,int abc[]){
    return abc;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    int a[]=new int[n];
    insert(n,a);
    int b[]= display (n,a);
    for (int i=0;i<n;i++){
      System.out.println(b[i]);
    }
    
  }
}