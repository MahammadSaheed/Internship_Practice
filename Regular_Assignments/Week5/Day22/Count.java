import java.util.StringTokenizer;

class Count {
  public static void main(String[] args) {
    StringTokenizer str = new StringTokenizer("Welcome to bitlabs and get ready job");
    System.out.println("Total tokens : " + 
       str.countTokens());
  }
}