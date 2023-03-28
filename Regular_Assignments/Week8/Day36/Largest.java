import java.util.*;
import java.util.Collections;

class Largest {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(25);
    numbers.add(7);
    numbers.add(32);
    numbers.add(15);
    numbers.add(27);
    int largest = Largest(numbers);
    System.out.println("The largest number in the list is: " + largest);
  }

  public static int Largest(ArrayList<Integer> numbers) {
    Collections.sort(numbers);
    int largest = numbers.get(numbers.size() - 1);

    return largest;
  }
}