import java.util.*;
public class ArrayIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(5);
        num.add(18);
        num.add(2);
        num.add(17);
  Collections.sort(num);
        System.out.println("The list in ascending order is:");
        for (int n : num) {
            System.out.println(n + " ");
        }
    }
}