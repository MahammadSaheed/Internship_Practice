import java.util.*;
public class Iterate {
    public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (String name : names) {
            System.out.println(name);
        }
    }

}