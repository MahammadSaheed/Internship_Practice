import java.util.Scanner;

class SubString{
  static void checkString(String str1,String subString){
    if(str1.contains(subString)){
      System.out.println(" its valid");
      System.out.println(subString.length());
    }
      else{
      System.out.println("its not valid");
      }
     }
  public static void main(String args[]){
   Scanner sc=new Scanner (System.in);
    String str1,SubString;
    System.out.println("enter the first string");
    str1=sc.nextLine();
    System.out.println("enter the second string");
    SubString=sc.nextLine();

    checkString(str1,SubString);
  }
}