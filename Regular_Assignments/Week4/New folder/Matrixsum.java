import  java.util.Scanner;

class Matrixsum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows");
    int r=sc.nextInt();
    System.out.println("enter the columns");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    int sum[][] =new int [r][c];
    System.out.println("enter the  first matrix ");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("enter the second matrix ");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("enter the sum of matrix");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sum[i][j]=a[i][j]+b[i][j];
        System.out.print(sum[i][j]);
      }
      System.out.println();
    }
    
      }
}