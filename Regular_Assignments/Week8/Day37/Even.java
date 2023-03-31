import java.util.*;

class Even {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(6);
    numbers.add(8);
    numbers.add(10);
    ArrayList<Integer> squaredNumbers = even(numbers);
    System.out.println("The squared numbers in the list are: " + squaredNumbers);
  }

  public static ArrayList<Integer> even(ArrayList<Integer> numbers) {
    ArrayList<Integer> squaredNumbers = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      int num = numbers.get(i);
      squaredNumbers.add(num * num);
    }
    return squaredNumbers;
  }
}