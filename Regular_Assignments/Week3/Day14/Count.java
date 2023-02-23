import java.util.Scanner;

class Count {
  public static void main(String args[]){
    int a[]={3,-4,-7,9,2,-8};
    int even_count=0,odd_count=0;
    System.out.println("enter the stored values ");
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
      even_count++;
      }
      else{
       odd_count++;
      }
    }
      System.out.println("the even number:-"+even_count);
    System.out.println("the odd number:-"+odd_count);
  }
}