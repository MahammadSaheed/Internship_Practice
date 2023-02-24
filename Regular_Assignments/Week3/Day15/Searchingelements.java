import java.util.Scanner;

class Searchingelements{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n Value");
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
    System.out.println("enter the element that you want to search");
    int search=sc.nextInt();
    int count=0;
    for(int j=0;j<n;j++){
      if(search==a[j]){
        count++;
        System.out.println("the sreached value is:-"+j);
      }
      if(count==0){
        System.out.println("failed to found");
      }
    }
  }
}
