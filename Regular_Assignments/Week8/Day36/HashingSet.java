import java.util.HashSet;
public class HashingSet{
  public static void main(String args[]){
    HashSet<String> set=new HashSet<String>();
    System.out.println("the colours are")
    set.add("red");
    set.add("yellow");
    set.add("green");
    set.add("violet");
    set.add("violet");
    set.add("pink");
    System.out.println(set);
  }
}