import java.util.Scanner;

class Twoequalmatrices{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int r=sc.nextInt();
    System.out.println("Enter no of columns");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    boolean equals=true;
    System.out.println("Enter a matrix of A");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Enter a matrix of B");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(a[i][j]!=b[i][j]){
          equals=false;
          break;
        }
      }
      if (equals) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
  }