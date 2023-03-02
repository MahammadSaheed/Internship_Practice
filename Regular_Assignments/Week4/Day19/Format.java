import java.util.*;

class Format {
  public static void main(String args[]) {
    float n1 = 23.34f, n2 = 45.7f;
    float result = n1 + n2;
    String result1 = String.format("%12.2f,%1.2f", result, result);
    
    System.out.println(result1);
    String result2 = String.format("%12.2f,%1.2f", result, result);
    System.out.println(result2);
  }
}