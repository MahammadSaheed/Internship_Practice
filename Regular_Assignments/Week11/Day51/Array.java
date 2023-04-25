import java.util.*;
class Array{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> name=new ArrayList<String>();
    name.add("me");
    name.add("who");
    name.add("he");
    name.add("not");
    name.add("alsome");
    for(String names:name){
      System.out.println(names);
    }
  }
}