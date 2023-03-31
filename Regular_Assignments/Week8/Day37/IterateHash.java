import java.util.HashMap;
import java.util.Map;

class IterateHash{
  public static void main(String args[]){
    Map<String,Integer> places=new HashMap<>();
    places.put("paris", 1);
    places.put("shimla", 2);
    places.put("sharjah", 3);
    places.put("wayand", 4);
    for(int value:places.values()){
      System.out.println(value);
    }
  }
}