import java.util.HashMap;
import java.util.Map;

class EntryHash {
  public static void main(String args[]) {
    Map<String, Integer> car = new HashMap<>();
    car.put("bucati", 1);
    car.put("mini cooper", 2);
    car.put("lamborghini", 3);
    car.put("Porsche", 4);
    for (Map.Entry<String, Integer> entry : car.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println("The collection:" + key + ",Value:" + value);
    }
  }
}