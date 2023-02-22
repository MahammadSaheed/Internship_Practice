import java.util.Scanner;

class Name {
  public static void main(String args[]){
    Scanner  sc=new Scanner(System.in);
    boolean valid=true;
    do{
        System.out.println("enter the name");
      String  name=sc.next();
      if(name.length()>5){
        System.out.println("valid name");
        valid=false;
      }
      else{
        System.out.println("invalid name re enter the name");
      }
    }while(valid);
  }
}