import java.util.Scanner;

class Withreturn{
  static int sum(){
    int a,b;
    a=10;b=20;
    
    return a+b;
  }
  public static void main(String args[]){
      int sum= Withreturn.sum();
    System.out.println(sum);
  }