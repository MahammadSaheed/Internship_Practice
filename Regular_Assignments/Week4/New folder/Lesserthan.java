import java.util.Scanner;

class Lesserthan{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows");
    int n=sc.nextInt();
    System.out.println("enter the columns");
    int m=sc.nextInt();
    int count=0;
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(a[i][j]==20 || a[i][j]<10){
          if(a[i][j]<10){
            count++;
        }
        }
      }
    }
    System.out.println(count);
  }
}