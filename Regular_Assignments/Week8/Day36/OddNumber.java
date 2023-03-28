import java.util.*;

public class OddNumber {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(25);
    numbers.add(7);
    numbers.add(32);
    numbers.add(15);
    numbers.add(27);
    ArrayList<Integer> oddNumbers = findOddIntegers(numbers);
    System.out.println("The odd numbers in the list are: " + oddNumbers);
  }

  public static ArrayList<Integer> findOddIntegers(ArrayList<Integer> numbers) {
    ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      int num = numbers.get(i);
      if (num % 2 != 0) {
        oddNumbers.add(num);
      }
    }
    return oddNumbers;
  }
}