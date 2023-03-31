import java.util.*;

class Shopping{
  Scanner sc=new Scanner(System.in);
  ArrayList<String> gadgets= new ArrayList<String>();
  void add(){
    gadgets.add("phones");
    gadgets.add("laptops");
    gadgets.add("headphones");
    gadgets.add("ps5");
  }
  void remove(){
    gadgets.remove(2);
  }
  void display(){
    System.out.println(gadgets);
  }
}
public class ShoppingCart{
  public static void main(String args[]){
    Shopping shoppy=new Shopping();
    shoppy.add();
    shoppy.remove();
    shoppy.display();
  }
}