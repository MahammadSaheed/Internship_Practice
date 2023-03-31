import java.util.HashMap;

class AddingHash {
  public static void main(String args[]) {
    HashMap<String, Integer> player = new HashMap<String, Integer>();
    player.put("Cristiano", 7);
    player.put("Messi", 10);
    player.put("Dybala", 11);
    player.put("Lewandowski", 9);

    System.out.println(player);
  }
}