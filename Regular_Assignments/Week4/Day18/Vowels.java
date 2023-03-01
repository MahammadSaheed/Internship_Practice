import java.util.Scanner;

class Vowels{
  static void checkString(String str1,String subString){
    if(str1.contains(subString)){
     for(int i=0;i<subString.length()-1;i++){
       if(subString.charAt(i)=='a' || subString.charAt(i)=='e' || subString.charAt(i)=='i' || subString.charAt(i)=='o' ||subString.charAt(i)=='u'){
         System.out.println(subString.charAt(i));
       }
     }
    }
      else{
      System.out.println("its not valid");
      }
     }
  public static void main(String args[]){

    checkString("welcome to bitlabs","bitlabs");
  }
}