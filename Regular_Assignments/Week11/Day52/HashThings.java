import java.util.*;

class HashThings{
  public static void main(String args[]){
    HashSet<Integer> number=new HashSet<>();
    number.add(10);
    number.add(20);
    number.add(30);
    number.add(40);
    number.add(50);
    for(int  num:number){
      System.out.println(num);
    }
  }
}