import java.util.*;
class ArraySum{
    public static int sumOfArray(ArrayList<Integer> sample) {
        int sum = 0;
        for (Integer s : sample) {
            sum =sum + s;
        }
        return sum;
    }
  public static void main(String[] args){
    ArrayList<Integer> suming = new ArrayList<>();
    ArraySum a=new ArraySum();
    suming.add(1);
    suming.add(2);
    suming.add(3);
    suming.add(4);
    suming.add(5);
    System.out.println(a.sumOfArrList(suming));
    
    
  }
}